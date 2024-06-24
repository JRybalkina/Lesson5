public class Task10 {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Исходный массив:");
        printArray(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else if (myArray[i] == 1) {
                myArray[i] = 0;
            }
        }

        System.out.println("Массив после замены:");
        printArray(myArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
