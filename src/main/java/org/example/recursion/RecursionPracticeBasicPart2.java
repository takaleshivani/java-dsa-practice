package org.example.recursion;

public class RecursionPracticeBasicPart2 {

    public static void removeDuplicateString(String str,int idx,boolean[] map,StringBuilder sb)
    {
        if(idx == str.length())
        {
            System.out.print(sb);
            return;
        }

        char ch = str.charAt(idx);
        if(map[ch - 'a'] == true)
            removeDuplicateString(str,idx+1,map,sb);
        else if(map[ch - 'a'] == false)
        {
            map[ch - 'a'] = true;
            removeDuplicateString(str,idx+1,map,sb.append(ch));
        }

    }

    public static void main(String[] args)
    {
        String str="appnnacollege";
        removeDuplicateString(str,0,new boolean[26],new StringBuilder(""));
    }
}
