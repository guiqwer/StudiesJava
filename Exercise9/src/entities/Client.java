package entities;

public class Client {
    private int numberAccount;
    private String accountHolder;
    public double accountBalance;

    //Constructors

    public Client(int numberAccount, String accountHolder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        addAccountBalance(initialDeposit);
    }

    public Client(int numberAccount, String accountHolder){ // case is no initial deposit
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
    }

    // Gets and Seters

    public double getAccountBalance(){
        return accountBalance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void addAccountBalance(double deposit) {
        accountBalance += deposit;
    }

    public void removeAccountBalance(double withdraw) {
        accountBalance -= withdraw + 5.00;
    }

    public String toString(){
        return "Account "
                +
                getNumberAccount()
                +
                ", Holder:  "
                +
                getAccountHolder()
                +
                ", Balance: R$ "
                +
                String.format("%.2f", getAccountBalance());
    }
}



