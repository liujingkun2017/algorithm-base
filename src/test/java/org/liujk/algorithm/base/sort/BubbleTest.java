package org.liujk.algorithm.base.sort;

import org.junit.Test;

/**
 * 冒泡排序
 * 时间复杂度：n2
 * 空间复杂度：1
 * 原地排序算法
 * 稳定排序算法
 */
public class BubbleTest {

    @Test
   public void sortTest(){

        int[] array = {72,24,5,7,34,3,54,2};
        Bubble bubble = new Bubble();
        int[] res = bubble.sort(array);
        for (int item:res) {
            System.out.println(item);
        }
   }

}
