public class Task13 {
    public static void main(String[] args) {
        int size = 10;
        int[][] blackBox = new int[size][size];

        for (int i = 0; i < size; i++) {
            blackBox[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(blackBox[i][j] + " ");
            }
            System.out.println();
        }
    }
}
