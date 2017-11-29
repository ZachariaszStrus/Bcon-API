webpackJsonp(["main"],{

/***/ "../../../../../src/$$_gendir lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "../../../../../src/$$_gendir lazy recursive";

/***/ }),

/***/ "../../../../../src/app/app-routing.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__components_order_lists_order_lists_component__ = __webpack_require__("../../../../../src/app/components/order-lists/order-lists.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__login_logged_guard__ = __webpack_require__("../../../../../src/app/login/logged.guard.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__components_login_form_login_form_component__ = __webpack_require__("../../../../../src/app/components/login-form/login-form.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__components_main_main_component__ = __webpack_require__("../../../../../src/app/components/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__components_menu_menu_component__ = __webpack_require__("../../../../../src/app/components/menu/menu.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};







var routes = [
    {
        path: 'login',
        component: __WEBPACK_IMPORTED_MODULE_4__components_login_form_login_form_component__["a" /* LoginFormComponent */]
    },
    {
        path: '',
        canActivate: [__WEBPACK_IMPORTED_MODULE_3__login_logged_guard__["a" /* LoggedGuard */]],
        component: __WEBPACK_IMPORTED_MODULE_5__components_main_main_component__["a" /* MainComponent */],
        children: [
            {
                path: '',
                redirectTo: 'orders',
                pathMatch: 'prefix'
            },
            {
                path: 'orders',
                component: __WEBPACK_IMPORTED_MODULE_2__components_order_lists_order_lists_component__["a" /* OrderListsComponent */]
            },
            {
                path: 'tables',
                component: __WEBPACK_IMPORTED_MODULE_2__components_order_lists_order_lists_component__["a" /* OrderListsComponent */]
            },
            {
                path: 'menu',
                component: __WEBPACK_IMPORTED_MODULE_6__components_menu_menu_component__["a" /* MenuComponent */]
            }
        ]
    },
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    return AppRoutingModule;
}());
AppRoutingModule = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["M" /* NgModule */])({
        imports: [
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */].forRoot(routes)
        ],
        exports: [
            __WEBPACK_IMPORTED_MODULE_1__angular_router__["c" /* RouterModule */]
        ]
    })
], AppRoutingModule);

//# sourceMappingURL=app-routing.module.js.map

/***/ }),

/***/ "../../../../../src/app/app.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<router-outlet></router-outlet>\n"

/***/ }),

