class BankAccount {
    // This class is useful to setup account information along with functionalities in it. 
    String accountHolderName;
    int accountNumber;
    double balance;
    boolean isActive;
    private short pin;
    String accountType; //This particular field will help us setup account as Saving Account or Current Account.


    void updateStatus(){
        if(balance<1000){
        isActive=false;
    }else{
        isActive=true;
    }
    }
    // Below is the constructor of BankAccount class
    BankAccount(String name,double bal,int accountNum,short pwd,String accType){
        accountHolderName= name;
        accountNumber=accountNum;
        balance=bal;
        pin=pwd;
        updateStatus();
        accountType=accType;
    }

    double deposit(double amount,int Acnum,String name){
        // This method will help the user to deposit money in the account.
        if(amount<=0){
            System.out.println("Deposit of "+amount+" failed. Amount must be positive.");
            return balance;
        }
        if(Acnum!=accountNumber||name!=accountHolderName){
            System.out.println("Deposit failed: Account details are not accurate.");
            return balance;
        }
        balance+=amount;
        updateStatus();
        System.out.println("Account holder Name: "+accountHolderName+" ,Deposited: "+amount+" ,New Balance: "+balance+" ,Active: "+isActive);//I have added this particular line so that the user get information about the transaction
        
        return balance;
    }

    double withdraw(double amount,short pwd){
        // As the name Suggest this Java method will help user withdraw the money and update the state of the account.
        if(pwd==pin){
            if(amount<=0){
            System.out.println("Withdraw failed: Amount must be positive.");
            return balance;
        }
        if(isActive&&amount<=balance){
        balance-=amount;
        updateStatus();
        System.out.println("Withdraw: "+amount+" ,New Balance: "+balance+" ,Active: "+isActive); //I have added this particular line so that the user get information about the transaction
        return balance;
    }else{
        System.out.println("Withdrawal failed: Account inactive or insufficient funds.");
        
    }
    return balance;
        }
        System.out.println("Transaction Failed: Incorrect PIN Entered.");
        return -1;
        
    }   

    void displayInfo(){
        // This java method will help us see all the relevant information about the account.
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Account Active: "+isActive);
    }

    double checkBalance(short pwd){
        // This java method will help us know the balance of the account.
        if(pwd==pin){
            System.out.println("Available balance: "+balance);
            return balance;
        }
        System.out.println("Pin you entered is incorrect. Enter correct pin to get the balance.");
        return 404;
    }

    void calculateInterest(double rate,int timeInYears){
        // This method will calculate intrest rate and that too if the account is a Saving Account
        if(accountType=="Saving Account"){
            System.out.println((balance*rate*timeInYears)/100);
        }else{
        System.out.println("Your account is not a saving account");
        }
    }

    void changePin(short oldPin,short newPin){
        if(oldPin==pin){
          pin=newPin;
          System.out.println("PIN has been changed.");
        }else{
          System.out.println("To change the pin enter the correct pin");
        }
    }

}
public class BankAccountManagementSystem {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Steve Rogers", 1000000.5666,327648730,(short)6969,"Saving Account");
        account1.displayInfo();
        
        account1.deposit(1000, 327648730, "Steve Rogers");
        account1.deposit(1000, 327648730, "Steve Roger");
        account1.withdraw(1001000, (short)6969);
        account1.deposit(1000000, 327648730, "Steve Rogers");
        account1.checkBalance((short)6969);
        account1.deposit(-1000, 327648730, "Steve Rogers");

        BankAccount account2=new BankAccount("Tony Stark", 2000000.68686, 424747967, (short)0014, "Current Account");
        account2.deposit(10000, 424747967, "Tony Stark");

        System.out.println(account1.accountType);
        System.out.println(account2.accountType);

        account1.calculateInterest(6, 2);
        account2.calculateInterest(6, 2);
        

        account1.changePin((short)6969, (short)9696);
        account1.withdraw(100, (short)9090);
        account1.withdraw(100, (short)6969);
        account1.withdraw(100, (short)9696);
   
        }
}


