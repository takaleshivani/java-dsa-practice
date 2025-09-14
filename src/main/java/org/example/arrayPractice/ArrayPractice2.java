package org.example.arrayPractice;

public class ArrayPractice2 {

    //Brute force
    public static void maxSum(int[] arr)
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                cs=0;
                for(int k=start;k<=end;k++)
                    cs += arr[k];
                ms=Math.max(ms,cs);
            }

        }
        System.out.print("Maximum sum : "+ms);
    }

    public static void maxSumUsingPrefix(int[] arr)
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            prefix[i]=arr[i]+prefix[i-1];

        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                cs = start==0? prefix[end] : prefix[end] - prefix[start-1];
                ms=Math.max(ms,cs);
            }

        }
        System.out.print("Maximum sum of array:" +ms);
    }

    public static void maxSumUsingKadaneAlgo(int[] num)
    {
        int cs=num[0];
        int ms=num[0];
        for(int i=0;i<num.length;i++) {
           cs = Math.max(num[i], cs+num[i]);
           ms=Math.max(cs,ms);
        }
        System.out.println("Maximum sum of array :" + ms);
    }

    public static void buyNSellStock(int[] num)
    {
       int BP=Integer.MAX_VALUE;
       int profit,maxProfit=0;
       for(int i=0;i<num.length;i++)
       {
           if(BP<num[i])
                maxProfit=Math.max(num[i]-BP,maxProfit);
           else
               BP=num[i];
       }
       System.out.print("Maximum profit : "+maxProfit);
    }

    public static void main(String[] args)
    {
//        int[] arr={-2,-3,4,-1,-2,1,5,-3};
//        maxSumUsingKadaneAlgo(arr);
          int[] arr={4,3,2,1};
          buyNSellStock(arr);
   }
}
