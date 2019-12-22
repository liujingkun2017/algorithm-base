package org.liujk.algorithm.base.sort;

/**
 * 插入排序
 * 时间复杂度：n2
 * 空间复杂度：1
 * 原地排序算法
 * 稳定排序算法
 */
public class Insertion {

    /**
     * 排序逻辑
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (array[j] > value) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        return array;
    }

}
