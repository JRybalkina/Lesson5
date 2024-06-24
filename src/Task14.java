import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите буковки:");
        String initialValue = scanner.nextLine();

        System.out.println("Введите число равное длине массива:");
        int len = scanner.nextInt();

        String[] arrayFromConsole = new String[len];
        for (int i = 0; i < arrayFromConsole.length; i++) {
            arrayFromConsole[i] = initialValue;
        }
        System.out.println("Конец:" + Arrays.toString(arrayFromConsole));

    }
}
