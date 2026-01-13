package gr.aueb.cf.cf9.ch18.bankapp.validation;

import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    /**
     * No instances of this class should be available
     */

    private Validator() {
    }

    public static Map<String, String> validateInsertDTO(AccountInsertDTO insertDTO) {

        Map<String, String> errors = new HashMap<>();

        if(insertDTO.iban() == null || !insertDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (insertDTO.balance() == null || insertDTO.balance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το υπόλοιπο δεν μπορεί να είναι αρνητικό.");
        }
        return errors;
    }


    public static Map<String, String> validateDepositDTO(AccountDepositDTO depositDTO) {

        Map<String, String> errors = new HashMap<>();

        if(depositDTO.iban() == null || !depositDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (depositDTO.amount() == null || depositDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το ποσό κατάθεσης δεν μπορεί να είναι αρνητικό.");
        }
        return errors;
    }


    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO withdrawDTO) {

        Map<String, String> errors = new HashMap<>();

        if(withdrawDTO.iban() == null || !withdrawDTO.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }

        if (withdrawDTO.amount() == null || withdrawDTO.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το ποσό ανάληψης δεν μπορεί να είναι αρνητικό.");
        }
        return errors;
    }

    public static Map<String, String> validateIban(String iban) {
        Map<String, String> errors = new HashMap<>();

        if(iban == null || !iban.trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "το iban πρέπει να ξεκινάει με GR και να ακολουθείται από 3-25 ψηφία.");
        }
        return errors;
    }

}
