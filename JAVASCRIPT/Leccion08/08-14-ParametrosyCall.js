let persona1 = { 
    nombre: "Juan",
    apellido: "Perez",

    nombreCompleto: function (titulo, telefono) {
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', ' + telefono;
    }
}

let persona2 = {
    nombre: 'Carlos',
    apellido: 'Lara' 
}

console.log(persona1.nombreCompleto("Lic", 122141));

console.log(persona1.nombreCompleto.call( persona2,"Lic", 155151313));
