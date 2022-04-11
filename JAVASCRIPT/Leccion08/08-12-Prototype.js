/// Funcion constructor del tipo persona
function Persona( nombre = "Juan", apellido = "Perez" , email="tot@email.com") {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email
};

Persona.prototype.telefono = 12241;

NN = new Persona();
console.log(NN);
console.log(NN.telefono);

padre = new Persona("Maxi","Weihmüller", "MWeihmuller@mail" );
padre.telefono = 12141;
console.log(padre);

madre = new Persona("Liliana", "Lucchini", "LLucchini@gmail")
madre.telefono = 9999;
console.log(madre);

