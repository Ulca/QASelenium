package org.seleniumqa.lesson_1;

/**
 * Created by admin on 04.02.2015.
 */
public class BubbleSort2 {
    int arr[] = {15, 42, 1, 13, 50, 76, 3, -6, 19, 0, 25, 40, 121};

    void sort(){
        boolean sorted = false;
        while (!sorted){
            boolean change_made = false;
            for (int i = 0; i < (arr.length - 1); i++)
                if (arr[i] > arr[i+1]) {
                    int j = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = j;
                    change_made = true;
                }
            if (!change_made) sorted = true;

        }
    }
    public static void main(String[] args){
        BubbleSort2 sorter = new BubbleSort2();
        sorter.sort();
        for(int i = 0; i < sorter.arr.length; i++) {
            System.out.print(sorter.arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
