import java.util.Scanner;

public class TextFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String userInput = scanner.nextLine();
        System.out.println("Witaj "+ userInput + " Ile masz lat?");
        int wiek = scanner.nextInt();
        System.out.println("Twój wiek to "+ wiek);

    }
}
