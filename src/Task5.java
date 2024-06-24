public class Task5 {

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;

        if (checkSumInRange(num1, num2)) {
            System.out.println("Сумма чисел находится в диапазоне от 10 до 20");
        } else {
            System.out.println("Сумма чисел находится вне диапазона от 10 до 20");
        }
    }
}

