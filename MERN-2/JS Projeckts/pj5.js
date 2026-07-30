const canvas = document.getElementById("myCanvas");
const ctx = canvas.getContext("2d");

const colorBtn = document.getElementById("color-btn");
const sizeSlider = document.getElementById("size-slider");
const clearBtn = document.getElementById("clear-btn");

const darkBtn = document.querySelectorAll(".theme-btn")[0];
const lightBtn = document.querySelectorAll(".theme-btn")[1];

canvas.width = canvas.offsetWidth;
canvas.height = canvas.offsetHeight;

let drawing = false;

ctx.strokeStyle = colorBtn.value;
ctx.lineWidth = sizeSlider.value;
ctx.lineCap = "round";

canvas.addEventListener("mousedown", function(e) {
    drawing = true;
    ctx.beginPath();
    ctx.moveTo(e.offsetX, e.offsetY);
});

canvas.addEventListener("mousemove", function(e) {

    if (!drawing) return;

    ctx.lineTo(e.offsetX, e.offsetY);
    ctx.stroke();

});

canvas.addEventListener("mouseup", function() {
    drawing = false;
});

canvas.addEventListener("mouseleave", function() {
    drawing = false;
});

colorBtn.addEventListener("change", function() {
    ctx.strokeStyle = colorBtn.value;
});

sizeSlider.addEventListener("input", function() {
    ctx.lineWidth = sizeSlider.value;
});

clearBtn.addEventListener("click", function() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
});

darkBtn.addEventListener("click", function() {
    document.body.style.backgroundColor = "#222";
    canvas.style.backgroundColor = "rgb(0, 68, 170)";
});

lightBtn.addEventListener("click", function() {
    document.body.style.backgroundColor = "rgb(190, 215, 236)";
    canvas.style.backgroundColor = "white";
});

let brushSize = 5;

ctx.lineWidth = brushSize;
canvas.addEventListener("wheel", function(event) {

    event.preventDefault();

    if (event.deltaY < 0) {
        brushSize++;
    } else {
        brushSize--;
    }

    if (brushSize < 1) {
        brushSize = 1;
    }

    if (brushSize > 50) {
        brushSize = 50;
    }

    ctx.lineWidth = brushSize;

    sizeSlider.value = brushSize;

});