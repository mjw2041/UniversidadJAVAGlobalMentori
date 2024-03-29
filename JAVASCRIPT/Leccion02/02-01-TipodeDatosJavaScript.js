/*
  Ejemplo de tipo de datos en JAVASCRIPTS
*/

// Tipo de Datos String //
var nombre = "Juan"
console.log(nombre);
console.log(typeof nombre);

nombre = 20;
console.log(nombre);
console.log(typeof nombre);

// Tipo de Datos Numerico //
var numero = 1000;
console.log(numero);

// Tipo de Dato Object
var objeto = { 
    nombre : "Maxi",
    apellido : "Weihmuller",
    telefono : "12354"
}
console.log(objeto);
console.log(typeof objeto);

// Tipo de dato boolen ( true false) //
var bandera = true;
console.log(bandera);
console.log(typeof bandera)

// Tipo de datos function 
function miFuncion() {}
console.log(miFuncion);
console.log(typeof miFuncion);

// Tipo de datos Symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);
console.log(typeof simbolo);

// Tipo de ckase es una funcion //
class Persona {
    constructor ( nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
};
console.log(Persona);
console.log(typeof Persona);

// Tipo undefined 
var x;
console.log(x);
console.log(typeof x);

x = undefined;
console.log(x);
console.log(typeof x);

// null = ausencia de valor
var y = null;
console.log(y);
console.log(typeof y);

/*** Arreglo */
var autos = [];
autos = ['BMW', 'Audi', 'Volvo'];
console.log(autos);
console.log(typeof autos);

/** Asignar Cadenas vacias */
var z = '';
console.log(z);
console.log(typeof z);