package org.example.sortingAlgorithm;

import java.util.Arrays;

public class SortingAlgorithms {

    //bubble sort
    public static void bubbleSort(int[] num)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    //swap
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }

        for (int j : num) System.out.print(j);
    }

    //selection sort
    public static void selectionSort(int[] num)
    {
         for(int i=0;i<num.length;i++)
         {
             int minPos=i;
             for(int j=i+1;j<num.length;j++)
             {
                 if(num[minPos]>num[j])
                     minPos=j;
             }
             //swap
             int temp=num[minPos];
             num[minPos]=num[i];
             num[i]=temp;
         }
         Arrays.stream(num).forEach(x->System.out.print(x));
    }

    //insertion Sort
    public static void insertionSort(int[] num)
    {
        //4 5 1
        for(int i=1;i<num.length;i++)
        {
            int curr=num[i];
            int prev=i-1;
            while(prev>=0 && num[prev]>curr)
            {
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=curr;
        }
        Arrays.stream(num).forEach(x->System.out.print(x));
    }

    //counting sort
    public static void countingSort(int[] num)
    {
        int largestEle=0;
        for(int i=0;i<num.length;i++)
            largestEle=Math.max(largestEle,num[i]);

        int[] frequency=new int[largestEle+1];
        for(int j=0;j<num.length;j++)
            frequency[num[j]]++;

        int j=0;
        for(int k=0;k<frequency.length;k++)
        {
            while(frequency[k]>0)
            {
                num[j]=k;
                j++;
                frequency[k]--;
            }
        }
        Arrays.stream(num).forEach(x->System.out.print(x));
    }

    public static void main(String args[])
    {
        int[] arr={5,4,1,3,2,9,8,7};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
    }
}
