package ExercicioConstrutores;

public class Conta {
    private int accountNumber;
    private String name;
    private double balance;

    public Conta(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Conta(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValuie() {
        return balance;
    }



    public int getAccountNumber() {
        return accountNumber;
    }



    public void withdraw(double value){
        balance -= value + 5.0;

    }

    public void deposit(double value){
        balance += value;
    }


    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
