class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;
    boolean isActive;
    private short pin;

    void updateStatus(){
        if(balance<=1000){
        isActive=false;
    }else{
        isActive=true;
    }
    }
    
    BankAccount(String name,double bal,int accountNum,short pwd){
        accountHolderName= name;
        accountNumber=accountNum;
        balance=bal;
        pin=pwd;
        updateStatus();
    }

    double deposit(double amount,int Acnum,String name){
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
        System.out.println("Account holder Name: "+accountHolderName+" ,Deposited: "+amount+" ,New Balance: "+balance+" ,Active: "+isActive);
        return balance;
    }

    double withdraw(double amount,short pwd){
        if(pwd==pin){
            if(amount<=0){
            System.out.println("Withdraw failed: Amount must be positive.");
            return balance;
        }
        if(isActive&&amount<=balance){
        balance-=amount;
        updateStatus();
        System.out.println("Withdraw: "+amount+" ,New Balance: "+balance+" ,Active: "+isActive);
        return balance;
    }else{
        System.out.println("Withdrawal failed: Account inactive or insufficient funds.");
        
    }
    return balance;
        }
        System.out.println("Pin you entered is incorrect.");
        return 404;
        
    }   

    void displayInfo(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Account Active: "+isActive);
    }

    double checkBalance(short pwd){
        if(pwd==pin){
            System.out.println("Available balance: "+balance);
            return balance;
        }
        System.out.println("Pin you entered is incorrect. Enter correct pin to get the balance.");
        return 404;
    }

}
public class BankAccountManagementSystem {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Steve Rogers", 1000000.5666,327648730,(short)6969);
        account1.displayInfo();
        
        account1.deposit(1000, 327648730, "Steve Rogers");
        account1.deposit(1000, 327648730, "Steve Roger");
        account1.withdraw(1001000, (short)6969);
        account1.deposit(1000000, 327648730, "Steve Rogers");
        account1.checkBalance((short)6969);
        account1.deposit(-1000, 327648730, "Steve Rogers");

        BankAccount account2=new BankAccount("Tony Stark", 2000000.68686, 424747967, (short)0014);
        account2.deposit(10000, 424747967, "Tony Stark");
            }
}
