/*The legal restrict values are:

E for Element name
A for Attribute
C for Class
M for Comment
By default the value is EA, meaning that both Element names and attribute names can invoke the directive.
*/

// create a module and save it to a variable
//var app = angular.module("myApp", []);


// create a directive (element name, attribute)  
app.directive("w3TestDirective", function() {
    return {
        template : "<h1>Made by a directive! {{name}}</h1>"
    };
});

// create a directive (Comment)
app.directive("w3TestDirective", function() {
    return {
        restrict : "M",
        replace : true,
        template : "<h1>Made by a directive!</h1>"
    };
});


// create a directive (Class)
app.directive("w3TestDirective", function() {
    return {
        restrict : "C",
        template : "<h1>Made by a directive!</h1>"
    };
});
