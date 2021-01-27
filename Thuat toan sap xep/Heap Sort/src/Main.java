import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int[] arr = new int[10];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(20);
        }

        //Test Heap Sort
        HeapSort hs = new HeapSort();
        long start = System.currentTimeMillis();
        hs.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Thoi gian heap: " + (end - start));

        //Test Quick Sort
//        QuickSort qs = new QuickSort();
//        long start2 = System.currentTimeMillis();
//        qs.quickSort(arr, 0, arr.length - 1);
//        long end2 = System.currentTimeMillis();
//        System.out.println("Thoi gian selection: " + (end2 - start2));

        //Test Merge Sort
//        MergeSort ms = new MergeSort();
//        long start3 = System.currentTimeMillis();
//        ms.mergeSort(arr, 0, arr.length - 1);
//        long end3 = System.currentTimeMillis();
//        System.out.println("Thoi gian merge: " + (end3 - start3));
    }
}
