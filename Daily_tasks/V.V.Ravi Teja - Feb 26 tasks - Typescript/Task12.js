var Bus1 = /** @class */ (function () {
    function Bus1(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Bus1.prototype.start = function () {
        console.log("The ".concat(this.make, " ").concat(this.model, " is starting."));
    };
    return Bus1;
}());
var schoolBus = new Bus1("Volvo", "B7R", 2023);
schoolBus.start();
