package com.company.Anubrata;

import java.util.Scanner;

public class findMaxInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Maximum element is\t" + find_max(n, arr));
    }

    public static int find_max(int n, int[] arr) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}

