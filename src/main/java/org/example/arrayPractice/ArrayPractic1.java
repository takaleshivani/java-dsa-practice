package org.example.arrayPractice;

public class ArrayPractic1 {

    //linear Search
    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    //binary Search
    public static int binarySearch(int[] arr,int key)
    {
        int start=0,mid=0,end=arr.length;
        while(start<end)
        {
            mid=(start+end)/2;
            if(arr[mid] == key)
                return mid;

            if(arr[mid]<key)        //search right
                start=mid+1;
            else if(arr[mid]>key)    //search left
                end=mid-1;
        }
        return -1;
    }

    public static void reverseArray(int[] num)
    {
        int start=0;
        int end=num.length-1;
        int temp=0;
        //use swap
        while(start<end)
        {
            temp=num[start];
            num[start]=num[end];
            num[end]=temp;

            start++;
            end--;
        }
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]);
    }

    public static void pairsArray(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
        {
          int start=i;
          for(int j=i+1;j<arr.length;j++)
          {
              int end=j;
              for(int k=start;k<=end;k++)
                 System.out.print(arr[k]+" ");
          }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6};
        System.out.println("Key is found at index :"+linearSearch(arr,6)+" using linear Search");
        System.out.println("Key is found at index :"+binarySearch(arr,6)+" using binary Search");
        reverseArray(arr);
        System.out.println();
        pairsArray(arr);
    }
}
