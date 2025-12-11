package gr.aueb.cf.cf9.ch14.bank_app;

public class Main {

    public static void main(String[] args) {

        Account aliceAccount = new Account(1L, "GR12345", "Alice", "W.", "A12345", 100);

        try {
            aliceAccount.deposit(-500);
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(1000, "A12345");
            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(100, "a566444455238");

        } catch (SsnNotValidException e) {
            System.out.println("To Ssn δεν αντιστοιχεί στον λογαριασμό");
        } catch (NegativeAmountException e) {
            System.out.println("Μη επιτρεπτό αρνητικό ποσό.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Το υπόλοιπο του λογαριασμού δεν επαρκεί για το ζητούμενο ποσό.");
        }
    }
}
