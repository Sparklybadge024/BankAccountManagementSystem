package Bank_Account_Management_System;

class BankAccount {
    String accountHolderName;
    double balance;
    boolean isActive;

    void updateStatus(){
        if(balance<=0){
        isActive=false;
    }else{
        isActive=true;
    }
    }
    
    BankAccount(String name,double bal){
        accountHolderName= name;
        balance=bal;
        updateStatus();
    }

    double deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit failed: Amount must be positive.");
            return balance;
        }
        balance+=amount;
        updateStatus();
        System.out.println("Deposited: "+amount+" .New Balance: "+balance);
        return balance;
    }

    double withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdraw failed: Amount must be positive.");
            return balance;
        }
        if(isActive&&amount<=balance){
        balance-=amount;
        updateStatus();
        return balance;
    }else{
        System.out.println("Withdrawal failed: Account inactive or insufficient funds.");
        
    }
    return balance;
    }   

    void displayInfo(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println("Account Active/Inactive: "+isActive);
    }

}
public class BankAccountManagementSystem {
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Steve Rogers", 1000000.5666);
        account1.displayInfo();
    }
}
