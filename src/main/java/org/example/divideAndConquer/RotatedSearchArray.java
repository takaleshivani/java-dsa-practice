package org.example.divideAndConquer;

public class RotatedSearchArray
{
    public static int search(int[] arr, int target,int si, int ei)
    {
        int mid = si + (ei-si)/2;
        //Base case
        if(si>ei)
            return -1;

        //base case
        if(arr[mid] == target)
            return mid;

        //line 1
        if(arr[si] <= arr[mid])
        {
            //case a : Search in left half
            if(arr[si] <= target && target <= arr[mid])
                return search(arr,target,si,mid-1);
            else //case b: search in right half
                return search(arr,target,mid+1,ei);
        }

        //line 2
        else{
            //case a: search in right half
            if(arr[mid] <= target && target  <= arr[ei])
                return search(arr,target,mid+1,ei);
            else //case b: search in left half
                return search(arr,target,si,mid-1);
        }

    }

    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(arr,target,0, arr.length-1);
        System.out.println("Element found at index: "+ans);
    }
}
