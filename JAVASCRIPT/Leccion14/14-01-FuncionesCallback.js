function mifuncion1() {
    console.log( "funcion 1");
}

function mifuncion2() {
    console.log("funcion 2");
}

// Fucion tipo callback
function imprimir ( mensaje ) {
    console.log(mensaje);
}

let imp = function ( mensaje) { 
    console.log(mensaje);
}

function sumar (op1, op2, funcionCallback) {
    let res = op1 + op2;
    funcionCallback( `Resultado ${res}`);

}

mifuncion1();
mifuncion2();

sumar ( 5,3, imprimir);

sumar ( 15,13, imp);



