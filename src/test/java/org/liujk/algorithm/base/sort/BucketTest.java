package org.liujk.algorithm.base.sort;

import org.junit.Test;

import java.util.List;
import java.util.Random;

public class BucketTest {


    int arraySize = 100;

    @Test
    public void sortTest() {

        int[] array = getArray();
        System.out.println("array.length:" + array.length);

        Bucket bucket = new Bucket();
        List<Integer> res = bucket.sort(array, 13);

        for (int item : res) {
            System.out.println(item);
        }

    }


    public int[] getArray() {
        int[] arr = new int[arraySize];
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }

}
