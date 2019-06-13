/**
 * Gets deploy related data
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module + '.core')
        .factory('mendixData', mendixData);

    function mendixData($http) {
        var mendixDetailRoute = '/api/mendix/data/';

        return {
            details: details
        };

        function details(componentId) {
            return $http.get( mendixDetailRoute )
                // .then(
                //     function (response) {
                //     return response.data;
                // });
        }
    }
})();