package org.liujk.algorithm.base.sort;

/**
 * 选择排序
 * 时间复杂度：n2
 * 空间复杂度：1
 * 不是稳定排序算法
 * 原地排序算法
 */
public class Selection {


    public int[] sort(int array[]) {
        if (array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < value) {
                    value = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = value;
        }

        return array;
    }

}
