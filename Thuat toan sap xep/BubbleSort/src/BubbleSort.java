public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
    static void print(int[] arr) {
        for (int j : list) System.out.print(j + " ");
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("Before sorting");
        print(list);
        bubbleSort(list);
        System.out.println("After sorting");
        print(list);
    }
}
