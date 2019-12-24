package org.liujk.algorithm.base.sort;

import org.junit.Test;

import java.util.Random;

public class HeapTest {


    @Test
    public void sortTest(){
        int[] array = getArray();
        Heap heap = new Heap(array.length);
        array = heap.sort(array);
        for (int item:array){
            System.out.println(item);
        }
    }

    int arraySize = 20;

    public int[] getArray() {
        int[] arr = new int[arraySize];
        Random r = new Random();
        for (int i = 0; i < arraySize; i++) {
            arr[i] = r.nextInt(90);
        }
        return arr;
    }
}
