public class Task2 {
public static void main (String[] args){
    checkSumSign ();
}
    public static void checkSumSign () {
    int a = 6;
    int b = -8;
    int summ = a + b;
    if (summ >= 0)
        System.out.println("Сумма положительная");
    else
        System.out.println("Сумма отрицательная");
    }
}