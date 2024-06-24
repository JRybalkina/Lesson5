public class Task6{
public static void printNumberSign(int number) {
    if (number >= 0) {
        System.out.println("Число " + number + " - положительное");
    } else {
        System.out.println("Число " + number + " - отрицательное");
    }
}

public static void main(String[] args) {
    int num = -2;
    printNumberSign(num);
}
}
