package org.liujk.algorithm.base.sort;

import org.junit.Test;

public class InsertionTest {

    @Test
    public void sortTest(){
        int[] array = {72,24,5,7,34,3,54,2};
        Insertion insertion = new Insertion();
        int[] res = insertion.sort(array);
        for (int item:res) {
            System.out.println(item);
        }
    }
}
