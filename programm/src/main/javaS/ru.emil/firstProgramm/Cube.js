var t = setInterval(move ,2000);
var pos = 1;
var a;
var box = document.getElementById("box");

function move() {
    if(a >= 20 ){
        a--;
        box.style.right -= pos + "px"
    }else {
        a++;
        box.style.right += pos + "px"
    }
}
