package main.java.leetcode.answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 给你一个二维矩阵 matrix 和一个整数 k ，矩阵大小为 m x n 由非负整数组成。
 * <p>
 * 矩阵中坐标 (a, b) 的 值 可由对所有满足 0 <= i <= a < m 且 0 <= j <= b < n 的元素 matrix[i][j]（下标从 0 开始计数）执行异或运算得到。
 * <p>
 * 请你找出 matrix 的所有坐标中第 k 大的值（k 的值从 1 开始计数）。
 * <p>
 * <p>
 * 理解：新建一个对应的二维数组 (a,b)为原二维数组中  横坐标小于等于a 纵坐标小于等于b的所有元素异或
 */
public class kthLargestValue {

    public static int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m + 1][n + 1];
        List<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                result[i][j] = result[i - 1][j] ^ result[i][j - 1] ^ result[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                resultList.add(result[i][j]);
            }
        }
        Collections.sort(resultList, (a1, a2) -> a2 - a1);
        return resultList.get(k - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{5, 2}, {1, 6}};

        System.out.println(kthLargestValue(matrix, 1));
    }

}
