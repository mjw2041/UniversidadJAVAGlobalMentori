class Cliente extends Persona {
    static contadorCliente = 0
    constructor ( nombre, apellido, edad) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorCliente;
        this._fechaRegistro = new Date();
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
        
        return `${this._idCliente} ${super.toString()} ${this.fechaRegistro}`;
        
    }
}


scliente = new Cliente("Maxi", "Weihm", 45);
console.log(cliente);
console.log(cliente.toString());
