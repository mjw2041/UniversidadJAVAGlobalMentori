// Tipor Primitivos
let x = 10;

function cambiarValor ( a) {
    a = 20;
    return;
}

// Paso por Valor
cambiarValor(x);
console.log( "x " + x) ;
// console.log( "a " + a) ; Esta variable se destruye es de cambiarValor

