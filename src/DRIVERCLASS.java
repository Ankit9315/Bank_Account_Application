import java.util.Scanner;
public class DRIVERCLASS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Create array of accounts
        ACCOUNT account[]=new ACCOUNT[10];
        int numaccounts=0;
        int choice;
        do{
            choice=menu(sc);
            System.out.println();
            if(choice==1){
                account[numaccounts++]=createAcount(sc);
            }
            else if(choice==2){
                dodeposit(account,numaccounts,sc);
            }else if(choice==3){
                dowithdraw(account,numaccounts,sc);
            }else if(choice==4){
                applyInterest(account,numaccounts,sc);
            }else{
                System.out.println("Thank you for connecting");
            }
            System.out.println();
        }while(choice!=5);
    }
    public static int accountmenu(Scanner sc){
        System.out.println("Select Account Type: ");
        System.out.println("1.CheckingAccount");
        System.out.println("2.Saving Account");
        int choice;
        do{
            System.out.println("Enter choice: ");
            choice=sc.nextInt();
        }while(choice<1 || choice>2);
            return choice;
    }
    public static void dodeposit(ACCOUNT account[],int count,Scanner sc) {
        System.out.println("Please Enter Your Account number: ");
        int accountNumber = sc.nextInt();
        int index = searchAccount(account, accountNumber, count);
        if (index >= 0) {
            System.out.printf("Please Enter Deposit Amount: ");
            double amount = sc.nextDouble();
            account[index].deposit(amount);
        }else
            System.out.println("You entered Wrong account Number");
    }
    public static void dowithdraw(ACCOUNT account[],int count,Scanner sc){
        System.out.println("Please Enter Your Account number: ");
        int accountNumber = sc.nextInt();
        int index = searchAccount(account, accountNumber, count);
        if (index >= 0) {
            System.out.printf("Please Enter Withdraw Amount: ");
            double amount = sc.nextDouble();
            account[index].withdraw(amount);
        }else
            System.out.println("You entered Wrong account Number");
    }
    public static void applyInterest(ACCOUNT account[],int count,Scanner sc){
        System.out.println("Please Enter Your Account number: ");
        int accountNumber = sc.nextInt();
        int index = searchAccount(account, accountNumber, count);
        if (index >= 0) {
            if(account[index] instanceof SAVINGACCOUNT) {
                ((SAVINGACCOUNT)account[index]).applyinterest();
            }
        }else
            System.out.println("You entered Wrong account Number");
    }

    public static int searchAccount(ACCOUNT[] account, int accountNumber,int count) {
        for(int i=0;i<count;i++){
            if(account[i].getAccountnumber()==accountNumber){
                return 1;
            }
        }
        return -1;
    }

    public static ACCOUNT createAcount(Scanner sc){
        ACCOUNT account=null;
        int choice=accountmenu(sc);
        int accountnumber;
        System.out.println("Enter Account Number : ");
        accountnumber=sc.nextInt();
        if(choice==1){
            System.out.print("Enter Transaction fee: ");
            double fee=sc.nextDouble();
            account=new CHECKINGACCOUNT(accountnumber,fee);
        }else{
            System.out.println("Please Enter interest rate: ");
            double ir= sc.nextDouble();
            account=new SAVINGACCOUNT(accountnumber,ir);
        }
        return account;
    }
    public static int menu(Scanner sc){
        System.out.println("Bank Account menu");
        System.out.println("1.Create New Account");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Apply Interest");
        System.out.println("5.Quit");
        int choice;
        do{
            System.out.println("Enter choice:");
            choice=sc.nextInt();
        }while(choice <1 || choice >4);
        return choice;
    }

}