/***/ "../../../../../src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.title = 'app';
    }
    return AppComponent;
}());
AppComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'app-root',
        template: __webpack_require__("../../../../../src/app/app.component.html"),
        styles: [__webpack_require__("../../../../../src/app/app.component.css")]
    })
], AppComponent);

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ "../../../../../src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("../../../platform-browser/@angular/platform-browser.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_component__ = __webpack_require__("../../../../../src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__components_order_lists_order_lists_component__ = __webpack_require__("../../../../../src/app/components/order-lists/order-lists.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_routing_module__ = __webpack_require__("../../../../../src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__server_connection_server_connection_service__ = __webpack_require__("../../../../../src/app/server-connection/server-connection.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__components_order_lists_order_order_component__ = __webpack_require__("../../../../../src/app/components/order-lists/order/order.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__components_login_form_login_form_component__ = __webpack_require__("../../../../../src/app/components/login-form/login-form.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__login_login_service__ = __webpack_require__("../../../../../src/app/login/login.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__login_logged_guard__ = __webpack_require__("../../../../../src/app/login/logged.guard.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__angular_forms__ = __webpack_require__("../../../forms/@angular/forms.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__components_order_lists_order_item_item_component__ = __webpack_require__("../../../../../src/app/components/order-lists/order/item/item.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__components_main_main_component__ = __webpack_require__("../../../../../src/app/components/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14_angular2_websocket_service__ = __webpack_require__("../../../../angular2-websocket-service/lib/index.service.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14_angular2_websocket_service___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_14_angular2_websocket_service__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__server_connection_socket_service__ = __webpack_require__("../../../../../src/app/server-connection/socket.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16_ng2_stomp_service__ = __webpack_require__("../../../../ng2-stomp-service/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16_ng2_stomp_service___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_16_ng2_stomp_service__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__components_menu_menu_component__ = __webpack_require__("../../../../../src/app/components/menu/menu.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__components_menu_menu_item_menu_item_component__ = __webpack_require__("../../../../../src/app/components/menu/menu-item/menu-item.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};



















var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["M" /* NgModule */])({
        declarations: [
            __WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */],
            __WEBPACK_IMPORTED_MODULE_3__components_order_lists_order_lists_component__["a" /* OrderListsComponent */],
            __WEBPACK_IMPORTED_MODULE_7__components_order_lists_order_order_component__["a" /* OrderComponent */],
            __WEBPACK_IMPORTED_MODULE_8__components_login_form_login_form_component__["a" /* LoginFormComponent */],
            __WEBPACK_IMPORTED_MODULE_12__components_order_lists_order_item_item_component__["a" /* ItemComponent */],
            __WEBPACK_IMPORTED_MODULE_13__components_main_main_component__["a" /* MainComponent */],
            __WEBPACK_IMPORTED_MODULE_17__components_menu_menu_component__["a" /* MenuComponent */],
            __WEBPACK_IMPORTED_MODULE_18__components_menu_menu_item_menu_item_component__["a" /* MenuItemComponent */]
        ],
        imports: [
            __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
            __WEBPACK_IMPORTED_MODULE_4__app_routing_module__["a" /* AppRoutingModule */],
            __WEBPACK_IMPORTED_MODULE_6__angular_http__["c" /* HttpModule */],
            __WEBPACK_IMPORTED_MODULE_11__angular_forms__["a" /* FormsModule */]
        ],
        providers: [__WEBPACK_IMPORTED_MODULE_5__server_connection_server_connection_service__["a" /* ServerConnectionService */], __WEBPACK_IMPORTED_MODULE_9__login_login_service__["a" /* LoginService */], __WEBPACK_IMPORTED_MODULE_10__login_logged_guard__["a" /* LoggedGuard */], __WEBPACK_IMPORTED_MODULE_14_angular2_websocket_service__["WebSocketService"], __WEBPACK_IMPORTED_MODULE_15__server_connection_socket_service__["a" /* SocketService */], __WEBPACK_IMPORTED_MODULE_16_ng2_stomp_service__["StompService"]],
        bootstrap: [__WEBPACK_IMPORTED_MODULE_2__app_component__["a" /* AppComponent */]]
    })
], AppModule);

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ "../../../../../src/app/components/login-form/login-form.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports
exports.push([module.i, "@import url(https://fonts.googleapis.com/css?family=Open+Sans:400);", ""]);

// module
exports.push([module.i, "body {\n  background-color: #aaa;\n  font-family: 'Open Sans', sans-serif;\n  height: 100%;\n}\n\nh2 { margin: 0; }\n\n.jumbotron {\n  margin-top: 50px;\n  position: relative;\n  background: url(" + __webpack_require__("../../../../../src/assets/falafel.jpg") + ") bottom left no-repeat;\n  min-height: 400px;\n  background-size: 100%;\n  padding: 10px;\n}\n\n.jumbotron-content {\n  position: absolute;\n  right: 0;\n  top: 0;\n  padding: 0px 15px;\n  width: 25%;\n  height: 100%;\n  background-color: #000;\n  background-color: rgba(0, 0, 0, 0.66);\n  border-radius: 5px;\n}\n\n.jumbotron-content h1 {\n  text-align: center;\n  color: #fff;\n  font-size: 1.75em;\n  margin-bottom: 0.5em;\n}\n\n.jumbotron p {\n  margin-top: 0;\n  color: #fff;\n  font-size: 1.2em;\n}\n\n.jumbotron-content label {\n  color: #fff;\n}\n\n.jumbotron .img-credit {\n  color: #bbb;\n  background-color: #000;\n  background-color: rgba(0, 0, 0, 0.5);\n  font-size: 10px;\n  margin: 5px;\n  padding: 3px;\n  position: absolute;\n  bottom: 0;\n  left: 0;\n}\n\n.jumbotron .img-credit a, .jumbotron .img-credit a:hover {\n  color: #fff;\n}\n\n.jumbotron .btn {\n  padding: 5px 5%;\n  margin: 0 3%;\n}\n\n@media(min-width: 992px) {\n  .jumbotron .btn {\n    padding: 5px 10%;\n  }\n}\n\n@media(max-width: 991px) {\n  .jumbotron-content {\n    position: absolute;\n    height: 100%;\n  }\n\n  .jumbotron-lg-only {\n    display: none;\n  }\n}\n\n@media(max-width: 768px) {\n  .jumbotron {\n    background-size: 100% 100%;\n  }\n\n  .jumbotron-content {\n    top: 0;\n    height: 100%;\n    width: 37%;\n  }\n\n  .jumbotron .btn {\n    font-size: 0.85em;\n    padding: 8px 5%;\n    max-width: 65px;\n  }\n}\n\n@media(min-device-width: 320px) and (max-device-width: 568px) {\n  .jumbotron {\n    background: #3667A6;\n    min-height: 275px;\n  }\n\n  .jumbotron-content {\n    width: 100%;\n    height: 100%;\n  }\n\n  .jumbotron .img-credit {\n    display: none;\n  }\n}\n", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/login-form/login-form.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <div class=\"jumbotron\">\n    <div class=\"jumbotron-content\">\n      <h1>Sign In</h1>\n\n      <form #form=\"ngForm\" (ngSubmit)=\"loginUser(form.value)\" class=\"form-group\">\n        <div class=\"form-group\">\n          <label for=\"login\">Login:</label>\n          <input class=\"form-control\" type=\"text\" name=\"login\" placeholder=\"login\" id=\"login\" ngModel>\n        </div>\n        <div class=\"form-group\">\n          <label for=\"password\">Password:</label>\n          <input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"password\" ngModel>\n        </div>\n        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n      </form>\n\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "../../../../../src/app/components/login-form/login-form.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginFormComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__login_login_service__ = __webpack_require__("../../../../../src/app/login/login.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__server_connection_server_connection_service__ = __webpack_require__("../../../../../src/app/server-connection/server-connection.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var LoginFormComponent = (function () {
    function LoginFormComponent(route, router, login, server) {
        this.route = route;
        this.router = router;
        this.login = login;
        this.server = server;
    }
    LoginFormComponent.prototype.ngOnInit = function () { };
    LoginFormComponent.prototype.loginUser = function (form) {
        var _this = this;
        this.server.logIn(form.login, form.password).subscribe(function (success) {
            if (success)
                _this.router.navigateByUrl(_this.route.snapshot.queryParams['returnUrl'] || '/');
        });
    };
    return LoginFormComponent;
}());
LoginFormComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-login-form',
        template: __webpack_require__("../../../../../src/app/components/login-form/login-form.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/login-form/login-form.component.css")]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_router__["a" /* ActivatedRoute */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__login_login_service__["a" /* LoginService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__login_login_service__["a" /* LoginService */]) === "function" && _c || Object, typeof (_d = typeof __WEBPACK_IMPORTED_MODULE_3__server_connection_server_connection_service__["a" /* ServerConnectionService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3__server_connection_server_connection_service__["a" /* ServerConnectionService */]) === "function" && _d || Object])
], LoginFormComponent);

var _a, _b, _c, _d;
//# sourceMappingURL=login-form.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/main/main.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/main/main.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"container\">\n  <nav class=\"navbar navbar-default\">\n    <div class=\"container-fluid\">\n\n      <div class=\"navbar-header\">\n        <a class=\"navbar-brand\" href=\"#\">BCon</a>\n      </div>\n\n      <div class=\"collapse navbar-collapse\">\n        <ul class=\"nav navbar-nav\">\n          <li routerLinkActive=\"active\"><a routerLink=\"/orders\">Current orders</a></li>\n          <li routerLinkActive=\"active\"><a routerLink=\"/menu\">Menu</a></li>\n          <li routerLinkActive=\"active\"><a routerLink=\"/tables\">Tables</a></li>\n        </ul>\n\n        <p class=\"navbar-text navbar-right\">\n          <a (click)=\"logOut()\" class=\"navbar-link\" routerLink=\"/login\">Log out</a>\n        </p>\n      </div>\n\n    </div>\n  </nav>\n\n  <router-outlet></router-outlet>\n</div>\n"

/***/ }),

