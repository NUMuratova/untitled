public class StringNumber {
    public static void printString (String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printString("Hello, world!", 5);
    }
}
