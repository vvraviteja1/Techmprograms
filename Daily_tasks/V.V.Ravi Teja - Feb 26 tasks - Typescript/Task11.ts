class Bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

const myBus = new Bus("Mercedes", "Sprinter", 2022);
console.log(myBus);
