const autos = ['BMW', 'Mercedes Benz', 'Volvo'];
console.log(autos);

console.log('Elemento 2 ' + autos[2]);

for ( let i = 0; i < autos.length; i++) {
    console.log('Elemento ' + i + ' ' + autos[i]);
}

autos[1] = 'MercedesBenz';
console.log('Elemento 2 ' + autos[1]);

console.log('Tamaño: ' , autos.length);
autos.push('Audi');

console.log('Tamaño: ' , autos.length);
console.log(autos);