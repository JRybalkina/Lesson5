public class Task8 {
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String message = "Ничего не понимаю, но что-то делаю((";
        int count = 3;
        printStringMultipleTimes(message, count);
    }
}
