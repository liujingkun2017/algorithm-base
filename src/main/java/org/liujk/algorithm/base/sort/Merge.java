package org.liujk.algorithm.base.sort;

/**
 * 归并排序
 * <p>
 * 时间复杂度：nlogn
 * 空间复杂度：n
 * 稳定排序算法
 * 不是原地排序算法
 */
public class Merge {

    /**
     *
     * @param array
     * @param L
     * @param R
     */
    public void sort(int[] array, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        sort(array, L, mid);
        sort(array, mid + 1, R);
        merge(array, L, mid, R);

    }

    public void merge(int[] array, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R) {
            temp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= R) {
            temp[i++] = array[p2++];
        }
        for (i = 0; i < temp.length; i++) {
            array[L + i] = temp[i];
        }
    }

}
