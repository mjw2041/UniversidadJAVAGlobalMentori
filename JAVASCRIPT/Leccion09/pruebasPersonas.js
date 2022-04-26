class Persona {
    static contadorPersona = 0;

    constructor ( nombre , apellido, edad) {
        this._idPersona = ++Persona.contadorPersona;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona() {
        return this._idPersona;
    }
        
    
    get nombre() {
        return this._nombre;
    }

    get apellido() {
        return this._apellido;
    }

    get edad (){
        return this._edad;
    }

    set nombre (nombre) {
        this._nombre = nombre;
    }

    set apellido ( apellido) {
        this._apellido = apellido;
    }

    set edad ( edad) {
        this._edad = edad;
    }

    toString (){
        return  `${this.idPersona} ${this.nombre} ${this.apellido} ${this.edad}`;
    }
}

class Empleado extends Persona {

    static contadorEmpleado = 0;
    
    constructor ( nombre, apellido, edad, sueldo ) {
        super (nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleado;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this._idEmpleado;
    };
    
    get sueldo() {
        return this._sueldo;
    }

    set sueldo (sueldo) {
        this._sueldo = sueldo;
    }

    toString (){
        return `${super.toString()} ${this.idEmpleado}  ${this.sueldo}`; 
    }
}

class Cliente extends Persona {
    static contadorCliente = 0
    constructor ( nombre, apellido, edad, fechaRegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorCliente;
        this._fechaRegistro = fechaRegistro;
    }

    get idCliente() {
        return this._idCliente;
    }

    get fechaRegistro() {
        return this._fechaRegistro;
    }

    set fechaRegistro( fechaRegistro) {
        this._fechaRegistro = fechaRegistro;
    }

    toString() {                
        return `${super.toString()} ${this._idCliente}  ${this.fechaRegistro}`;
        
    }
}


/// Prueba clase Persona 
let persona1 = new Persona("Maximiliano", "Weihmuller", 50);
console.log(persona1);
console.log(persona1.toString());

let persona2 = new Persona ("Carlos","Ramirez 2","28");
console.log(persona2.toString());

/// Prueba clase Empleado
let empleado1 = new Empleado("Carolina", "Perret", 49, 12300);
console.log(empleado1.toString());

let empleado2 = new Empleado ("Laura", "Quintero","33", 7000);
console.log(empleado2.toString());

/// Prueba clase Cliente
let cliente1 = new Cliente("José", "San Martin", 150, new Date());
console.log(cliente1.toString());

let cliente2 = new Cliente("Maria", "Lara", 25, new Date());
console.log(cliente2.toString());
