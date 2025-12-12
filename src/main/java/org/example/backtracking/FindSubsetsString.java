package org.example.backtracking;

public class FindSubsetsString {

    /**
     * Description : This method is used to find subsets of strings
     * @param str
     * @param ans
     * @param index
     */
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


    /**
     * Description : this code is used to print number of permutaions, time complexity : o(n!*n)
     * @param str
     * @param ans
     */
    public static void findPermutaions(String str,String ans) {
        //base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++)
        {
            char ch=str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            findPermutaions(newStr,ans+ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
//        findSubsets(str, "", 0);
        findPermutaions(str,"");
    }
}