/***/ "../../../../../src/app/components/main/main.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__login_login_service__ = __webpack_require__("../../../../../src/app/login/login.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MainComponent = (function () {
    function MainComponent(login) {
        this.login = login;
    }
    MainComponent.prototype.ngOnInit = function () {
    };
    MainComponent.prototype.logOut = function () {
        this.login.logOut();
    };
    return MainComponent;
}());
MainComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-main',
        template: __webpack_require__("../../../../../src/app/components/main/main.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/main/main.component.css")]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__login_login_service__["a" /* LoginService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__login_login_service__["a" /* LoginService */]) === "function" && _a || Object])
], MainComponent);

var _a;
//# sourceMappingURL=main.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/menu/menu-item/menu-item.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/menu/menu-item/menu-item.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-default\">\n  <div class=\"panel-body\">\n    <form class=\"form-inline\">\n      <div class=\"form-group\">\n        <label>Name:</label>\n        <input type=\"text\" class=\"form-control\" name=\"name\"\n               (focusout)=\"onMenuItemChange()\"\n               [disabled]=\"edit\" [(ngModel)]=\"menuItem.name\">\n      </div>\n      <div class=\"form-group\">\n        <label>Price:</label>\n        <input type=\"text\" class=\"form-control\" name=\"price\"\n               (focusout)=\"onMenuItemChange()\"\n               [disabled]=\"edit\" [(ngModel)]=\"menuItem.price\">\n      </div>\n      <div class=\"form-group\">\n        <label>Photo url:</label>\n        <input type=\"text\" class=\"form-control\" name=\"imgUrl\"\n               (focusout)=\"onMenuItemChange()\"\n               [disabled]=\"edit\" [(ngModel)]=\"menuItem.imageUrl\">\n      </div>\n      <button class=\"btn btn-danger\" (click)=\"onDelete()\">Delete</button>\n    </form>\n  </div>\n</div>\n"

