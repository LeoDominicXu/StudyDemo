package com.xuzc.study.arithmetic.sort;

/**
 * @Description: The description of the file.
 * @Author: Dominic
 * @Date: 2017/1/22
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] data = new int[]{3,2,1,9,9,7,8,0,5,4,6};
        sort(data, 0, data.length-1);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int[] data, int low, int high) {
        if (low >= high){
            return;
        }
        int index = partition(data, low, high);
        sort(data, low, index-1);
        sort(data, index+1, high);
    }
    private static int partition (int[] data, int low, int high) {
        int key = data[low];
        while (low < high) {
            while (key <= data[high] & low < high) {
                high--;
            }
            data[low] = data[high];
            while (data[low] <= key & low < high) {
                low++;
            }
            data[high] = data[low];
        }
        data[low] = key;
        return low;
    }
}
