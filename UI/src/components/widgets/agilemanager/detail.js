/**
 * Detail controller for the build widget
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module)
        .controller('AgileManagerDetailController', AgileManagerDetailController);

        AgileManagerDetailController.$inject = [ '$uibModalInstance','releaseforecast'];
    function AgileManagerDetailController($uibModalInstance1,  releaseforecast) {
        var ctrl = this;

		
		
		ctrl.lineOptions = {
            plugins: [
                Chartist.plugins.gridBoundaries(),
                Chartist.plugins.lineAboveArea(),
                Chartist.plugins.tooltip(),
                Chartist.plugins.pointHalo()
            ],
            showArea: false,
            lineSmooth: false,
            fullWidth: true,
            chartPadding: 7,
            axisX: {
			showLabel: true,
			textAnchor: 'middle'
            },
            axisY: {
                labelInterpolationFnc: function(value) {
                    return value === 0 ? 0 : ((Math.round(value * 100) / 100) + '');
                }
            }
        };
		
		ctrl.rfEvents = {
            'draw': draw
        };

        function draw(data) {
            if (data.type === 'bar') {
               
                    data.element._node.setAttribute('style', 'stroke: ' + '#800080' + '; stroke-width: ' + 10 + 'px');
                
            }
        }
		
		ctrl.load = function() {
			console.log(releaseforecast)
            ctrl.loadReleaseforecast();
            
        };
		
		ctrl.loadReleaseforecast = function(){
		
			var releaseForecastData=[];
			var startDate =releaseforecast[0]['startdate'];
			var todate =releaseforecast[0]['today'];
			var endDate= releaseforecast[0]['startdate'];
			
					
			releaseforecast.sort((val1, val2)=> {return new Date(val1.today) - new 
Date(val2.today)})
			releaseforecast.forEach((item) => {
				//startDate = item.startdate
				//endDate = item.enddate
				releaseForecastData.push({releaseScope: item.releasescope, doneSP: item.donesp, todayDate: item.today})
			})
			
			let storyPoints = [];
			let releaseSCOPE=[];
			let releases;
            let lables = [];
			lables.push(startDate);
			storyPoints.push(null);
			releaseSCOPE.push(null);
			releaseForecastData.forEach((item, index) => {
                storyPoints.push(item.doneSP);
				releaseSCOPE.push(item.releaseScope);
				releases =  item.releaseScope;
                lables.push(item.todayDate);
            });
			lables.push(endDate);
			releaseSCOPE.push(releases);
			storyPoints.push(null);
		
			ctrl.lineData = {
                    labels: lables,
                    series: [{
                        name: 'Release Scope',
                        data: releaseSCOPE
                    }, {
                        name: 'Done Story Points',
                        data: storyPoints
                    }]
                };
		}
        

        function close() {
            $uibModalInstance.dismiss('close');
        }
    }
})();
