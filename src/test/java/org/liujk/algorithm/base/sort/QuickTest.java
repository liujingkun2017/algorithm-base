package org.liujk.algorithm.base.sort;

import org.junit.Test;

public class QuickTest {

    @Test
    public void sortTest() {
        int[] array = {72, 24, 5, 7, 34, 3, 54, 2, 1, 299, 88, 90, 87, 66};
        Quick quick = new Quick();
        quick.sort(array, 0, array.length - 1);
        for (int item : array) {
            System.out.println(item);
        }
    }

}
