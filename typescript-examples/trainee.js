"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.JavaTrainee = exports.Trainee = void 0;
var Trainee = /** @class */ (function () {
    function Trainee(traineeId, traineeName, email) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.email = email;
    }
    Trainee.prototype.printTrainee = function () {
        console.log(this);
    };
    return Trainee;
}());
exports.Trainee = Trainee;
var JavaTrainee = /** @class */ (function (_super) {
    __extends(JavaTrainee, _super);
    function JavaTrainee(traineeId, traineeName, email, javaVersion) {
        var _this = _super.call(this, traineeId, traineeName, email) || this;
        _this.javaVersion = javaVersion;
        return _this;
    }
    JavaTrainee.prototype.printTrainee = function () {
        console.log(this);
    };
    return JavaTrainee;
}(Trainee));
exports.JavaTrainee = JavaTrainee;
var trainee = new Trainee(1001, 'Tushar', 'tushar@yahoo.com');
trainee.printTrainee();
var trainee2 = new JavaTrainee(1002, 'Rohit', 'rohit@yahoo.com', 8);
trainee2.printTrainee();
