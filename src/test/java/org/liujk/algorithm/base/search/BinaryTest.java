package org.liujk.algorithm.base.search;

import org.junit.Test;

public class BinaryTest {

    @Test
    public void searchTest(){
        int[] array={1,3,5,6,7,8,9};
        Binary binary = new Binary();
        int res = binary.search(array,5);
        System.out.println(res);
    }

    @Test
    public void binaryRecursionTest(){
        int[] array={1,3,5,6,7,8,9};
        Binary binary = new Binary();
        int res = binary.binaryRecursion(array,0,array.length-1,5);
        System.out.println(res);
    }

}
