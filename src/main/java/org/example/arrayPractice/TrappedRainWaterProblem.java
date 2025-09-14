package org.example.arrayPractice;

public class TrappedRainWaterProblem {

    public static int trappedWaterLevel(int[] num){
        int n= num.length;

        //calculate leftMax Auxillary array
        int[] leftMax = new int[num.length];
        leftMax[0]=num[0];
        for(int i=1;i<n;i++)
            leftMax[i]=Math.max(num[i],leftMax[i-1]);

        //calculate rightMx Auxillary array
        int[] rightMax=new int[num.length];
        rightMax[n-1]=num[n-1];
        for(int j=n-2;j>=0;j--)
            rightMax[j]=Math.max(rightMax[j+1],num[j]);

        //calculate trappedWater
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            //waterlevel = trapped water -height
            int waterLevel=Math.min(leftMax[i],rightMax[i])-num[i];
            trappedWater+=waterLevel;
        }
        return trappedWater;

    }

    public static void main(String[] args)
    {
        int []num={4,2,0,6,3,2,5};
        System.out.print("Trapped water level is : "+trappedWaterLevel(num));
    }
}
