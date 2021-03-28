/*
    Banking system that checks the balance, widhrawal etc...
*/
class Account{
    
    long accountNo = 0;
    double balance = 0.0;

    Account(){
        this.accountNo = 0;
        this.balance = 0.0;
    }
    Account(long acc, double bal){
        this.accountNo = acc;
        this.balance = bal;
    }
    
}

class Savings extends Account{
    double interestRate = 0.0;
    final int minimumBalance = 1500;
    Savings(){
        this.accountNo = 0;
        this.interestRate = 4.5;
        this.balance = 0.0;
    }
    Savings(long acct, double bal, double inter){
        this.accountNo = acct;
        this.balance = bal;
        this.interestRate = inter;
    }
    void checkBalance(){
        System.out.println("Your Balance is: "+this.balance);
    }
    void dipositBalance(double add){
        this.balance = this.balance + add;
    }
    void widhrawalBalance(double wbal){
        if((this.balance-wbal) >= this.balance){
            this.balance = this.balance-wbal;
        } else {
            System.out.println("Insuficient Balance....\n Your Balance is: "+this.balance);
        }
    }
}

class Current extends Account{
    long overdraftLimit = 0;
    long overdraft = 0;
    Current(){
        this.accountNo = 0;
        this.balance = 0;
        this.overdraftLimit = 10000;
        this.overdraft = 0;
    }
    Current(long accno, long odlmt, double bal){
        this.accountNo = accno;
        this.balance = bal;
        this.overdraftLimit = odlmt;
        this.overdraft = 0;
    }
    void checkBalance(){
        System.out.println("Your Balance is: "+this.balance);
    }
    void widhrawalBalance(double wbal){
        if((this.balance-wbal) >= this.balance){
            this.balance = this.balance-wbal;
        } else {
            System.out.println("Insuficient Balance....\n Your Balance is: "+this.balance);
        }
    }
    void takeOD(long odwid){
        if((this.balance)>=0){
            this.balance = this.balance - odwid;
        } else {
            System.out.println("You can not widrawal that amount because of yout balance is : "+this.balance);
        }
    }
    
}

public class PrecticalExamPro0022 {
    public static void main(String[] args) {
        Savings yash = new Savings(1526, 2000, 5);
        yash.dipositBalance(6000);
        yash.checkBalance();
        yash.widhrawalBalance(1000);
        yash.checkBalance();

    }
}
