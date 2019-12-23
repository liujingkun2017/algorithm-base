package org.liujk.algorithm.base.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 基数排序
 * <p>
 * 时间复杂度：n
 * 稳定排序算法
 * <p>
 * 基数排序对要排序的数据是有要求的，需要可以分割出独立的“位”来比较，而且位之间有递进的关系，
 * 如果 a 数据的高位比 b 数据大，那剩下的低位就不用比较了。除此之外，每一位的数据范围不能太大，
 * 要可以用线性排序算法来排序，否则，基数排序的时间复杂度就无法做到 O(n) 了
 */
public class Radix {


    public int[] sort(int[] array, int digit) {

        int mod = 10;
        int dev = 1;
        List<Integer> buckets[] = new ArrayList[10];
        for (int i = 1; i <= digit; i++) {

            //把数据放入到桶里面
            for (int j = 0; j < array.length; j++) {
                int bucket = (array[j] % mod) / dev;
                if (null == buckets[bucket]) {
                    buckets[bucket] = new ArrayList<Integer>();
                }
                buckets[bucket].add(array[j]);
            }

            //把数据从桶里面遍历出来
            int pos = 0;
            for (int j = 0; j < buckets.length; j++) {
                for (int item : buckets[j]) {
                    array[pos++] = item;
                }
                //桶里面的数据要清理掉
                buckets[j].clear();
            }
            mod *= 10;
            dev *= 10;
        }

        return array;
    }
}
