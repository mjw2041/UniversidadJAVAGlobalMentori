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

/**
 * Polimorfismo se puede ejecutar distintos metodos dependiendo del tipo de obejeto
 * Polimorfismo diferentes formas
 * 
 */
function imprimir ( tipo) {
    console.log(tipo.obtenerDetalle());
}

empleado = new Empleado("Maxi", 1000);
gerente = new Gerente("Ignacio", 2000, "Sistemas");

imprimir(empleado);

imprimir(gerente);