/***/ }),

/***/ "../../../../../src/app/components/menu/menu-item/menu-item.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MenuItemComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__model_menu_item__ = __webpack_require__("../../../../../src/app/model/menu-item.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MenuItemComponent = (function () {
    function MenuItemComponent() {
        this.edit = false;
        this.menuItemChange = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
        this.delete = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    MenuItemComponent.prototype.ngOnInit = function () {
    };
    MenuItemComponent.prototype.onMenuItemChange = function () {
        this.menuItemChange.next(this.menuItem);
        console.log("submit");
    };
    MenuItemComponent.prototype.onDelete = function () {
        this.delete.next(this.menuItem.id);
    };
    return MenuItemComponent;
}());
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__model_menu_item__["a" /* MenuItem */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__model_menu_item__["a" /* MenuItem */]) === "function" && _a || Object)
], MenuItemComponent.prototype, "menuItem", void 0);
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
    __metadata("design:type", Object)
], MenuItemComponent.prototype, "menuItemChange", void 0);
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
    __metadata("design:type", Object)
], MenuItemComponent.prototype, "delete", void 0);
MenuItemComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-menu-item',
        template: __webpack_require__("../../../../../src/app/components/menu/menu-item/menu-item.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/menu/menu-item/menu-item.component.css")]
    }),
    __metadata("design:paramtypes", [])
], MenuItemComponent);

var _a;
//# sourceMappingURL=menu-item.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/menu/menu.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/menu/menu.component.html":
/***/ (function(module, exports) {

module.exports = "<bcon-menu-item\n  *ngFor=\"let menuItem of restaurant?.menu\"\n  (delete)=\"deleteItem($event)\"\n  [menuItem]=\"menuItem\"></bcon-menu-item>\n\n<button class=\"btn btn-success\" (click)=\"addNew()\">Add item</button>\n<button class=\"btn btn-primary\" (click)=\"save()\">Save changes</button>\n"

/***/ }),

