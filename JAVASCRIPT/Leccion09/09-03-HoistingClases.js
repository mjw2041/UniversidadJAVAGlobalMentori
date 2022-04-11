// No es posible crear objetos antes de declara la clase
// No se aplica el concepto de Hoisting
// let persona2 = new Persona ( "Karla", "Juarez");

class Persona {
    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre() {
        return this._nombre;
    }

    set nombre( nombre ) {
        this._nombre = nombre;
    }
}

let persona1 = new Persona("Carlos", "Lara");
console.log(persona1);


