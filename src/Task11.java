public class Task11 {
    public static void main (String[] args) {
        int[] arrayOfNumbers = new int[100];
        for (int i = 0; i < arrayOfNumbers.length; i++ ) {
            arrayOfNumbers[i] = i + 1;

        }
        System.out.println("Массив:");
        printArray(arrayOfNumbers);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
