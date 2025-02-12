let date = new Date();
let mm = String(date.getMonth() + 1).padStart(2, '0');
let dd = String(date.getDate()).padStart(2, '0');
let yyyy = date.getFullYear();

console.log(mm + '-' + dd + '-' + yyyy);
console.log(mm + '/' + dd + '/' + yyyy);
console.log(dd + '-' + mm + '-' + yyyy);
console.log(dd + '/' + mm + '/' + yyyy);
