let year = 2024;
let isLeapYear = (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
console.log(isLeapYear);
