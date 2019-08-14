package com.coderust.arrays;

/**
 * Characteristics of Binary Search:
 * 1. Input is sorted
 */
public class BinarySearch {

    public static void main(String args[]) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 9};
        System.out.println(new BinarySearch().binarySearchRecursive(input, 6));
        System.out.println(new BinarySearch().binarySearchIterative(input, 6));
    }


    /**
     * Runtime & space Complexity for recursive solution is O(logN)
     * @param inputArray int[]
     * @param target int
     * @return int
     */
    public int binarySearchRecursive(int[] inputArray, int target) {
        return binarySearch(inputArray, 0, inputArray.length - 1, target);
    }

    private int binarySearch(int[] inputArray, int left, int right, int target) {

        if (right < left) {
            return -1;
        }
        int mid = left + ((right - left) / 2);
        if (inputArray[mid] == target) {
            return mid;
        }

        if (target < inputArray[mid]) {
            return binarySearch(inputArray, 0, mid - 1, target);
        } else {
            return binarySearch(inputArray, mid + 1, right, target);
        }
    }

    /**
     * Runtime complexity is O(logN)
     * Space Complexity is O(1)
     * @param inputArray int[]
     * @param target int
     * @return int
     */
    public int binarySearchIterative(int[] inputArray, int target) {

        int left = 0;
        int right = inputArray.length - 1;


        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (inputArray[mid] == target) {
                return mid;
            }

            if (target<inputArray[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }


}
