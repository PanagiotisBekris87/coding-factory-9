package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Demo of file writers in java.io package
 */
public class FileWritersJavaIO {

    public static void main(String[] args) {

        File file = new File("C:/Users/takis/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try (PrintStream ps = new PrintStream("C:/Users/takis/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file-ps.txt")) {

//            fileWriter(file.getAbsolutePath());
//            bufferedWriter(file);

            // Flexible usage of sayHello() method
            sayHello(System.out);
            sayHello(ps);

        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη κατά την εγγραφή.");
        }


    }

    public static void fileWriter(String file) throws IOException {

        try (FileWriter fw = new FileWriter(file, StandardCharsets.UTF_8, true)) {        // Το StandardCharsets.UTF_8 το δίνουμε για java 14 και πίσω
            fw.write("Hello, World! PB");                                                       // θα κάνει 12 writes στο δίσκο. Αργό
            fw.flush();                                                          // Flush κάνουμε για να κάνει το write εκείνη τη στιγμή και όχι στο τέλος του προγράμματος
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static void bufferedWriter (File file) throws IOException {
                                                                            // αντί για string μπορεί να λάβει και αρχείο ως input για να γράψει

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, StandardCharsets.UTF_8, true))) {
            bw.write("Hello, World!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }


    public static void printStream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(file)) {
            ps.println("Hello World!");
            ps.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void printWriter(String file) throws IOException {
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Hello World!");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello Coding!");
    }



}
