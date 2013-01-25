/**
 * Map es una función que genera un nuevo arreglo tomando cada elemento del arreglo que se provee
 * y aplicándole la operación también provista.
 *
 * Escriba esta función y modifique el ejercicio incremento.html para use su nueva función map.
 *
 */

function map(lista, operacion) {
    var nuevo = [];
    for(var elem  in lista){
        nuevo[elem] = operacion.call(lista[elem], elem, lista[elem]);
    }
    
    return nuevo;
}