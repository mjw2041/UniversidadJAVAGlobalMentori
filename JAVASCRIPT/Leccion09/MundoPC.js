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

class Monitor  {
    static contadorMonitores = 0;
    constructor ( marca , tamaño ) {
        this._idMonitor = ++Monitor.contadorMonitores;
        this._idmarca = marca;
        this._idtamaño = tamaño;
    }

    get idMonitor() {
        return this._idMonitor;        
    }

    get marca () {
        return this._marca;
    }

    get tamaño () {
        return this._tamaño;
    }

    set marca ( marca ) {
        this._idmarca = marca;
    }

    set tamaño ( tamaño) {
        this._idtamaño = tamaño;
    }

    toString () {
        return ` Monitor: [ idMonitor: ${this._idMonitor}, Marca: ${ this._idmarca}, Tamaño: ${this._idtamaño}] `;
    }
    
}

class Computadora {
    static contadorComputadora = 0;
    constructor ( nombre, monitor, teclado, raton ){ 
        this._idComputadora = ++ Computadora.contadorComputadora;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;        
    }
    get idComputadora() {
        return this._idComputadora;
    }

    get nombre() {
        return this._nombre;
    }

    get monitor (){
        return this._monitor;
    }

    get raton (){
        return this._raton;        
    }

    set nombre ( nombre) {
        this._nombre = nombre;
    }

    set monitor ( monitor ) {
        this._monitor = monitor;
    }

    set teclado ( teclado ){
        this._teclado = teclado;
    }

    set raton ( raton ) {
        this._raton;
    }

    toString() {
        return ` Computadora: [ idComputadora: ${this._idComputadora}, \n${ this._monitor.toString()}, \n${this._teclado.toString() } \n ${this._raton.toString() }] `;
    }    
}

class Orden {
    static contdorOrdenes = 0;
    constructor () {
     this._idOrden = ++ Orden.contdorOrdenes;
     this._computadoras = [];
    }

    agregarComputadora ( computadora ) {   
        this._computadoras.push(computadora);
    }

    get idComputadora (){
        return this._idComputadora;
    }

    mostrarOrden () {                
        let mensaje = ' ';
        for ( let computadora of this._computadoras ) {
            mensaje += `\n${computadora}.toString()`;            
        }

        return  `Orden: ${this._idOrden} Computadoras ${mensaje}`;
    }    
}


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
let teclado2 = new Teclado("Bluetooth", 'MSI');
console.log(teclado2.toString());

let monitor = new Monitor( "SANSUNG", "14");
console.log(monitor.toString());

let monitor2 = new Monitor( "DELL", "17");
console.log(monitor2.toString());

let computadora = new Computadora( "DELL", monitor, teclado, raton);
console.log(computadora.toString());

let computadora2 = new Computadora( "IBM", monitor2, teclado2, raton2);
console.log(computadora2.toString());

let orden = new Orden();
orden.agregarComputadora(computadora);
orden.agregarComputadora(computadora2);
console.log(orden.mostrarOrden());  