public class SumSign {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;

        if ((a + b) >= 0)
            System.out.println("Сумма положительная");
         else {
            System.out.println ("Сумма отрицательная");

        }
    }
}