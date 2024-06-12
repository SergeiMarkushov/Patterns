package org.example.behavioralPatterns.Strategy;

import java.util.Arrays;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient client = new StrategyClient();
        client.setStrategy(new BubbleSort());
        int[] arr = {5,2,54,7,3,33};
        client.executeStrategy(arr);

        client.setStrategy(new SelectionSort());
        int[] arr1 = {6,3,76,4,78,33};
        client.executeStrategy(arr1);

        client.setStrategy(new InsertingSort());
        int[] arr2 = {66,23,76,3,8,333};
        client.executeStrategy(arr2);

    }
}
//Context
class StrategyClient {
    Sorting strategy;
    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }
    public void executeStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
//strategy
interface Sorting {
    void sort(int[] arr);
}

class BubbleSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("bubble sort");
        System.out.println("before:\t" + Arrays.toString(arr));
        for (int barier = arr.length - 1; barier >= 0; barier--) {
            for (int i = 0; i < barier; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

class SelectionSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("Selection sort");
        System.out.println("before:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier+1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int temp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

class InsertingSort implements Sorting {

    @Override
    public void sort(int[] arr) {
        System.out.println("insertions sort");
        System.out.println("before:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length; barier++) {
            for (int i = barier+1; i < arr.length ; i++) {
                if (arr[i] < arr[barier]) {
                    int temp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}

