function miFuncion( a, b){
    console.log("Cantidad de Argumentos " + (arguments.length)); // Siempres dentro de la funcion //
    return ( a + b ) ;
};

// llamado de la funcion;
let resultado = miFuncion(2,3);
console.log( "resultado " + resultado );


console.log( typeof miFuncion);

var miFuncionTexto = miFuncion.toString();
console.log( miFuncionTexto);