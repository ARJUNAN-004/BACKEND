package DAY02;

 class Account {
    private int accountNumber;
    private double Balance;
    public Account(){
        this.accountNumber=11223344;
        this.Balance=20000.20;
    }
    public Account(int accountNumber){
        this.accountNumber=accountNumber;
        this.Balance=10000.10;
    }
     public Account(int accountNumber,double Balance){
         this.accountNumber=accountNumber;
         this.Balance=Balance;
     }
    public void Display(){
        System.out.println("Account Number= "+accountNumber);
        System.out.println("Account Balance= "+Balance);
    }
    public static void main(String[] args) {
        Account acc1=new Account();
        Account acc2=new Account(1234567);
        Account acc3=new Account(12345,40000.40);
        acc1.Display();
        acc2.Display();
        acc3.Display();
    }
}
