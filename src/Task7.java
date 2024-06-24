public class Task7 {
    public static boolean isNegative(int number) {
    return number < 0;
}
    public static void main(String[] args) {
        int num = -8;
        if (isNegative(num)) {
            System.out.println("Число " + num + " - отрицательное");
        } else {
            System.out.println("Число " + num + " - положительное или ноль");
        }
    }
}
