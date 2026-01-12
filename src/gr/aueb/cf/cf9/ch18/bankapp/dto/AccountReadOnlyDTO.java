package gr.aueb.cf.cf9.ch18.bankapp.dto;

import java.math.BigDecimal;

public record AccountReadOnlyDTO(String iban, BigDecimal balance) {

    //Override την toString για να εκτυπώνω με δικό μου format όπου χρειάζομαι στην εφαρμογή

    @Override
    public String toString() {
        return "ΙΒΑΝ: " +   iban + ", Balance: " + balance;
    }
}
