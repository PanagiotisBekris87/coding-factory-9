package gr.aueb.cf.cf9.ch18.bankapp.dao;

import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

import java.util.List;
import java.util.Optional;

public interface IAccountDAO {

    Account saveOrUpdate(Account account);      // εδώ τα κάνουμε μαζί για λόγους ευκολίας
    void remove (String iban);
    Optional<Account> findByIban(String iban);      // επιστρέφουμε optional γιατί είναι null-safe
    List<Account> getAllAccounts();             // και μία να φέρνει όλους τους λογαριασμούς

    // Μέχρι εδώ αυτά είναι τα βασικά

    // Μπορεί να έχουμε και άλλα ανάλογα την απαίτηση της εφαρμογής
    // π.χ.
    // Queries

    // νέα απαίτηση

    boolean isAccountExists(String iban);
}
