package cisc181.lab_2;


public class Account {
    private String customerName;
    private double balance;
    private double interestRate;
    private double limit;

//    /**
//     * constructor that accepts three parameters and initializes all 3 data fields
//     * @param customerName value of cus#
//     * @param balance value of bal#
//     * @param interestRate value of in#
//     */
//    public Account(String customerName, double balance, double interestRate) {
//        this.customerName = customerName;
//        this.balance = balance;
//        this.interestRate = interestRate;
//    }

    /**
     * call new constructor with a default value of 0 for the limit
     *
     * @param customerName
     * @param balance
     * @param interestRate
     */
    public Account(String customerName, double balance, double interestRate) {
        this(customerName, balance, interestRate, 0);
    }

    /**
     * a new constructor that allows for all 4 properties to be initialized
     * @param customerName value of cu#
     * @param balance value of ba#
     * @param interestRate value of in#
     * @param limit value of limit
     */
    public Account(String customerName, double balance, double interestRate, double limit) {
        this.customerName = customerName;
        this.balance = balance;
        this.interestRate = interestRate;
        this.limit = limit;
    }

    /**
     * Accessor methods
     * @return value of cus#
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Accessor methods
     * @return value of bal#
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Accessor methods
     * @return value of in#
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * mutator method deposit to deposit a given double amount into the balance
     * @param amount given double amount to deposit
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * withdraw a given double amount from the balance
     *
     * @param amount money to withdraw
     * @return true withdraw success
     * false withdraw failure
     */
//    public boolean withDraw(double amount) {
//        if (amount <= balance) {
//            balance -= amount;
//            return true;
//        } else {
//            return false;
//        }
//    }
    public boolean withDraw(double amount) {
        if ((balance - amount) >= limit) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }


    /**
     * update the balance by adding monthly interest
     */
    public void addMonthlyInterest() {
        balance += balance * interestRate;
    }

    /**
     * takes another Account as a parameter, and pays off as much of the debt on that Account as possible
     * @param account another Account to pays off
     */
    public void payoffBalance(Account account) {
        if ((account.getBalance() + this.balance) >= 0) {
            account.withDraw(0 - this.balance);
            this.balance = 0;
        } else {
            double temp = account.getBalance();
            account.withDraw(temp);
            this.balance += temp;
        }
    }


}
