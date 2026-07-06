
console.log("global Execution Content starts");

var globalVariable = "I am a global Variable";

console.log(globalVariable);
// console.log(globalFunction);
console.log(greet());
greet();

// globalFunction;

// console.log("Global Execution Context ends");

// var globalFunction = function(){
//     console.log("Inside global function");
// };

function greet(){
    var name = 'Hashtag';
    console.log('Inside Global Function');
    return 900;
}