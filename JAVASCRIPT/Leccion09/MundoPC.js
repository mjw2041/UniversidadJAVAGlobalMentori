class DispositivoEntrada {
    constructor (tipoEntrada, marca){
        this._tipoEntrada  = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada(){
        return this._tipoEntrada;
    }

    get marca() {
        return this._marca;
    }

    set tipoEntrada(tipoEntrada) {
        this._tipoEntrada = tipoEntrada;
    }

    set marca ( marca) {
        this._marca = marca;
    }

    toString() {
        return `Tipo Entrada: ${this._tipoEntrada} Marca: ${this._marca}`;
    }
}

class Raton extends DispositivoEntrada {
    static contadorRatones = 0
    constructor ( tipoEntrada, marca){         
        super( tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }; 

    get idRatones() {
        return this._idRaton;
    }

    toString() {
        return `Raton: [idRaton: ${this._idRaton}, Tipo Entrada: ${this._tipoEntrada}, Marca: ${this._marca} `;
    }
    
}

class Teclado extends DispositivoEntrada {
    static contadorTeclados = 0
    constructor ( tipoEntrada, marca) {
        super ( tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }        
    get idTeclado() {
        return this._idTeclado;
    }

    toString() {
        return ` Teclado: [ idTeclado: ${this._idTeclado}, Tipo Entrada: ${ this._tipoEntrada}, Marca: ${this._marca}] `;
    }
}

class Monitor 

let dispositivoEntrada = new DispositivoEntrada("Raton", "Genius");
console.log(dispositivoEntrada.toString());
dispositivoEntrada.marca = "HP";
dispositivoEntrada.tipoEntrada = "Table";
console.log(dispositivoEntrada.toString());

let raton = new Raton("Raton","IBM");
console.log(raton.toString());

let raton2 = new Raton("USB","HP");
console.log(raton2.toString());
raton2.marca = "DELL";
console.log(raton2.toString());

let teclado = new Teclado("USB", 'IBM');
console.log(teclado.toString());
    