/***/ "../../../../../src/app/components/menu/menu.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MenuComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__ = __webpack_require__("../../../../../src/app/server-connection/server-connection.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__model_menu_item__ = __webpack_require__("../../../../../src/app/model/menu-item.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var MenuComponent = (function () {
    function MenuComponent(serverConnectionService) {
        this.serverConnectionService = serverConnectionService;
        this.restaurant = null;
    }
    MenuComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.serverConnectionService.getRestaurantDetails()
            .subscribe(function (restaurant) { return _this.restaurant = restaurant; });
    };
    MenuComponent.prototype.deleteItem = function (id) {
        this.restaurant.menu = this.restaurant.menu
            .filter(function (item) { return item.id != id; });
    };
    MenuComponent.prototype.addNew = function () {
        this.restaurant.menu.push(new __WEBPACK_IMPORTED_MODULE_2__model_menu_item__["a" /* MenuItem */]());
    };
    MenuComponent.prototype.save = function () {
        var _this = this;
        this.serverConnectionService.updateRestaurantMenu(this.restaurant.menu)
            .subscribe(function (restaurant) { return _this.restaurant = restaurant; });
    };
    return MenuComponent;
}());
MenuComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-menu',
        template: __webpack_require__("../../../../../src/app/components/menu/menu.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/menu/menu.component.css")]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__["a" /* ServerConnectionService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__["a" /* ServerConnectionService */]) === "function" && _a || Object])
], MenuComponent);

var _a;
//# sourceMappingURL=menu.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order-lists.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order-lists.component.html":
/***/ (function(module, exports) {

module.exports = "<!--<button (click)=\"updateOrders()\">Refresh</button>-->\n<bcon-order *ngFor=\"let order of orders\" [order]=\"order\" (statusChange)=\"orderStatusChanged($event)\"></bcon-order>\n"

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order-lists.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OrderListsComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__ = __webpack_require__("../../../../../src/app/server-connection/server-connection.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var OrderListsComponent = (function () {
    function OrderListsComponent(server) {
        this.server = server;
        this.orders = [];
    }
    OrderListsComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.server.newOrderCallback(function (order) { _this.orders.push(order); }); // add only distinct
        this.updateOrders();
    };
    OrderListsComponent.prototype.updateOrders = function () {
        var _this = this;
        //TODO: keep subscriptions in variables, delete on destructor
        this.server.allOrders().subscribe(function (orders) {
            _this.orders = orders;
        });
    };
    OrderListsComponent.prototype.orderStatusChanged = function (event) {
        var _this = this;
        this.server.updateOrder(event).subscribe(function (ok) {
            if (!ok)
                return;
            _this.orders = _this.orders.filter(function (item) { return item.id !== event.id; });
        });
    };
    return OrderListsComponent;
}());
OrderListsComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'app-order-lists',
        template: __webpack_require__("../../../../../src/app/components/order-lists/order-lists.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/order-lists/order-lists.component.css")]
    }),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__["a" /* ServerConnectionService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__server_connection_server_connection_service__["a" /* ServerConnectionService */]) === "function" && _a || Object])
], OrderListsComponent);

var _a;
//# sourceMappingURL=order-lists.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/item/item.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/item/item.component.html":
/***/ (function(module, exports) {

module.exports = "<li class=\"list-group-item\">{{item.name}}</li>\n"

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/item/item.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ItemComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_connection_order__ = __webpack_require__("../../../../../src/app/server-connection/order.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ItemComponent = (function () {
    function ItemComponent() {
    }
    ItemComponent.prototype.ngOnInit = function () {
    };
    return ItemComponent;
}());
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__server_connection_order__["Item"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__server_connection_order__["Item"]) === "function" && _a || Object)
], ItemComponent.prototype, "item", void 0);
ItemComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-item',
        template: __webpack_require__("../../../../../src/app/components/order-lists/order/item/item.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/order-lists/order/item/item.component.css")]
    }),
    __metadata("design:paramtypes", [])
], ItemComponent);

var _a;
//# sourceMappingURL=item.component.js.map

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/order.component.css":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "", ""]);

// exports


