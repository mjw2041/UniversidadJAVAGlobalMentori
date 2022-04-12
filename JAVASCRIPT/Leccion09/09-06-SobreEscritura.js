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

    get apellido() {
        return this._apellido;
    }

    set apellido( apellido) {
        this._apellido = apellido;
    }

    nombreCompleto() {
        return this._nombre + " " + this._apellido;
    }
};

class Empleado extends Persona {
    constructor ( nombre, apellido, departamento ) {
        super(nombre, apellido);
        this._departamemto = departamento;    
    }

    get departamento () {
        return this._departamemto;
    }

    set departamento ( departamento) {
        this._departamemto = departamento;
    }

    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamemto;
    }
};

let empleado = new Empleado('Maximiliano', 'Weihmüller', 'Programador' );
console.log(empleado);
console.log(empleado.nombreCompleto());
