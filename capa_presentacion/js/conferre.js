var conferre = angular.module('conferre', []);

conferre.controller('PaginationCtrl', function($window, $scope) {

$scope.dir = function(url){
    $window.location.href = url
};


});

conferre.controller('ConferenciasCtrl', function($http, $scope) {



});