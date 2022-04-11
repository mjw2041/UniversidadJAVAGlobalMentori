let resultado = sumarTodos(5, 4, 13, 10, 9, 10 ,11, 3);

function sumarTodos() {
    let suma = 0;
    for ( let i = 0; i < arguments.length; i++ ) {
        suma += arguments[i];
        console.log (" Valor del Argumento " + i + " ----> " + arguments[i] );
    }
    return suma;
}

console.log("Resultado " + resultado);


