package DAY02;
import java.util.Scanner;
class Bankacc{
    private String name;
    private int accNum;
    private double balance;

    public Bankacc(String name,int accNum){
        this.name=name;
        this.accNum=accNum;
        this.balance=10000.0;
    }

    public void Display(){
        System.out.println("--- Account Details ---");
        System.out.println("Account User = "+name);
        System.out.println("Account Number = "+accNum);
        System.out.println("Account Balance = "+balance);
    }

    public void Deposit1(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+" Deposited in Account...");
            System.out.println("Total Balance = "+balance);
        }
        else{
            System.out.println("Invalid Deposit Amount...");
        }
    }

    public void Withdraw1(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(amount+" Withdrawn from Account");
            System.out.println("Remaining Balance = "+balance);
        } else if(amount<=0){
            System.out.println("Invalid Input...");
        }
        else{
            System.out.println("Insufficient Amount...");
        }
    }

    public void CheckBalance1(){
        System.out.println("Current Balance = "+balance);
    }
}

public class BankingSystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name = ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number = ");
        int Number = sc.nextInt();

        Bankacc acc = new Bankacc(name, Number);
        acc.Display();

        while (true) {
            System.out.println("\n---- Banking System ----");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Choose an option: ");
            int opt=sc.nextInt();

            switch(opt){
                case 1:
                    System.out.print("Enter amount to deposit = ");
                    double Damount=sc.nextDouble();
                    acc.Deposit1(Damount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw = ");
                    double Wamount=sc.nextDouble();
                    acc.Withdraw1(Wamount);
                    break;
                case 3:
                    acc.CheckBalance1();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Input !!!...");
            }
        }
    }
}
