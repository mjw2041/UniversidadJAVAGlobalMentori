class Empleado {
    constructor ( nombre, sueldo) {
        this._nombre = nombre;
        this._sueldo = sueldo;
    }

    obtenerDetalle() {
        return  `Empleado: ${this._nombre} Sueldo:  ${this._sueldo}`;
    }
    
    toString() {
        return  this.obtenerDetalle();
    }
}

class Gerente extends Empleado {
    constructor( nombre, sueldo, departamento) {
        super(nombre, sueldo);
        this._departamento = departamento;
    }

    obtenerDetalle() {
        return  `Gerente ${super.obtenerDetalle()} Departamento: ${this._departamento}`;
    }
}

function imprimir ( tipo) {
    /**
     *  Siempre se pregunta desde la mas especifica a la generica ( Gerente, Empleado, Object)
     */
    console.log(tipo.obtenerDetalle());
    if ( tipo instanceof Gerente  ) {
        console.log("Es un Gerente"); 
    } else if ( tipo instanceof Empleado) {
        console.log("Es un Empleado");
    } else  {
        console.log("No se que es");
    }

    if ( tipo instanceof Gerente  ) {
        console.log("Es un Gerente"); 
    }

    if ( tipo instanceof Empleado) {
        console.log("Es un Empleado");
    }

    if ( tipo instanceof Object) {
        console.log("Es un Objeto");
    }
}

empleado = new Empleado("Maxi", 1000);
gerente = new Gerente("Ignacio", 2000, "Sistemas");

imprimir(empleado);
console.log( "************************************")
imprimir(gerente);


