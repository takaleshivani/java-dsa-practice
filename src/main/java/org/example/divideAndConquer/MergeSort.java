package org.example.divideAndConquer;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr,int si,int ei)
    {
        if(si>=ei)
            return;

        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid); //left part
        mergeSort(arr,mid+1,ei); //right part

        merge(arr,si,mid,ei);


    }

    public static void merge(int[] num,int si,int mid,int ei)
    {
        //left(0,3) right (4,6) 7 = 6-0+1
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(num[i] < num[j])
            {
                temp[k]=num[i];
                i++;
            }
            else
            {
                temp[k]=num[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
            temp[k++]=num[i++];
        while(j<=ei)
            temp[k++]=num[j++];

        for(int l=0, p=si; l<temp.length; l++,p++)
        {
            num[p]=temp[l];
        }
    }

    public static void main(String[] args)
    {
        int[] arr={5,4,3,1,6,7};
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(x->System.out.print(x));
    }

}
