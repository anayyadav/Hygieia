/**
 * Controller for the dashboard route.
 * Render proper template.
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module)
        .controller('MendixCloudTemplateController', MendixCloudTemplateController);

    MendixCloudTemplateController.$inject = [];
    function MendixCloudTemplateController() {
        var ctrl = this;

        ctrl.tabs = [
            { name: "Mendix Cloud"}
           ];

           ctrl.widgetView = ctrl.tabs[0].name;
           ctrl.toggleView = function (index) {
               ctrl.widgetView = typeof ctrl.tabs[index] === 'undefined' ? ctrl.tabs[0].name : ctrl.tabs[index].name;
           };
   
           

    }
})();
