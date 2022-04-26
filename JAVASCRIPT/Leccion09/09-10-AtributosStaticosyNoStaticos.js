class Persona {
    
    static contadorPersona = 0;  // Atributos de la clase
    email  = 'Valor default email'  // Atributo de nuestro objetos
    
    constructor (nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorPersona++;
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
console.log(" Persona.contadorPersona: " +  Persona.contadorPersona);

/* ** -------------------------------------------------------------------- */ 

let empleado = new Empleado('Maximiliano', 'Weihmüller', 'Programador' );
console.log(empleado);
console.log(empleado.nombreCompleto());
console.log(empleado.toString() );
// console.log(empleado.saludar()) // No es posible llamar un metodo static desde un objeto
Persona.saludar();
Persona.saludar2(empleado);

console.log(persona.contadorPersona);
console.log(" Persona.contadorPersona: " +  Persona.contadorPersona);
console.log (persona.email);
persona.email = "Valor Persona"
console.log (persona.email);

console.log(" Empleado.contadorPersona: " +  Empleado.contadorPersona);
console.log (Persona.email);
console.log (empleado.email);