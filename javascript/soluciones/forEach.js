/*
 * Cree una función forEach como la comentada en clase agregando las siguientes características:
 *
 * 1) Debe funcionar tanto para arreglos como objetos (iterar propiedades de un objeto).
 * 2) Además debe enviar en cada iteración: el índice o el nombre de la propiedad según sea el caso.
 * 3) Debe ofrecer un mecanismo para que se pueda romper el ciclo. (Podría usarse el valor de retorno del callback.)
 *
 */

function forEach(target, callback) {
    for(var idx in target) {
        if(callback.apply(target[idx], [idx]) === false)
            break;        
    }
};