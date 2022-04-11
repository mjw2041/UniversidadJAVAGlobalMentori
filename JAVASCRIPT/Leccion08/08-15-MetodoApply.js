let persona1 = { 
    nombre: "Juan",
    apellido: "Perez",

    nombreCompleto: function () {
        return this.nombre + " " + this.apellido;
    },

    nombreCompletoConTitulo: function ( titulo, telefono) {
        return titulo + ": " + this.nombre + " " + this.apellido + ", " + telefono;
    }
}

let persona2 = {
    nombre: 'Carlos',
    apellido: 'Lara' 
}

// Uso de    call para usar 
// con el metodo persona1.nombreCompleto con los datos de persona2

console.log(persona1.nombreCompleto());

console.log(persona1.nombreCompleto.apply(persona2));

console.log(persona1.nombreCompletoConTitulo("Lic", 11223344));

let arreglo = ['Ing', 1122334455];
console.log(persona1.nombreCompletoConTitulo.apply(persona2, arreglo));

