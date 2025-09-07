package Bank_Account_Management_System;

class BankAccount {
    String accountHolderName;
    double balance;
    boolean isActive=true;
    
    BankAccount(String name,double bal){
        accountHolderName= name;
        balance=bal;
    }

    double deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount+" .New Balance: "+balance);
        return balance;
    }

    double withdraw(double amount){
        if(isActive&&amount<=balance){
        balance-=amount;
        return balance;
    }else{
        System.out.println("Withdrawal failed: Account inactive or insufficient funds.");
        return balance;
    }
    }   

    void displayInfo(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println("Account Active/Inactive: "+isActive);
    }

}
public class BankAccountManagementSystem {
    public static void main(String[] args){

    }
}
