/**
 * Detail controller for the build widget
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module)
        .controller('AgileManagerDetailController1', AgileManagerDetailController1);

        AgileManagerDetailController1.$inject = [ '$scope','$q','$uibModalInstance','HPAMdata'];
    function AgileManagerDetailController1($uibModalInstance,  HPAMdata) {
        var ctrl = this;
		var mydata = [];
		ctrl.releaseforecastOptions = {
            plugins: [
                Chartist.plugins.tooltip()
            ],
            stackBars: true,
            centerLabels: true,
            fullWidth: true,
            chartPadding: 7,
            axisY: {
                labelInterpolationFnc: function (value) {
                    return value === 0 ? 0 : ((Math.round(value * 100) / 100) + '');
                }
            }
        };

        ctrl.rfEvents = {
            'draw': draw
        };

        function draw(data) {
            if (data.type === 'bar') {
                data.element._node.setAttribute('style', 'stroke: ' + '#6495ed' + '; stroke-width: ' + 10 + 'px');
            }
        }
		
		function loadGraph(data,data3,lables){
		
		var barchart = {
                labels: lables,
                datasets: [{
                    label: "Velocity",
                    type: 'bar',
                    fill: true,
                    data: data,
                    stack: 'Stack 0',
                    borderColor: '#6495ed',
                    backgroundColor: '#6495ed'

                },{
                    label: "Average Velocity",
                    type: 'line',
                    fill: false,
                    stack: 'Stack 1',
                    borderColor: '#FFA500',
                    backgroundColor: '#FFA500',
                    data: data3
                }],
            };
			
			var ctx = document.getElementById("mychart1");
				console.log(ctx);
            var mychart = new Chart(ctx, {
                type: 'bar',
                data: barchart,
                options: {

                    //to get sharp edges instead of smooth curves
                    responsive: true,
                    title: {
                        display: true,
                        text: 'Sprint Velocity Chart'
                    },
                    tooltips: {
                        mode: 'index',
                        intersect: false,
                    },
                    scales: {
                        xAxes: [{
                            display: true,
                            stacked: true,
                            scaleLabel: {
                                display: true,
                                labelString: 'Sprints'
                            }
                        }],
                        yAxes: [{
                            display: true,
                            stacked: true,
                            scaleLabel: {
                                display: true,
                                labelString: 'Strory Points'
                            }
                        }]
                    },
                    elements: {
                        line: {
                            tension: 0
                        }
                    }
                }
            });
			}
		
				
		ctrl.load = function() {
            
			HPAMdata.details($scope.widgetConfig.componentId).
                then(function (data) {
                    mydata = angular.copy(data.data);
					
                });
			console.log(mydata)
			var dataList = [];
			
            HPAMdata.forEach((item) => {
                dataList.push({ spname: item.sprintname, donestorypoints: item.doneSP })
            })
			
            let data = [];
            let lables = [];
            let avg = 0;
            let expectedVelosity = 0;
            let count = 0
            dataList.forEach((item, index) => {
                data.push(item.donestorypoints);
                if (item.donestorypoints != 0) {
                    count = count + 1;
                }
                avg = avg + item.donestorypoints;
                lables.push(item.spname);
            });

            avg = avg / count;
            var data3 = [];
            data3.push(avg)
            for (var i = 0; i < lables.length - 1; i++) {
                if (i < count - 1) {
                    data3.push(avg);
                }
                else {
                    data3.push(null);
                }
            }
			
			loadGraph(data,data3,lables);
			ctrl.loadrfData = {
                labels: lables,
                series: [data]
            }
			            
        };
		
		
		        
        function close() {
            $uibModalInstance.dismiss('close');
        }
    }
})();
