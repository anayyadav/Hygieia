/**
 * Detail controller for the build widget
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module)
        .controller('BuildmWidgetDetailController', BuildmWidgetDetailController);

    BuildmWidgetDetailController.$inject = ['$scope', '$uibModalInstance', 'build'];
    function BuildmWidgetDetailController($scope, $uibModalInstance, build) {
        var ctrl = this;

        ctrl.build = build;
        ctrl.buildUrlNiceName = buildUrlNiceName;
        ctrl.buildPassed = buildPassed;
        ctrl.close = close;

        function buildUrlNiceName() {
            
                return "Mendix";
            
        }

		

        function buildPassed() {
            return ctrl.build.buildStatus === 'Succeeded';
        }

        function close() {
            $uibModalInstance.dismiss('close');
        }
    }
})();
