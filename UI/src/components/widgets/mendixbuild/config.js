/**
 * Build widget configuration
 */
(function () {
    'use strict';
    angular
        .module(HygieiaConfig.module)
        .controller('BuildmWidgetConfigController', BuildmWidgetConfigController);
    BuildmWidgetConfigController.$inject = ['modalData', '$scope', 'mendixData', '$uibModalInstance'];
    function BuildmWidgetConfigController(modalData, $scope, mendixData, $uibModalInstance) {
        var ctrl = this,
        widgetConfig = modalData.widgetConfig;
        ctrl.buildDurationThreshold = 3;
        ctrl.buildConsecutiveFailureThreshold = 5;
        ctrl.selectappname = null;
        ctrl.mendixNuildUniqueIds = {
            appname: [],
            selectappname: ''
        };
        
        ctrl.load = function () {
            mendixData.details(widgetConfig.options.id).
                then(function (data) {
                    ctrl.mendixNuildUniqueIds.appname = [...new Set(data.data[0].buildApiDetails.map(item => item.appname))];
                    
                })
        };


        ctrl.submit = submitForm;


        function submitForm(valid, collector) {
            if (valid) {
                $scope.$emit('eventEmitedName');
                var form = document.buildConfigForm;
                var postObj = {
                    name: 'mendixbuild',
                    options: {
                        id: widgetConfig.options.id,
                        appname: ctrl.selectappname
                    },
                    componentId: modalData.dashboard.application.components[0].id
                };
                // pass this new config to the modal closing so it's saved
                $uibModalInstance.close(postObj);
            }
        }
    }
})();
