let persona = {
    nombre : 'Juan',
    apellido: 'Perez',
    email:'jPerez@mail.com',
    edad: 28,
    nombreCompleto: function () {
        return this.nombre + " " + this.apellido
    }
}

// Concatenar cada valor de cada propiedad
console.log( persona.nombre + ", " + persona.apellido + ', ' + persona.email );

// for un

for ( nombrePropiedad in persona ) {
    console.log( persona[nombrePropiedad]);
}

// Object.values

let personaArray = Object.values(persona);
console.log(personaArray);

let personaString = JSON.stringify(persona);
console.log(personaString);

