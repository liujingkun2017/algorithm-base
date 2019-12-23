package org.liujk.algorithm.base.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 桶排序实现逻辑
 * <p>
 * 时间复杂度：n
 * 空间复杂度：
 * <p>
 * <p>
 * 桶排序比较适合用在外部排序中。所谓的外部排序就是数据存储在外部磁盘中，数据量比较大，内存有限，无法将数据全部加载到内存中
 */
public class Bucket {

    //桶的个数
    public static final int BUCKET_COUNT = 10;

    public List<Integer> sort(int[] array, int bucketCount) {

        if (bucketCount <= 0) {
            bucketCount = BUCKET_COUNT;
        }

        List<Integer> buckets[] = new ArrayList[bucketCount];

        for (int i = 0; i < array.length; i++) {
            int temp = array[i] / bucketCount;
            if (null == buckets[temp]) {
                buckets[temp] = new ArrayList<Integer>();
            }
            buckets[temp].add(array[i]);
        }

        List<Integer> results = new ArrayList<Integer>(array.length);
        for (int j = 0; j < buckets.length; j++) {
            //桶内部排序可以使用不通的算法实现
            if (null == buckets[j])
                continue;
            Collections.sort(buckets[j]);
            results.addAll(buckets[j]);
        }
        return results;
    }

}
