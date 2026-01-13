package gr.aueb.cf.cf9.ch18.bankapp;

import gr.aueb.cf.cf9.ch18.bankapp.controller.AccountController;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.cf9.ch18.bankapp.core.exceptions.ValidationException;
import gr.aueb.cf.cf9.ch18.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.cf9.ch18.bankapp.dao.IAccountDAO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.ch18.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.cf9.ch18.bankapp.service.IAccountService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Main {

    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static AccountController accountController = new AccountController(accountService);
    private final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        String option;
        String iban;

        while (true) {
            printMenu();
            option = scanner.nextLine();

            try {
                switch (option) {
                    case "1" -> {
                        System.out.println("Παρακαλώ εισάγετε το iban");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το υπόλοιπο");
                        BigDecimal balance = new BigDecimal(scanner.nextLine().trim());

                        AccountReadOnlyDTO readOnlyDTO = accountController.createNewAccount(iban, balance);
                        System.out.println("Ο λογαριασμός δημιουργήθηκε (ανανεώθηκε) επιτυχώς με iban: " +
                                readOnlyDTO.iban() + " και υπόλοιπο: " + readOnlyDTO.balance());
                    }
                    case "2" -> {
                        System.out.print("Παρακαλώ εισάγετε το iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό κατάθεσης");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.deposit(iban, depositAmount);

                        System.out.println("Επιτυχής κατάθεση: " + depositAmount + ", Νεο υπόλοιπο: "
                                + accountController.getBalance(iban));
                    }
                    case "3" -> {
                        System.out.print("Παρακαλώ εισάγετε το iban: ");
                        iban = scanner.nextLine().trim();
                        System.out.println("Παρακαλώ εισάγετε το ποσό ανάληψης");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine().trim());

                        accountController.withdraw(iban, withdrawAmount);
                        System.out.println("Επιτυχής ανάληψη: " + withdrawAmount + ", Νεο υπόλοιπο: "
                                + accountController.getBalance(iban));
                    }
                    case "4" -> {
                        System.out.print("Παρακαλώ εισάγετε το iban: ");
                        iban = scanner.nextLine().trim();

                        BigDecimal balance = accountController.getBalance(iban);
                        System.out.println("Το υπόλοιπο του λογαριασμού σας είναι: " + balance);
                    }
                    case "5" -> {
                        List<AccountReadOnlyDTO> readOnlyDTOS = accountController.getAllAccounts();

                        if (readOnlyDTOS.isEmpty()) {
                            System.out.println("Δεν βρέθηκαν λογαριασμοί");
                        } else {
                            readOnlyDTOS.forEach(System.out::println);
                        }
                    }
                    case "6" -> {
                        System.out.println("Έξοδος");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Μη έγκυρη επιλογή, προσπαθήστε ξανά");
                }
            } catch (AccountNotFoundException e) {
                System.out.println("Ο λογαριασμός δεν βρέθηκε");
            } catch (NumberFormatException e) {
                System.out.println("Μη έγκυρη μορφή αριθμού");
            } catch (ValidationException e) {
                System.out.println("Λάθος στην επαλήθευση: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Ανεπαρκές υπόλοιπο");
            }
        }

    }

    private static void printMenu() {
        System.out.println("\n=== Υπηρεσία Bank App ===");
        System.out.println("1. Δημιουργία (ή ενημέρωση) λογαριασμού");
        System.out.println("2. Κατάθεση");
        System.out.println("3. Ανάληψη");
        System.out.println("4. Ερώτηση Υπολοίπου");
        System.out.println("5. Εκτύπωση όλων των λογαριασμών");
        System.out.println("6. Έξοδος");
        System.out.println("Εισάγετε μία επιλογή");
    }
}
