function fold(arr, accu, callback) {
    if(!arr || !arr.length) return undefined;
    for(var i = 0; i < arr.length; i++){
        accu = callback.call(arr[i], accu, arr[i]);
    }
    return accu;
}