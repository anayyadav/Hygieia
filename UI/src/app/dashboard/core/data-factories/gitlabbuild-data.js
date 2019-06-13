/**
 * Gets deploy related data
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module + '.core')
        .factory('gitlabData', gitlabData);

    function gitlabData($http) {
        var gilabDetailRoute = '/api/gitlab/data/';

        return {
            details: details
        };

        function details(componentId) {
            return $http.get( gilabDetailRoute )
                // .then(
                //     function (response) {
                //     return response.data;
                // });
        }
    }
})();