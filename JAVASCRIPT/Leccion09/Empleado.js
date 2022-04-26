
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
        return this.idEmpleado + ' ' + super.toString() + ' ' + '-' + this.sueldo; 
    }

}

empleado1 = new Empleado ( "Carolina", "Perret", 49, 520000);
console.log(empleado1.toString);

empleado2 = new Empleado ( "Maximiliano", "Weihmuller", 49, 620000);
console.log(empleado2.toString);

