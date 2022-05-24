public class CHECKINGACCOUNT extends ACCOUNT{
    private static double FEE=2.5;
    public CHECKINGACCOUNT(){
        super();
    }
    public CHECKINGACCOUNT(int accountnumber,double fee){
        super(accountnumber);
        FEE=fee;
    }
    /**
     * Function to deposit the smount into the account as long as
     * the parameters is>0
     * <p>
     * Apply Traction fee further checking account
     *
     * @param amount VALUE TO BE DEPOSIT
     */
    public void deposit(double amount) {
        if(amount>0){
            balance+=amount;
            System.out.printf("Account %.2f deposited/n ",amount);
            balance+=FEE;
            System.out.printf("Fee %.2f Applied/n ",FEE);
            System.out.printf("Current Balance is: %.2f/n",balance);
        }
        else{
            System.out.println(("A NEgative amount cannot be deposited"));
        }
    }

    /**
     * fuction to withdraw the amount
     *
     * @param amount value to be withdraw
     */
    public void withdraw(double amount) {
        if(amount>0){
            if((amount+FEE)<=balance){
                System.out.printf("Amount of %.2f withdraw from accoun/n",amount);
                balance-=amount;
                System.out.printf("Fee of %.2f applied/n",FEE);
                balance-=FEE;
                System.out.printf("Current Balance is: %.2f/n",balance);
            }
        }else{
            System.out.println("Negative amount cannot be withdraw");
        }
    }

}
