public class Main10 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("\nПреобразованный массив:");
        printArray(array);
    }

    private static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
