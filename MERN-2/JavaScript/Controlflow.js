// check Even/Odd
let num = 4;
if (num % 2 === 0) {
    console.log("Even");
} else {
    console.log("Odd");
}

// Check Admin / canVote
let role = "Admi";
let age = 20;

if (role === "Admin") {
    console.log("Access granted.");
}
else {
    console.log("Access Denied");
}

if (age >= 18) {
    console.log("Can vote.");
} else {
    console.log("Cannot vote.");
}


// can Drive (if age > 18 and have License)
let userAge = 20;
let hasLicense = true;

if (userAge > 18) {
    if (hasLicense) {
        console.log("You can drive.");
    } else {
        console.log("You need a license to drive.");
    }
} else {
    console.log("You are too young to drive.");
}

let day = 3;

switch (day) {
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    default:
        console.log("Invalid day");
}

function checkEvenOdd(value){
    if (value % 2 == 0){
        console.log(`${value} is EVEN`);
    } else{
        console.log(`${value} is ODD`);

    }
}

function checkIsAdminOrNot(value){
    if(value === true){
        console.log(`User is Admin`);
    }else{
        console.log(`Guest User`);
    }
}


function CandidateCanVote(age){
    if (age >= 18 && age <= 100){
        console.log(`Yes Candidate can vote`);
    }
    else{
        console.log(`No! Cndidate cant vote .`);
    }
}

let agee = 16;
let haveLicense = true;
userCanDriveOrNot(agee, haveLicense);
function userCanDriveOrNot(agee, License){
    if(agee >= 18){
        if(License === true){
            console.log(`$User Can Drive$`)
        }
        else{
            console.log(`User cant drive`)
        }
    }
}


function getGrade(marks){
    switch (true){
        case (marks >= 90 && marks <= 99):
            return "A+";
        case (marks >= 80 && marks <= 89):
            return "A";
        case (marks >= 70 && marks <= 79):
            return "B";
        case (marks >= 60 && marks <= 69):
           return "C";
        case (marks >= 33 && marks <= 59):
            return "D";
        case (marks >= 0 && marks <= 32):
            return "FAIL";
        default: 
            return "Invalid marks";
                }
            }
                    let value = getGrade(80);
                    console.log(value);

function WhoWins(user, computer) {

    user = user.toLowerCase();
    computer = computer.toLowerCase();

    const choices = ["rock", "paper", "scissor"];

    if (!choices.includes(user) || !choices.includes(computer)){
        return "Invalid input";
    }

    if (user === computer) {
        return "It's a tie!";
    }


    if (
        (user === "rock"    && computer === "scissor") ||
        (user === "paper"   && computer === "rock")    ||
        (user === "scissor" && computer === "paper")
    ) {
        return "User Wins!";
    } 
    
        return "Computer Wins!";
}
console.log(WhoWins("Rock", "Scissor"));


function printTable(number){
    console.log("Table START ------");

    for(let i = 1; i <= 10; i++){
        console.log(`${number} X ${i} = ${number * i}`);
    }

    console.log("Table ENDs ------");
}

printTable(90);

