package Exc_16;

import java.util.Random;

public class Z4 {
    Z4(){
        long[] arr = new long[10];
        Random rand = new Random();
        for (int i =0;i<10;i++){
            arr[i]=rand.nextLong();
        }
        for (int i =0;i<10;i++){
            System.out.println(i+": "+arr[i]);
        }
        selectionSort(arr);
        System.out.println("\nAfter sort:");
        for (int i =0;i<10;i++){
            System.out.println(i+": "+arr[i]);
        }
    }
    void selectionSort(long[] array){
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }
    private void swap(long[] array, int ind1, int ind2) {
        long tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
