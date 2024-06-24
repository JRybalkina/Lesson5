public class Task9 {
    public static boolean isShortYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // год высокосный
        } else {
            return false; // год не высокосный
        }
    }
    public static void main(String[] args) {
        int year = 2024;
        if (isShortYear(year)) {
            System.out.println(year + " - высокосный год");
        } else {
            System.out.println(year + " - не высокосный год");
        }
    }
}
