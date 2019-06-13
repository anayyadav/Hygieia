/**
 * Controller for the dashboard route.
 * Render proper template.
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module)
        .controller('CapOneTemplateController', CapOneTemplateController);

    function CapOneTemplateController() {
        var ctrl = this;

        ctrl.tabs = [
            { name: "Widget"},
            { name: "Pipeline"},
            { name: "Cloud"}
        ];


        ctrl.minitabs = [
            { name: "Performance"},
			{ name: "Quality"}
        ];

        ctrl.miniFeaturetabs = [
            { name: "Story Cards"},
            { name: "Team"}

        ];
		
		ctrl.minicoderepo = [
            { name: "Code Repo1"},
			{ name: "Code Repo2"}
        ];

		ctrl.minibuildtabs = [
            { name: "Job1"},
			{ name: "Job2"}
        ];
        ctrl.widgetView = ctrl.tabs[0].name;
        ctrl.toggleView = function (index) {
            ctrl.widgetView = typeof ctrl.tabs[index] === 'undefined' ? ctrl.tabs[0].name : ctrl.tabs[index].name;
        };

        ctrl.miniWidgetView = ctrl.minitabs[0].name;
        ctrl.miniToggleView = function (index) {
            ctrl.miniWidgetView = typeof ctrl.minitabs[index] === 'undefined' ? ctrl.minitabs[0].name : ctrl.minitabs[index].name;
        };
		
		ctrl.codeWidgetView = ctrl.minicoderepo[0].name;
        ctrl.miniCodeToggleView = function (index) {
            ctrl.codeWidgetView = typeof ctrl.minicoderepo[index] === 'undefined' ? ctrl.minicoderepo[0].name : ctrl.minicoderepo[index].name;
        };
		
		ctrl.buildWidgetView = ctrl.minibuildtabs[0].name;
		ctrl.minibuildToggleView = function(index){
			ctrl.buildWidgetView = typeof ctrl.minibuildtabs[index] == 'undefined' ? ctrl.minicoderepo[0].name : ctrl.minibuildtabs[index].name;
		}

        ctrl.miniFeatureWidgetView = ctrl.miniFeaturetabs[0].name;
        ctrl.miniFeatureToggleView = function (index) {
            ctrl.miniFeatureWidgetView = typeof ctrl.miniFeaturetabs[index] === 'undefined' ? ctrl.miniFeaturetabs[0].name : ctrl.miniFeaturetabs[index].name;
        };

    }
})();
