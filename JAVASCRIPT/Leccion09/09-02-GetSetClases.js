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

console.log(persona1.nombre);

persona1.nombre = "Juan Carlos"; // set Nombre ( "Juan Carlos")
console.log(persona1.nombre); // get nombre

