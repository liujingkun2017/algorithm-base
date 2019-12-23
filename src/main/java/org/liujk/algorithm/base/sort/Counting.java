package org.liujk.algorithm.base.sort;


/**
 * 计数排序
 */
public class Counting {


    public int[] sort(int[] array) {

        //1、找出数组中的最大值和最小值
        int max = array[0];
        int min = array[0];
        for (int item : array) {
            if (max < item) {
                max = item;
            }
            if (min > item) {
                min = item;
            }
        }

        //2、构建一个统计数组，统计每一个元素出现的次数
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }

        //3、对统计数组做变形
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        //4、倒序遍历原始数据
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            result[countArray[array[i] - min] - 1] = array[i];
            countArray[array[i] - min]--;
        }

        return result;

    }

}
