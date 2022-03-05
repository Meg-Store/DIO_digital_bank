public abstract class Accounts implements IAccounts{

    private static final int DEFAULT_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected final int branch;
    protected final int number;
    protected int balance;

    public Accounts() {
        this.branch = Accounts.DEFAULT_BRANCH;
        this.number = SEQUENTIAL++;
    }
    public int getBranch() {
        return branch;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccounts destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    protected void printCommonsInfo() {
        System.out.println(String.format("Branch : %d" , this.branch));
        System.out.println(String.format("Number : %d" , this.number));
        System.out.println(String.format("Balance : %d" , this.balance));
    }
}


