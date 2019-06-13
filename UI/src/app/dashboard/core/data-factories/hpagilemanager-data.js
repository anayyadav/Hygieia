/**
 * Gets deploy related data
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module + '.core')
        .factory('hpamData', hpamData);

    function hpamData($http) {
        var hpamDetailRoute = '/api/hpam/data/';

        return {
            details: details
        };

        function details(componentId) {
            return $http.get( hpamDetailRoute )
                // .then(
                //     function (response) {
                //     return response.data;
                // });
        }
    }
})();