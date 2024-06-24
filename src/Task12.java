public class Task12 {
    public static void main(String[] args) {
        int[] myArrayPain = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Массив до:");
        printArray(myArrayPain);

        for (int i = 0; i < myArrayPain.length; i++) {
            if (myArrayPain[i] < 6)
            myArrayPain[i] = myArrayPain[i]*2;
        }
        System.out.println("Массив после:");
        printArray(myArrayPain);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
