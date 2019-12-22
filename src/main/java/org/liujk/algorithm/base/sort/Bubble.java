package org.liujk.algorithm.base.sort;

/**
 * 冒泡排序
 * 时间复杂度：n2
 * 空间复杂度：1
 * 原地排序算法
 * 稳定排序算法
 */
public class Bubble {

    /**
     * 排序逻辑
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
