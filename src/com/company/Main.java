package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести размер массива: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Необходимо ввести элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println("\nМассив, полученный после сортировки:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

