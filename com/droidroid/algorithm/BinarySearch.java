package com.droidroid.algorithm;

public class BinarySearch {

    public static int getPos(int[] A, int size, int goal) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int center = (low + high) / 2;
            if (goal == A[center]) {
                return center;
            }
            else if (goal < A[center]) {
                high = center - 1;
            }
            else if (goal > A[center]) {
                low = center + 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        // ÓÐÐòÊý×é
        int[] A = {1, 5, 6, 9};
        int size = A.length;
        int goal = A[2];

        System.out.print(getPos(A, size, goal));
    }
}
