package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] adjMatrix = new int[n][n];
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjMatrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            colors[i] = scanner.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adjMatrix[i][j] == 1 && colors[i] != colors[j]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}