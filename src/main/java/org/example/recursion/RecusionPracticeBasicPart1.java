package org.example.recursion;

import java.util.*;

public class RecusionPracticeBasicPart1 {
    public static void printNumbersDecreasingOrder(int n)
    {
       if(n == 0)
            return;
       System.out.print(n);
       printNumbersDecreasingOrder(n-1);
    }

    public static int factorialNumber(int n)
    {
        if(n==0)
            return 1;

        return n*factorialNumber(n-1);
    }

    public static boolean isSorted(int[] n,int i)
    {
        if(i== n.length-1)
            return true;

        if(n[i]>n[i+1])
            return false;

        return isSorted(n,i+1);
    }

    public static int firstOccurence(int[] arr,int key,int i)
    {
        if( i== arr.length-1)
            return -1;
        if(key == arr[i])
            return i;

        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int[] arr,int key,int i)
    {
        //base
        if(i == arr.length)
            return -1;
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && key == arr[i])
            return i;

        return isFound;
    }

    public static int optimizedPower(int n,int power)
    {
        if(power == 0)
            return 1;
        int halfPower = optimizedPower(n,power/2);
        int halfPowerSq =  halfPower * halfPower;
        if(power %2 !=0)
            halfPowerSq = n * halfPowerSq;
        return halfPowerSq;
    }

    public static void main(String[] args)
    {
        printNumbersDecreasingOrder(10);
        System.out.println();
        System.out.println("Factorial of 5:"+ factorialNumber(5));
        int [] arr={5,5,5,5};
        System.out.println(isSorted(arr,0));
        System.out.println(firstOccurence(arr,5,0));
        System.out.println(lastOccurence(arr,5,0));

        System.out.println(optimizedPower(2,5));


    }
}
