public class Main14 {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int length = 5;
        int value = 7;

        int[] result = createArray(length, value);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
