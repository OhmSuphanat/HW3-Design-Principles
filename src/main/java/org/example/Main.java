/**6510450976
 *Suphanat Sroyphet
 */
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Email: ");
        String emailName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        Email email = new Email(emailName);
        User user = new User(username, email, age);

        Sys.register(user);
    }
}
