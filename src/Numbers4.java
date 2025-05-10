public class Numbers4 {
    public static boolean NegativeNumber (int number) {
        return number < 0;
    }
    public static void main(String[] args) {
        System.out.println(NegativeNumber(-10));
        System.out.println(NegativeNumber(10));
        System.out.println(NegativeNumber(0));
    }
}
