package com.zhao.rentrant;

import java.util.Arrays;

/**
 * ClassName: ArrayMerge
 * Package: com.zhao.rentrant
 * Description:
 *
 * @Author:ZGH
 * @Create 2023/1/31 22:44
 * @Version 1.0
 */
public class ArrayMerge {
    public static void main(String[] args) {
        int [] nums1 = {1,3,5,6,23};
        int [] nums2 = {8,9,11,2,7};

        findMedianSortedArrays(nums1,nums2);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        int zo = nums3.length/2;
        return nums3.length % 2 == 0 ?(nums3[zo-1]+nums3[zo])/2d:nums3[zo];
    }

}
