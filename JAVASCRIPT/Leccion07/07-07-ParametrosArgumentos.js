/**
 * 
 *   a, b --- > Paramentrps
 * 
 *   1, 2 --- > Argumentos
 */

const sumar = function suma ( a = 5,b= 6) {
    console.log("Valor parametro a " + arguments[0]);
    console.log("Valor parametro b " + arguments[1]);
    console.log("Valor parametro c " + arguments[2]);
    return a + b;
}

let resultado = sumar(1,2);
console.log(resultado);

resultado = sumar(1,2,3);
console.log(resultado);


resultado = sumar(1);
console.log(resultado);

resultado = sumar();
console.log(resultado);

/* DA ERROR
resultado = sumar(,8);
console.log(resultado);
*/

