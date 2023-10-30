function sorting(arr) {
    var len = arr.length;
    for (var i = 0; i < len - 1; i++) {
        var index = i;
        for (var j = i + 1; j < len; j++) {
            if (arr[j] > arr[index]) {
                index = j;
            }
        }
        if (index !== i) {
            var temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    return arr;
}
var arr = [5, 2, 8, 9, 4];
var sortedArr = sorting(arr);
console.log(sortedArr);
