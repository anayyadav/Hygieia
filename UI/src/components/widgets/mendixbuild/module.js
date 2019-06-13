(function () {
    'use strict';

    var widget_state,
        config = {
            view: {
                defaults: {
                    // widget title
                    title: 'Mendix Build' 

                },
                controller: 'BuildmWidgetViewController',
                controllerAs: 'buildmView',
                templateUrl: 'components/widgets/mendixbuild/view.html'
            },
            config: {
                controller: 'BuildmWidgetConfigController',
                controllerAs: 'buildmConfig',
                templateUrl: 'components/widgets/mendixbuild/config.html'
            },
            getState: getState,
            collectors: ['mendixbuild']
        };

    angular
        .module(HygieiaConfig.module)
        .config(register);

    register.$inject = ['widgetManagerProvider', 'WidgetState'];
    function register(widgetManagerProvider, WidgetState) {
        widget_state = WidgetState;
        widgetManagerProvider.register('mendixbuild', config);
    }

    function getState(config) {
        // make sure config values are set
        return HygieiaConfig.local || config.id ?
            widget_state.READY :
            widget_state.CONFIGURE;
    }
})();
