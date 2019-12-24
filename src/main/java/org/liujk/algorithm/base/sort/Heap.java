package org.liujk.algorithm.base.sort;


/**
 * 堆排序
 * <p>
 * 堆是一个完全二叉树；堆中每一个节点的值都必须大于等于（或小于等于）其子树中每个节点的值。
 * 存储堆的数组，第一个元素是不放数据的
 * <p>
 * 1、建堆(本次构建的是大顶堆)
 * 2、排序
 */
public class Heap {

    //堆对应的数组
    private int[] arr;
    //堆最大的数据个数
    private int n;
    //堆中已经存储的数据个数
    private int count;

    public Heap(int capacity) {
        arr = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

//    /**
//     * 插入元素到堆中
//     *
//     * @param data
//     */
//    public void insert(int data) {
//
//        //判断堆是否已经装满数据
//        if (count >= n) {
//            return;
//        }
//        count++;
//        arr[count] = data;
//        int i = count;
//        while (i / 2 > 0 && arr[i / 2] < arr[i]) {
//            int temp = arr[i / 2];
//            arr[i / 2] = arr[i];
//            arr[i] = temp;
//            i /= 2;
//        }
//    }
//
//    /**
//     * 删除堆中最大元素
//     */
//    public void removeMax() {
//
//        //判断堆中是否还有数据
//        if (count <= 0) {
//            return;
//        }
//
//        arr[1] = arr[count];
//        count--;
//
//        heapify(arr, count, 1);
//    }


    /**
     * 建堆
     *
     * @param a
     * @param n
     */
    public void buildHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; --i) {
            heapify(a, n, i);
        }
    }

    /**
     * 堆化
     *
     * @param array 堆存储的数组
     * @param count 堆的数量
     * @param index 操作元素的下标
     */
    public void heapify(int[] array, int count, int index) {

        while (true) {
            int maxPos = index;
            if (index * 2 <= count && array[index] < array[index * 2]) {
                maxPos = index * 2;
            }
            if (index * 2 + 1 <= count && array[maxPos] < array[index * 2 + 1]) {
                maxPos = index * 2 + 1;
            }
            //如果没有发生maxPos的变动，则说明index对应的元素是最大的元素
            if (maxPos == index) {
                break;
            }
            //交换数据
            int temp = array[index];
            array[index] = array[maxPos];
            array[maxPos] = temp;

            index = maxPos;
        }
    }


    /**
     * 通过堆实现排序
     *
     * @param array
     * @return
     */
    public int[] sort(int[] array) {
        //1、建堆
        for (int i = 0; i < array.length; i++) {
            arr[i + 1] = array[i];
        }
        buildHeap(arr, array.length);


        //2、排序
        int k = array.length;
        while (k > 1) {
            int temp = arr[k];
            arr[k] = arr[1];
            arr[1] = temp;
            k--;
            heapify(arr, k, 1);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i + 1];
        }
        return array;

    }

}