/*** EXPORTS FROM exports-loader ***/
module.exports = module.exports.toString();

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/order.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"panel panel-default\">\n  <div class=\"panel-heading\">\n    <h3 class=\"panel-title\">\n      <span class=\"label label-primary\">{{orderStatus}}</span>\n      Table: {{order.tableNumber}}\n    </h3>\n  </div>\n  <div class=\"panel-body\">\n    <ul class=\"list-group\">\n      <bcon-item *ngFor=\"let item of order.items\" [item]=\"item\">test</bcon-item>\n    </ul>\n\n    <div class=\"btn-group\" role=\"group\" aria-label=\"...\">\n      <button type=\"button\" class=\"btn btn-danger\" (click)=\"cancelOrder()\">Cancel</button>\n      <button type=\"button\" class=\"btn btn-default\" (click)=\"acceptOrder()\">Accept</button>\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "../../../../../src/app/components/order-lists/order/order.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return OrderComponent; });
/* unused harmony export UpdateOrderEvent */
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_connection_order__ = __webpack_require__("../../../../../src/app/server-connection/order.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var OrderComponent = (function () {
    function OrderComponent() {
        this.statusChange = new __WEBPACK_IMPORTED_MODULE_0__angular_core__["x" /* EventEmitter */]();
    }
    OrderComponent.prototype.ngOnInit = function () {
        console.log(this.order);
    };
    OrderComponent.prototype.acceptOrder = function () {
        this.statusChange.emit(new UpdateOrderEvent(__WEBPACK_IMPORTED_MODULE_1__server_connection_order__["c" /* Status */].DONE, this.order.id));
    };
    OrderComponent.prototype.cancelOrder = function () {
        this.statusChange.emit(new UpdateOrderEvent(__WEBPACK_IMPORTED_MODULE_1__server_connection_order__["c" /* Status */].CANCELLED, this.order.id));
    };
    Object.defineProperty(OrderComponent.prototype, "orderStatus", {
        get: function () {
            return this.order.status.toString();
        },
        enumerable: true,
        configurable: true
    });
    return OrderComponent;
}());
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["F" /* Input */])(),
    __metadata("design:type", typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__server_connection_order__["Order"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__server_connection_order__["Order"]) === "function" && _a || Object)
], OrderComponent.prototype, "order", void 0);
__decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Output */])(),
    __metadata("design:type", Object)
], OrderComponent.prototype, "statusChange", void 0);
OrderComponent = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["o" /* Component */])({
        selector: 'bcon-order',
        template: __webpack_require__("../../../../../src/app/components/order-lists/order/order.component.html"),
        styles: [__webpack_require__("../../../../../src/app/components/order-lists/order/order.component.css")]
    }),
    __metadata("design:paramtypes", [])
], OrderComponent);

var UpdateOrderEvent = (function () {
    function UpdateOrderEvent(status, id) {
        this.status = status;
        this.id = id;
    }
    return UpdateOrderEvent;
}());

var _a;
//# sourceMappingURL=order.component.js.map

/***/ }),

/***/ "../../../../../src/app/login/logged.guard.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoggedGuard; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("../../../router/@angular/router.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__login_service__ = __webpack_require__("../../../../../src/app/login/login.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var LoggedGuard = (function () {
    function LoggedGuard(loginService, router) {
        this.loginService = loginService;
        this.router = router;
    }
    LoggedGuard.prototype.canActivate = function (next, state) {
        if (this.loginService.loggedIn()) {
            return true;
        }
        else {
            this.router.navigate(['/login'], { queryParams: { returnUrl: state.url } });
            return false;
        }
    };
    return LoggedGuard;
}());
LoggedGuard = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_2__login_service__["a" /* LoginService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__login_service__["a" /* LoginService */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* Router */]) === "function" && _b || Object])
], LoggedGuard);

var _a, _b;
//# sourceMappingURL=logged.guard.js.map

/***/ }),

/***/ "../../../../../src/app/login/login.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var LoginService = (function () {
    function LoginService() {
        this.storageTokenKeyName = "Tokens";
        this.authTokens = null;
        this.restoreTokens();
    }
    LoginService.prototype.setToken = function (authData) {
        this.authTokens = authData;
        sessionStorage.setItem(this.storageTokenKeyName, JSON.stringify(authData));
    };
    LoginService.prototype.restoreTokens = function () {
        var tokens = sessionStorage.getItem(this.storageTokenKeyName);
        if (tokens != null)
            this.authTokens = JSON.parse(tokens);
    };
    LoginService.prototype.authHeader = function () {
        return { "Authorization": this.authTokens.token_type + " " + this.authTokens.access_token };
    };
    LoginService.prototype.loggedIn = function () {
        if (this.authTokens != null && this.authTokens.access_token != null)
            return true;
        return false;
    };
    LoginService.prototype.logOut = function () {
        this.authTokens = null;
        sessionStorage.removeItem(this.storageTokenKeyName);
    };
    return LoginService;
}());
LoginService = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
    __metadata("design:paramtypes", [])
], LoginService);

