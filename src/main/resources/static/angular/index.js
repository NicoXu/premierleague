/**
 * Created by shaw on 2017/7/27.
 */
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    $http.post("/premierleague/getTeamList").success(function (data) {
        $scope.teams = data;
    });
});