package gr.aueb.cf.cf9.ch17.enums;

public class Main {

    public static void main(String[] args) {

        UserRole role = UserRole.ADMIN;

        String roleAdmin = role.name();        // παρόμοιο με την toString
        System.out.println("role = " + roleAdmin + ", ordinal: " + role.ordinal());

        UserRole roleUser = UserRole.valueOf(roleAdmin);    // typecast

        for (UserRole r : UserRole.values()) {
            System.out.println(r.ordinal() + ", " + r.name());
        }
    }
}
