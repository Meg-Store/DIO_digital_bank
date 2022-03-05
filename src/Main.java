public class Main {

    public static void main(String[] args) {
        Accounts ca = new CheckingAccount();
        ca.deposit(100);

        Accounts sa = new SavingsAccount();
        ca.transfer(100, sa);

        ca.printStatement();
        sa.printStatement();
    }
}
