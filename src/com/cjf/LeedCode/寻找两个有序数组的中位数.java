package com.cjf.LeedCode;

import java.util.*;

/**
 * @Descpription 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * <p>
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 * @Author CJF
 * @Date 2018/12/19 12:10
 * 我的解法：
 * 放入优先级队列，出栈。
 **/
public class 寻找两个有序数组的中位数 {
    public static void main(String[] args) {
        int num1[] = {1};
        int num2[] = {};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < nums1.length; i++) {
            queue.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            queue.add(nums2[i]);
        }
        System.out.println(queue);
        if (queue.size() % 2 != 0) {
            double pos = Math.floor((double) queue.size() / 2.0);
            for (int i = 0; i < pos; i++) {
                queue.poll();
            }
            return Double.valueOf(queue.peek().toString());
        } else {
            double pos = (double) queue.size() / 2.0;
            for (int i = 0; i < pos - 1; i++) {
                queue.poll();
            }
            double d1 = Double.valueOf(queue.poll().toString());
            double d2 = Double.valueOf(queue.peek().toString());
            return (d1 + d2) / 2.0;
        }

    }
}
