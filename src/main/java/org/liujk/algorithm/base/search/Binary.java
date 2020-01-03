package org.liujk.algorithm.base.search;

/**
 * 二分查找
 * <p>
 * 前提：对于有序集合才适用
 * <p>
 * 时间复杂度：O(logn)
 */
public class Binary {

    /**
     * 二分查找逻辑实现(非递归)
     *
     * @param array 被查找的有序数组
     * @param value 查找的元素值
     * @return 返回被查找到的元素下标，没有找到返回-1
     */
    public int search(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }


    /**
     * 二分查找逻辑实现(递归)
     * @param array
     * @param low
     * @param high
     * @param value
     * @return
     */
    public int binaryRecursion(int[] array, int low, int high, int value) {

        if(low > high){
            return -1;
        }

        int mid = (low + high) / 2;
        if(array[mid] == value){
            return mid;
        }else if(array[mid] < value){
            return binaryRecursion(array,mid+1,high,value);
        }else{
            return binaryRecursion(array,low,mid-1,value);
        }

    }

}
