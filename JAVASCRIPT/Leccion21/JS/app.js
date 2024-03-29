const ingresos = [
    new Ingreso ( 'Salario LA2DA', 1000.00),
    new Ingreso ( 'Venta Coche', 1200.00)
]

const egresos = [
    new Egreso ( 'Renta departamento', 1900 ),
    new Egreso ('Ropa', 400)
]



let totalIngresos =() => {
    let totalIngreso = 0;
    for ( let ingreso of ingresos ) {
        totalIngreso += ingreso.valor;
    }
    return totalIngreso;
}

let totalEgresos =() => {
    let totalEgreso = 0;
    for ( let egreso of egresos) {
        totalEgreso += egreso.valor;
    }
    return totalEgreso;
}

const formatoMoneda = (valor) => {
    return valor.toLocaleString('en-US', {style:'currency', currency:'USD', minimumFractionDigits:2});    
}

const formatoPorcentaje = ( valor ) => {
    return valor.toLocaleString('en-US', {style:'percent', minimumFractionDigits:2});    
}

let cargarCabecero = () =>{
    let presupuestoTotal = totalIngresos() - totalEgresos();
    let porcentajeEgreso = totalEgresos() / totalIngresos();
    console.log(totalIngresos());
    console.log(totalEgresos());
    console.log(porcentajeEgreso);
    document.getElementById('presupuesto').innerHTML = formatoMoneda(presupuestoTotal);
    document.getElementById('ingresos').innerHTML = formatoMoneda(totalIngresos());
    document.getElementById('egresos').innerHTML = formatoMoneda(totalEgresos());
    document.getElementById('porcentaje').innerHTML = formatoPorcentaje(porcentajeEgreso);    

}

const cargarIngresos = () => {
    let ingresosHTML = '';
    for ( let ingreso of ingresos ) {
        ingresosHTML +=  crearIngresoHTML(ingreso);
    }

    document.getElementById('lista-ingresos').innerHTML = ingresosHTML
}

const eliminarIngreso = (id) => {
    let indiceEliminar = ingresos.findIndex(ingreso => ingreso.id === id ); 
    ingresos.splice( indiceEliminar, 1);    
    cargarCabecero();
    cargarIngresos();
}

const eliminarEgreso = (id) => {
    let indiceEliminar = egresos.findIndex(egreso => egreso.id === id ); 
    egresos.splice( indiceEliminar, 1);    
    cargarCabecero();
    cargarEgresos();
}

const crearIngresoHTML = (ingreso) => {
    let ingresosHTML = `
                      <div class="elemento limpiarEstilos">
                            <div class="elemento_descripcion">${ingreso.descripcion} </div>
                            <div class="derecha limpiarEstilos">
                                <div class="elemento_valor">+ ${formatoMoneda(ingreso.valor)}</div>
                                <div class="elemento_eliminar">
                                    <button class='elemento_eliminar--btn'>                           
                                        <ion-icon name="close-circle-outline"
                                                  onclick = "eliminarIngreso(${ingreso.id})"
                                        ></ion-icon>                                
                                    </button>
                                </div>
                            </div>
                       </div>` 
     return ingresosHTML;                  
}

const cargarEgresos = () => {
    let egresosHTML = '';
    for ( let egreso of egresos ) {
        egresosHTML +=  crearEgresosHTML(egreso);
    }

    document.getElementById('lista-egresos').innerHTML = egresosHTML
}

const crearEgresosHTML = (egreso) => {
    let egresoHTML = ` 
    <div class="elemento limpiarEstilos" >
        <div class="elemento_descripcion">${egreso.descripcion}</div>
        <div class="derecha limpiarEstilos">
            <div class="elemento_valor">-${formatoMoneda(egreso.valor)}</div>
            <div class="elemento_porcentaje">${ formatoPorcentaje(egreso.valor / totalEgresos()) }</div>
            <div class="elemento_eliminar">
                <button class='elemento_eliminar--btn'>                           
                <ion-icon name="close-circle-outline"
                            onclick = "eliminarEgreso(${egreso.id})"
                ></ion-icon>    
                </button>
            </div>
        </div>
    </div>`;

    return egresoHTML;
}

let cargarApp = () => {
    cargarCabecero();
    cargarIngresos();
    cargarEgresos();
}

let agregarDato = () => {
    let forma = document.forms['forma'];
    console.log(forma);
    let tipo = forma['tipo'];  
    let descripcion = forma['descripcion'];  
    let valor = forma['valor'];  
    if ( descripcion.value !== '' && valor.value !== '') {
        if ( tipo.value === 'ingreso' ) {
            ingresos.push(new Ingreso (descripcion.value, Number(valor.value)));
            cargarCabecero();
            cargarIngresos();

        } else if ( tipo.value === 'egreso' ) {
            egresos.push(new Egreso (descripcion.value, Number(valor.value)));
            cargarCabecero();
            cargarEgresos();

        }
    }
}     