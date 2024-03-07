import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite string: ");
        String unos = scanner.nextLine();

        System.out.println("Broj karaktera u stringu je: " + unos.length());

        scanner.close();
    }
}
