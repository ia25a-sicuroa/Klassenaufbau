
package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Max", "Mustermann", 11223, 1000.25, 500);

        int choice = -1;

        while (choice != 0) {
            System.out.println("=== Bankmenü ===");
            System.out.println("1. Kontostand anzeigen");
            System.out.println("2. Einzahlung tätigen");
            System.out.println("3. Geld abheben");
            System.out.println("4. Kontoinformationen anzeigen");
            System.out.println("0. Beenden");
            System.out.print("Ihre Auswahl: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Aktueller Kontostand: " + account.balance + " CHF");
            }
            else if (choice == 2) {
                System.out.print("Einzahlungsbetrag: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
                System.out.println("Neuer Kontostand: " + account.balance + " CHF");
            }
            else if (choice == 3) {
                System.out.print("Abhebungsbetrag: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
                System.out.println("Neuer Kontostand: " + account.balance + " CHF");
            }
            else if (choice == 4) {
                System.out.println(account.toString());
            }
            else if (choice == 0) {
                System.out.println("Programm beendet.");
            }
            else {
                System.out.println("Ungültige Auswahl!");
            }
        }

    }
}
