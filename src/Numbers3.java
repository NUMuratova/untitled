public class Numbers3 {
    public static void printNumber (int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static void main(String[] args) {
        printNumber(5);
        printNumber(0);
        printNumber(-18);
    }
}