//# sourceMappingURL=login.service.js.map

/***/ }),

/***/ "../../../../../src/app/model/menu-item.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MenuItem; });
var MenuItem = (function () {
    function MenuItem() {
        this.id = null;
        this.imageUrl = "";
        this.name = "";
        this.price = 0.0;
    }
    return MenuItem;
}());

//# sourceMappingURL=menu-item.js.map

/***/ }),

/***/ "../../../../../src/app/server-connection/order.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "c", function() { return Status; });
var Status;
(function (Status) {
    Status[Status["DONE"] = 0] = "DONE";
    Status[Status["PENDING"] = 1] = "PENDING";
    Status[Status["CANCELLED"] = 2] = "CANCELLED";
})(Status || (Status = {}));
;
//# sourceMappingURL=order.js.map

/***/ }),

/***/ "../../../../../src/app/server-connection/server-connection.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ServerConnectionService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("../../../http/@angular/http.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__("../../../../rxjs/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_map__ = __webpack_require__("../../../../rxjs/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_map___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_rxjs_add_operator_map__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_mergeMap__ = __webpack_require__("../../../../rxjs/add/operator/mergeMap.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_mergeMap___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_4_rxjs_add_operator_mergeMap__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_observable_of__ = __webpack_require__("../../../../rxjs/add/observable/of.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_add_observable_of___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_5_rxjs_add_observable_of__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__settings__ = __webpack_require__("../../../../../src/app/server-connection/settings.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__order__ = __webpack_require__("../../../../../src/app/server-connection/order.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__login_login_service__ = __webpack_require__("../../../../../src/app/login/login.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__socket_service__ = __webpack_require__("../../../../../src/app/server-connection/socket.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};










var ServerConnectionService = (function () {
    function ServerConnectionService(http, loginService, socketService) {
        this.http = http;
        this.loginService = loginService;
        this.socketService = socketService;
        this.jsonHeader = {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        };
    }
    ServerConnectionService.prototype.allOrders = function () {
        var url = __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].allOrdersUrl;
        var authHeader = this.loginService.authHeader();
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */](authHeader);
        var params = {
            'status': __WEBPACK_IMPORTED_MODULE_7__order__["c" /* Status */][__WEBPACK_IMPORTED_MODULE_7__order__["c" /* Status */].PENDING]
        };
        return this.http.get(url, { headers: headers, params: params }).map(function (r) {
            return r.json();
        });
    };
    ServerConnectionService.prototype.updateOrder = function (event) {
        var url = __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].updateOrdersUrl + "/" + event.id;
        var body = JSON.stringify(__WEBPACK_IMPORTED_MODULE_7__order__["c" /* Status */][event.status]);
        var authHeader = this.loginService.authHeader();
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */](Object.assign(this.jsonHeader, authHeader));
        return this.http.put(url, body, { headers: headers }).map(function (r) { return r.status == 200; });
    };
    ServerConnectionService.prototype.logIn = function (login, password) {
        var _this = this;
        var url = __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].LoginUrl;
        var authHeader = { "Authorization": "Basic " + __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].AppBase64 };
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */](Object.assign(authHeader, this.jsonHeader));
        var params = {
            'grant_type': 'password',
            'username': login,
            'password': password
        };
        return this.http.post(url, {}, { headers: headers, params: params })
            .map(function (r) {
            if (r.status == 200) {
                _this.loginService.setToken(r.json());
                return true;
            }
            else
                return false;
        }).mergeMap(function (ok) {
            if (!ok)
                return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["Observable"].of(ok);
            return _this.getRestaurantId();
        });
    };
    ServerConnectionService.prototype.getRestaurantId = function () {
        var _this = this;
        return this.getRestaurantDetails().map(function (restaurant) {
            _this.restaurantId = restaurant.id;
            return true;
        });
    };
    ServerConnectionService.prototype.getRestaurantDetails = function () {
        var url = __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].RestaurantInfo;
        var authHeader = this.loginService.authHeader();
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */](Object.assign(authHeader, this.jsonHeader));
        return this.http.get(url, { headers: headers }).map(function (r) {
            return r.json();
        });
    };
    ServerConnectionService.prototype.updateRestaurantMenu = function (menu) {
        var url = __WEBPACK_IMPORTED_MODULE_6__settings__["a" /* Settings */].RestaurantUpdateMenu;
        var authHeader = this.loginService.authHeader();
        var headers = new __WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Headers */](Object.assign(authHeader, this.jsonHeader));
        return this.http.post(url, menu, { headers: headers }).map(function (r) {
            return r.json();
        });
    };
    ServerConnectionService.prototype.newOrderCallback = function (response) {
        var _this = this;
        if (this.restaurantId) {
            this.socketService.connect(this.restaurantId, response);
        }
        else {
            this.getRestaurantId().subscribe(function () {
                _this.socketService.connect(_this.restaurantId, response);
            });
        }
    };
    return ServerConnectionService;
}());
ServerConnectionService = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1__angular_http__["b" /* Http */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_8__login_login_service__["a" /* LoginService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_8__login_login_service__["a" /* LoginService */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_9__socket_service__["a" /* SocketService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_9__socket_service__["a" /* SocketService */]) === "function" && _c || Object])
], ServerConnectionService);

