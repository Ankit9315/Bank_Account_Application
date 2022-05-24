public class SAVINGACCOUNT extends ACCOUNT{
    private double interestrate;
    public SAVINGACCOUNT(){
        super();
    }
    public SAVINGACCOUNT(int accountnumber,double interestrate){
        super(accountnumber);
        this.interestrate=interestrate;
    }

    public double getInterestrate() {
        return this.interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }
    public double calcInterest(){
        return balance*interestrate;
    }
    public void applyinterest(){
      double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance/n",interest);
        deposit(interest);
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
        if(amount>0) {
            if (amount <= balance){
                System.out.printf("Amount of %.2f withdraw from accoun/n", amount);
            balance -= amount;
            System.out.printf("Current Balance is: %.2f/n", balance);
        }
        }else{
            System.out.println("Negative amount cannot be withdraw");
        }
    }
}
