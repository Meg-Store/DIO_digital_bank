interface IAccounts {

        void withdraw(double value);

        void deposit(double value);

        void transfer (double value, IAccounts destinationAccount);

        void printStatement();
    }


