const bulb = document.getElementById("bulb");

function turnOn() {
    bulb.style.background = "#ffe100";
    bulb.style.boxShadow = "0 0 40px yellow";
}

function turnOff() {
    bulb.style.background = "white";
    bulb.style.boxShadow = "none";
}