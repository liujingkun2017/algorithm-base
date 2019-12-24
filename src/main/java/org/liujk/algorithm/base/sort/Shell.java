package org.liujk.algorithm.base.sort;

/**
 * 希尔排序
 * <p>
 * 时间复杂度：nlogn
 * 不稳定排序
 */
public class Shell {

    public int[] sort(int[] array) {

        for (int h = array.length / 2; h > 0; h /= 2) {
            for (int i = h; i < array.length; i++) {
                //将a[i]插入到a[i-h],a[i-2h],a[i-3h]...中
                for (int j = i; j >= h && array[j] < array[j - h]; j -= h) {
                    int temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;
                }
            }
        }
        return array;
    }

}
