// let arr = [15, 6, 7, 8, [1, 5, 6, 89, 0], 89, 62];
// console.log(arr.flatMap((ele)=> ele * 2, arr));

let arrayOfcars = [
    'Kia', 
    [90, true, false],
    'Porsche',
    'Maserati',
    'Mercedes-Benz',
];
const [first, second = 'Kia', ...third] = [...arrayOfcars.flat(1),'Porsche', 'Maserati', 'Benz'];
console.log(first);
console.log(second);
console.log(third);