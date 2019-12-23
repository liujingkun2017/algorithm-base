package org.liujk.algorithm.base.sort;

/**
 * 快速排序
 * 时间复杂度：nlogn
 * 空间复杂度：n
 * 原地排序算法
 * 非稳定排序算法
 */
public class Quick {

    public void sort(int[] array, int L, int R) {
        if (R <= L) {
            return;
        }
        int index = getIndex(array, L, R);
        sort(array, 0, index - 1);
        sort(array, index + 1, R);

    }

    public int getIndex(int[] array, int L, int R) {
        int temp = array[L];
        while (L < R) {
            while (L < R && array[R] > temp) {
                R--;
            }
            array[L] = array[R];
            while (L < R && array[L] < temp) {
                L++;
            }
            array[R] = array[L];
        }
        array[L] = temp;
        return L;
    }

}
