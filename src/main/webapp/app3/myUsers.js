app.controller("userController", function ($scope, $http) {
    $scope.formData = {};
    $scope.users = {};

    $scope.searchUser = function(){
        var req = {
            method: 'POST',
            url: '/email/user',
            data: $scope.formData,
            transformRequest: function(obj) {
                var str = [];
                for(var p in obj)
                    str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
                return str.join("&");
            },
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        };

        $http(req).success(function (data, status, headers, config) {
            console.log("success");
            console.log(data);
            $scope.users = data;
        }).error(function (data, status, headers, config) {
            console.log("error");
            console.log(data);
        });

    };

    $scope.sendEmail = function(){
        var req = {
            method: 'POST',
            url: '/email/send',
            data: $scope.users
        };

        $http(req).success(function (data, status, headers, config) {
            console.log("success");
            console.log(data);

        }).error(function (data, status, headers, config) {
            console.log("error");
            console.log(data);
        });
    }
});


