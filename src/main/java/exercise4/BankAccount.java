package exercise4;

public class BankAccount {

    public String name;
    public String surname;
    public int accountNumber;
    public double balance;
    public double limit;

    // Konstruktor (wie der Test ihn erwartet)
    public BankAccount(String name, String surname, int accountNumber, double balance, double limit) {
        //ist der bau plan für jeden kundne
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.limit = limit; // this sagt wer genau gemeint ist
    }

    // für einzahlungen
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // für abhebungen
    public void withdraw(double amount) {
        // darf das Limit nicht überschreiten
        if (amount > limit) {
            System.out.println("Abhebung über Limit nicht erlaubt!");
            return;
        }

        // darf nicht mehr abheben, als Guthaben vorhanden
        if (amount > balance) {
            System.out.println("Nicht genügend Guthaben!");
            return;
        }

        balance -= amount;
    }

    // toString: Gibt alle Infos über das Konto zurück
    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
