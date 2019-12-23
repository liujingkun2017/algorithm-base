package org.liujk.algorithm.base.sort;

import org.junit.Test;

import java.util.Random;

public class RadixTest {


    @Test
    public void sortTest() {
        int[] array = getArray();
        Radix radix = new Radix();
        int[] result = radix.sort(array, 9);
        for (int item : result) {
            System.out.println(item);
        }

    }

    int arraySize = 100;

    public int[] getArray() {
        int[] arr = new int[arraySize];
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }
}
