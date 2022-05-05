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

empleado = new Empleado("Maxi", 1000);
console.log(empleado.obtenerDetalle());

gerente = new Gerente("Ignacio", 2000, "Sistemas");
console.log(gerente.obtenerDetalle());

console.log(gerente.toString());
console.log(gerente.toString());
