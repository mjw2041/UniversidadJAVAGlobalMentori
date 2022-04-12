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

    toString() {
        // Se aplica poliformismo ( multiples formas en tiempo de ejecucion ) 
        // el metodo que se ejecuta depende si  es una referencia de tipo padre 
        // o de tipo hijo.
        return this.nombreCompleto();
    }
    static saludar() {
        console.log('saludo desde metodo Static');
    }

    static saludar2( persona ) {
        console.log('saludo desde metodo Static ' + persona.nombreCompleto());
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

let persona = new Persona('Maximiliano', 'Weihmüller' );
console.log(persona);
console.log(persona.nombreCompleto());
console.log(persona.toString() );
// console.log(empleado.saludar()) // No es posible llamar un metodo static desde un objeto
Persona.saludar();
Persona.saludar2(persona);


let empleado = new Empleado('Maximiliano', 'Weihmüller', 'Programador' );
console.log(empleado);
console.log(empleado.nombreCompleto());
console.log(empleado.toString() );
// console.log(empleado.saludar()) // No es posible llamar un metodo static desde un objeto
Persona.saludar();
Persona.saludar2(empleado);
