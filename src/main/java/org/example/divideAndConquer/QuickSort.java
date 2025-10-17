package org.example.divideAndConquer;

public class QuickSort {

    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int si,int ei)
    {
        if(si>=ei)
            return;

       int pIndex = partition(arr,si,ei);
       quickSort(arr,si,pIndex-1);
       quickSort(arr,pIndex+1,ei);
    }

    public static int partition(int arr[],int si,int ei)
    {
        int pivot = arr[ei];
        int i= si-1; // to make place for smaller element

        for(int j=si;j<ei;j++)
        {
            if(arr[j] <=  pivot)
            {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        //swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
