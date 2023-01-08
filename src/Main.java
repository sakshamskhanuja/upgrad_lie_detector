import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the value of chemicals.
        Scanner scanner = new Scanner(System.in);

        // Scans chemical X.
        int x = scanner.nextInt();

        // Scans chemical Y.
        int y = scanner.nextInt();

        // Checks if the person is telling the truth or lying.
        if (x + y > 30) {
            System.out.println("The statement said by the person is true");
        } else {
            System.out.println("The statement said by the person is false");
        }
    }
}