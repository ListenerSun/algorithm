package com.sqt;
import java.util.Arrays;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-28 18:47
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,8,23,7,3,5};
        quickSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     *
     * @param arr 数组
     * @param n   数组大小
     */
    public static void quickSort(int[] arr, int n) {
        quickSortPar(arr, 0, n - 1);

    }
    // 快速排序递归函数，p,r为下标
    private static void quickSortPar(int[] arr, int p, int r) {
        //p = r 时 只剩一个元素，不用排序了
        if (p >= r) {
            return;
        }
        //获取 分区 点下标
        int q = partition(arr, p, r);
        quickSortPar(arr,p,q-1);
        quickSortPar(arr,q+1,r);

    }

    /** 获取分区点
     * 分区点 左边的元素都比分区点元素小，右边反之
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition(int[] arr, int p, int r) {
        //为了节省内存空间 直接在原数组内操作
        // i 用来存储 分界值的下标
        int i = p;
        // 分区点 元素的值
        int pro = arr[r];
        for (int j = p; j < r; j++) {
            if (arr[j] < pro) {
                if (i == j) {
                    //i == j 时，此时元素为第一个元素，需要将 i 往前移动一位
                    i++;
                } else {
                    //将 arr[j] 跟 arr[i] 调换位置
                    int temp = arr[i];
                    arr[i++] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //将 arr[r] 跟 arr[i] 调换位置
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
}