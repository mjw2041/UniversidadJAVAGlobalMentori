class Persona {
     static contadorPersona = 0;

     constructor ( nombre , apellido, edad) {
         this._idPersona = ++Persona.contadorPersona;
         this._nombre = nombre;
         this._apellido = apellido;
         this._edad = edad;
     }

     get idPersona() {
         return this._idPersona;
     }
         
     
     get nombre() {
         return this._nombre;
     }

     get apellido() {
         return this._apellido;
     }

     get edad (){
         return this_edad;
     }

     set nombre (nombre) {
         this._nombre = nombre;
     }

     set apellido ( apellido) {
         this._apellido = apellido;
     }

     set edad ( edad) {
         this._edad = edad;
     }

     toString (){
         return  `${this.idPersona} ${this.nombre} ${this.apellido} ${this.edad}`;
     }
}


persona1 = new Persona("Maximiliano", "Weihmuller", 50);
console.log(persona1);
console.log(persona1.toString());

persona1.nombre = "Pedro";
persona1.apellido = "Aranguren";
persona1.edad = 18;

console.log(persona1)
console.log(persona1.toString());



