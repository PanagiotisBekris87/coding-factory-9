package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO{

    // Επειδή δεν έχουμε DB, ας υποθέσουμε ότι αποθηκεύουμε σε μία λίστα
    private final List<Account> accounts = new ArrayList<>();       // ο δείκτης είναι final. Τα περιεχόμενα στο Heap memory είναι mutable.

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);          // override την equals στην κλάση (account)

        if (index == -1) {              // Αν δεν υπάρχει στη λίστα
            accounts.add(account);      // τότε κάνε insert
            return account;
        }

        // Αν υπάρχει ήδη το Account
        accounts.set(index, account);       // τότε κάνε update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));       // Στο Lambda αν οι παράμετροι εισόδου είναι 2+ τότε πρέπει να είναι μέσα
    }                                                                               // σε παρενθέσεις. Εδώ έχουμε μία , to account , άρα δεν χρειάζονται παρενθέσεις

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();                                                   // Τα Iban είναι μοναδικά οπότε δεν έχουμε πρόβλημα
    }                                               // Αν δεν το βρει επιστρέφει empty optional. Όχι null.

    @Override
    public List<Account> getAllAccounts() {
//        return new ArrayList<>(accounts);
        return Collections.unmodifiableList(accounts);
//        return List.copyOf(accounts);
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }

    @Override
    public long count() {
        return accounts.size();
    }
}
