import { EgresoServicio } from './egreso/egreso.servicio';
import { IngresoServicio } from './ingreso/ingreso.servicio';
import { Component } from '@angular/core';
import { Ingreso } from './ingreso/ingreso.model';
import { Egreso } from './egreso/egreso.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = 'presupuesto-app';

  ingresos: Ingreso[] =[];
  egresos:  Egreso[] = [];

  constructor ( private ingresoServicio:IngresoServicio, private egresoServicio:EgresoServicio) {
        this.egresos = this.egresoServicio.egresos;
        this.ingresos = this.ingresoServicio.ingresos;
  }

  getTotalIngreso() {
    let totalIngreso: number = 0;
    console.log("entra a totalIngreso");
    this.ingresos.forEach( ingreso => {
         console.log(ingreso.valor);
         totalIngreso += ingreso.valor;
      });
      return totalIngreso;
  }

  getTotalEgreso() {
    let totalEgreso: number = 0;
    this.egresos.forEach( egreso => { totalEgreso += egreso.valor;
      });
      return totalEgreso;
  }

  getPorcentajeTotal(){
    return this.getTotalEgreso() / this.getTotalIngreso();
  }

  getPresupuestoTotal() {
    return this.getTotalIngreso() - this.getTotalEgreso();
  }

}
