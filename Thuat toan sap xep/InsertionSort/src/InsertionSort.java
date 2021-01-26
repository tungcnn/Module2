public class InsertionSort {
    static int[] arr = {23,234,123,65,87,67,876,654,234,4567,87};
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    static void print(int[] arr) {
        for (int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Before sorting");
        print(arr);
        sort(arr);
        System.out.println("After sorting");
        print(arr);
    }
}
