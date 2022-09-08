import { EgresoServicio } from './egreso.servicio';
import { Component, Input, OnInit } from '@angular/core';
import { Egreso } from './egreso.model';

@Component({
  selector: 'app-egreso',
  templateUrl: './egreso.component.html',
  styleUrls: ['./egreso.component.css']
})
export class EgresoComponent implements OnInit {

  egresos: Egreso[] = []
  @Input() ingresoTotal:number = 0;


  constructor(private egresoServicio: EgresoServicio) { }

  ngOnInit() {
     this.egresos = this.egresoServicio.egresos;
  }

  eliminarRegistro(egreso: Egreso) {

    this.egresoServicio.eliminar(egreso);
  }

  calcularPorcentaje(egreso: Egreso) {
    console.log('egreso.valor ' + egreso.valor);
    console.log(' this.ingresoTotal ' +  this.ingresoTotal);
    return egreso.valor / this.ingresoTotal;
  }
}
