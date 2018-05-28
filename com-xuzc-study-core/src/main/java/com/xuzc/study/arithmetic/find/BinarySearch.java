package com.xuzc.study.arithmetic.find;


/**
 * @Description: The description of the file.
 * @Author: Dominic
 * @Date: 2017/1/22
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
        int num = binarySearch(data, 0, data.length, 12);
        System.out.println(num);
    }

    private static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
