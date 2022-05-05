/**
 *  En la funcion Flacha no se usa el concepto de hosting
 *  puede usarse const o let o var
 */

function mifuncion ( ) {
    console.log("Saludos desde mi funcion");
}

let miFuncion2 = function ( ) {
    console.log("Saludos desde mi funcion anonima");
}

const miFuncionFlecha = ( ) => {
    console.log("Saludos desde mi funcion Flecha");
}

mifuncion();

miFuncion2();

miFuncionFlecha();


