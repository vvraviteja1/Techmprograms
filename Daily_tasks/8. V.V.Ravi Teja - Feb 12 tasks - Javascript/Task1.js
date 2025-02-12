const date = new Date();
const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
console.log(`Today is : ${days[date.getDay()]}.`);
let hours = date.getHours();
const ampm = hours >= 12 ? 'PM' : 'AM';
hours = hours % 12 || 12;
const minutes = String(date.getMinutes()).padStart(2, '0');
const seconds = String(date.getSeconds()).padStart(2, '0');
console.log(`Current time is : ${hours} ${ampm} : ${minutes} : ${seconds}`);