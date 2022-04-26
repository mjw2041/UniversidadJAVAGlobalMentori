class Persona {
    
    static contadorPersonas = 0;  // Atributos de la clase

    static get MAX_OBJ() {
        return 5;
    }
    
    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
        if (  Persona.contadorPersonas < Persona.MAX_OBJ ) {
            this._idPersona = ++Persona.contadorPersonas;
        } else  {
            console.log ('Se han superado el maximo de objetos permitidos');
        }
        
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
        return this._idPersona + " " + this._nombre + " " + this._apellido;
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

let persona1 = new Persona("WeihmuLer", "Maximiliano");
console.log(persona1.toString());

let persona2 = new Persona("Perret", "Carolina");
console.log(persona2.toString());

console.log(Persona.contadorPersonas);

let empleado1 = new Empleado("Garcia", "Carlos", "Sistema");
console.log(empleado1.toString());

console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);

let persona3 = new Persona("Mariano", "Lara");
console.log(persona3.toString());

let persona4 = new Persona("Armando", "Toledo");
console.log(persona4.toString());

let persona5 = new Persona("Laura", "Quintero");
console.log(persona5.toString());





