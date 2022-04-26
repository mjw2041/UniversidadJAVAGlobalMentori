class Producto {
    static contadorProductos = 0
    constructor ( nombre, precio) {
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto() {
        return this._idProducto;
    }
    
    get nombre() {
        return this._nombre
    }
    get precio () {
        return this._precio;
    }

    set nombre (nombre) {
        this._nombre = nombre;
    }

    set precio (precio) {
        this._precio;
    }

    toString() {
        return `idProducto: ${this._idProducto}, nombre:   ${this._nombre}, precio: $ ${this._precio}`; 
    }
}

class Orden {
    static contadorOrdenes = 0;

    static get MAX_PRODUCTOS() {
        return 5;
    }

    constructor () {
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;      
    }

    get idOrden () {
        return this._idOrden;        
    }

    get productos(){
        return this._productos;        
    }

    get contadorProductosAgregados() {
        return this._contadorProductosAgregados;
    }

    
    agregarProducto ( producto ){
              
        if ( this._productos.length < Orden.MAX_PRODUCTOS )  { 
                        
            this._productos.push(producto);
            /*this.productos[this._contadorProductosAgregados] = producto;*/
            ++this._contadorProductosAgregados;
        } else {
            console.log("No se puede agregar mas productos");
        } 
             
    }

    toString() {        
        return `${this._idOrden} ${this._productos} ${this._contadorProductosAgregados}`;
    }

    calcularTotal () {
        let totalOrden = 0;
        /*
        for ( let i = 0; i < this._productos.length; i++ ) {
            totalOrden = totalOrden + this._productos[i]._precio;
            console.log(this._productos[i]._precio)
        }*/
        for (let producto of this._productos) {
            totalOrden += producto._precio;
        }
        return totalOrden;
    }

    mostrarOrden() {
        let productosOrden = 'Detalle';
        /*
        for ( let i = 0; i < this._productos.length; i++ ) {
        
             productosOrden += `${this._productos[i]._idProducto}  ${this._productos[i]._nombre} ${this.productos[i]._precio} \n`; 
        }
        */
        for ( let producto of this._productos ) {
            productosOrden +=  `\n ${producto.toString()}`;
        }         
        productosOrden += `\n Nro de Orden ${this._idOrden} Total: ${this.calcularTotal()}\n`;    
        console.log(productosOrden);        
    }
}

let producto1 = new Producto( "Pantalon", 200);
let producto2 = new Producto( "Camisa", 100 );
let producto3 = new Producto( "Cinturon", 50 );
console.log(producto1.toString());
console.log(producto2.toString());
console.log(producto3.toString());

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.mostrarOrden();

let orden2 = new Orden();
orden2.agregarProducto(producto3);
orden2.agregarProducto(producto1);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto2);
orden2.agregarProducto(producto2);
orden2.mostrarOrden();




