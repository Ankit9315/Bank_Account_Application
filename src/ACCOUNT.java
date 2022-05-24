public abstract class ACCOUNT {
    private int  accountnumber;
    protected double balance;
    public ACCOUNT(){
        super();
    }
    public ACCOUNT(int accountnumber){
        this.accountnumber=accountnumber;
        balance=0;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountnumber() {
        return this.accountnumber;
    }

    //Abstract
    /**Function to deposit the smount into the account as long as
    *the parameters is>0
     *
    *Apply Traction fee further checking account
    *@param amount VALUE TO BE DEPOSIT
     */
    public abstract void deposit(double amount) ;

    /**fuction to withdraw the amount
     * @param amount value to be withdraw

     */
    public  abstract void withdraw(double amount);
}
