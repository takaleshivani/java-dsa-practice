package org.example.backtracking;

public class FindSubsetsString {

    public static void findSubsets(String str,String ans,int index)
    {
        if(index == str.length())
        {
            System.out.print(ans+" ");
            if(ans.equalsIgnoreCase(""))
                System.out.print("Empty String");
            return;
        }

        //when choice is Yes
        findSubsets(str,ans+str.charAt(index),index+1);
        //when choice is No
        findSubsets(str,ans,index+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
