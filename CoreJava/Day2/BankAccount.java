<<<<<<< HEAD
package DAY02;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber,balance;
    public BankAccount(long accountNumber,long balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    private void AccountDetails(){
        System.out.println(" ---Account Details--- ");
        System.out.println("AccountNumber="+accountNumber);
        System.out.println("AccountBalance="+balance+"\n");
    }
    public void Deposit(int amount) {
            balance += amount;
            System.out.println(amount+" Deposited");
        System.out.println("TotalBalance="+balance+"\n");
    }
    private void Withdraw(int amount){
        if (amount<=balance) {
            balance -= amount;
            System.out.println(amount+" Withdrawn");
            System.out.println("TotalBalance="+balance+"\n");
        }
        else {
            System.out.println("Insufficient Amount");
        }
    }
    public void CheckBalance(){
        System.out.println("Total Balance= "+balance);
    }
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(12345678,5000);
        acc.AccountDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Deposit =");
        acc.Deposit(sc.nextInt());
        System.out.println("Enter amount to withdrw=");
        acc.Withdraw(sc.nextInt());
        acc.CheckBalance();
    }
}
=======
package DAY02;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber,balance;
    public BankAccount(long accountNumber,long balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    private void AccountDetails(){
        System.out.println(" ---Account Details--- ");
        System.out.println("AccountNumber="+accountNumber);
        System.out.println("AccountBalance="+balance+"\n");
    }
    public void Deposit(int amount) {
            balance += amount;
            System.out.println(amount+" Deposited");
        System.out.println("TotalBalance="+balance+"\n");
    }
    private void Withdraw(int amount){
        if (amount<=balance) {
            balance -= amount;
            System.out.println(amount+" Withdrawn");
            System.out.println("TotalBalance="+balance+"\n");
        }
        else {
            System.out.println("Insufficient Amount");
        }
    }
    public void CheckBalance(){
        System.out.println("Total Balance= "+balance);
    }
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(12345678,5000);
        acc.AccountDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Deposit =");
        acc.Deposit(sc.nextInt());
        System.out.println("Enter amount to withdrw=");
        acc.Withdraw(sc.nextInt());
        acc.CheckBalance();
    }
}
>>>>>>> 6dcaddd8bd1fefda478f86ae604161571a2f6db1
