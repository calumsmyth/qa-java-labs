package lab5;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1, "Calum", 100);

        acc.deposit(50.0);
        acc.withdraw(30.0);

        System.out.println(acc.getBalance());


    }

    class Account {
        private int id;
        private String owner;
        private double balance;

        //Constructor
        public Account(int id, String owner, double balance) {
            this.id = id;
            this.owner = owner;
            this.balance = balance;
        }
    }

        public void Deposit(double amount){
            balance += amount;
        }
        void Withdraw( double amount){
            balance -= amount;
        }
    };