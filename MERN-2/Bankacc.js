function createBankAccount(holder, mobile, email, initialBalance) {

  let balance = initialBalance;
  let accountHolder = holder;
  let mobileNumber = mobile;
  let emailAddress = email;

  return {

    deposit: function(amount) {
      if (amount > 0) {
        balance += amount;
        console.log(`Deposited: ₹${amount}. New Balance: ₹${balance}`);
      }
    },


    withdraw: function(amount) {
      if (amount > 0 && amount <= balance) {
        balance -= amount;
        console.log(`Withdrew: ₹${amount}. Remaining Balance: ₹${balance}`);
      } else {
        console.log("Insufficient funds or invalid amount.");
      }
    },


    checkBalance: function() {
      console.log(`Current Balance: ₹${balance}`);
      return balance;
    },


    checkBankProfile: function() {
      return {
        holder: accountHolder,
        mobile: mobileNumber,
        email: emailAddress
      };
    }
  };
}

const myAccount = createBankAccount("Sue Storm", "255-698-0199", "suesto@gmail.com", 1000);

myAccount.deposit(500);
myAccount.withdraw(200);
myAccount.checkBalance();

console.log(myAccount.checkBankProfile());



