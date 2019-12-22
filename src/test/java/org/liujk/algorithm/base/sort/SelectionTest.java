package org.liujk.algorithm.base.sort;

import org.junit.Test;

public class SelectionTest {

    @Test
    public void sortTest() {
        int[] array = {72, 24, 5, 7, 34, 3, 54, 2};
        Selection selection = new Selection();
        int[] res = selection.sort(array);
        for (int item:res) {
            System.out.println(item);
        }
    }
}