var _a, _b, _c;
//# sourceMappingURL=server-connection.service.js.map

/***/ }),

/***/ "../../../../../src/app/server-connection/settings.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Settings; });
var Settings = (function () {
    function Settings() {
    }
    return Settings;
}());

Settings.socketPrepend = "ws://";
Settings.httpsPrepend = "https://";
Settings.httpPrepend = "http://";
Settings.base = "bcon-spring.herokuapp.com/";
// "192.168.0.199:8080/";
Settings.address = Settings.httpsPrepend + Settings.base;
Settings.allOrdersUrl = Settings.address + "orders";
Settings.updateOrdersUrl = Settings.address + "orders";
Settings.testCredentialsUrl = Settings.address + "private";
Settings.LoginUrl = Settings.address + "oauth/token";
Settings.AppBase64 = "YmNvbi13ZWItYXBwOnNlY3JldA==";
Settings.WebsocketEndpoint = Settings.address + "stomp-endpoint";
Settings.RestaurantInfo = Settings.address + "user/restaurant";
Settings.RestaurantUpdateMenu = Settings.address + "restaurants/menu";
//# sourceMappingURL=settings.js.map

/***/ }),

/***/ "../../../../../src/app/server-connection/socket.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SocketService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_share__ = __webpack_require__("../../../../rxjs/add/operator/share.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_share___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_1_rxjs_add_operator_share__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__settings__ = __webpack_require__("../../../../../src/app/server-connection/settings.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_ng2_stomp_service__ = __webpack_require__("../../../../ng2-stomp-service/index.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_ng2_stomp_service___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_3_ng2_stomp_service__);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var SocketService = (function () {
    function SocketService(stomp) {
        this.stomp = stomp;
        stomp.configure({
            host: __WEBPACK_IMPORTED_MODULE_2__settings__["a" /* Settings */].WebsocketEndpoint,
            debug: true,
            queue: { 'init': false }
        });
    }
    SocketService.prototype.connect = function (restaurantId, response) {
        var _this = this;
        this.stomp.startConnect().then(function () {
            _this.stomp.done('init');
            console.log('connected');
            _this.stomp.subscribe('/topic/orders/' + restaurantId, response);
        });
    };
    return SocketService;
}());
SocketService = __decorate([
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["C" /* Injectable */])(),
    __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_3_ng2_stomp_service__["StompService"] !== "undefined" && __WEBPACK_IMPORTED_MODULE_3_ng2_stomp_service__["StompService"]) === "function" && _a || Object])
], SocketService);

var _a;
//# sourceMappingURL=socket.service.js.map

/***/ }),

/***/ "../../../../../src/assets/falafel.jpg":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "falafel.3b2123a61d26574e0aee.jpg";

/***/ }),

/***/ "../../../../../src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
// The file contents for the current environment will overwrite these during build.
var environment = {
    production: false
};
//# sourceMappingURL=environment.js.map

/***/ }),

/***/ "../../../../../src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("../../../core/@angular/core.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("../../../platform-browser-dynamic/@angular/platform-browser-dynamic.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("../../../../../src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("../../../../../src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_23" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map