/**
 *  Las expresiones se evaluan de izquierda a derecha
 * 
 */
let a = 3, b = 2, c = 1, d=4;


let z = a * b;
console.log(z)

z = a * b + c;
console.log(z)

z = c + a * b;
console.log(z)

z = z = a * b + c / d;
console.log(z)

z = c + a * b / d;
console.log(z)

z = ( c + a )  * b / c;
console.log(z)

