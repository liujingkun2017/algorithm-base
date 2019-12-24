package org.liujk.algorithm.base.sort;

import org.junit.Test;

import java.util.Random;

public class ShellTest {


    @Test
    public void sortTest() {
        int[] array = getArray();
        Shell shell = new Shell();
        int[] result = shell.sort(array);
        for (int item : result) {
            System.out.println(item);
        }
    }

    int arraySize = 20;

    public int[] getArray() {
        int[] arr = new int[arraySize];
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = r.nextInt(99);
        }
        return arr;
    }

}
