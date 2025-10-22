package org.example.backtracking;

/**
 * BacktrackingArray demonstrates a simple recursion + backtracking pattern that
 * fills an integer array with consecutive values and then modifies the same
 * array while unwinding the recursion (the "backtracking" step).
 *
 * <p>High-level behavior:
 * - changeArray(arr, i, val) sets arr[i] = val and recurses to fill the rest
 *   of the array with increasing values (val + 1, val + 2, ...).
 * - When the recursion reaches the base case (i == arr.length) it prints the
 *   array as it currently is (the fully filled-forward array).
 * - As recursion returns (unwinds), each stack frame performs a backtracking
 *   step that subtracts 2 from the element it previously set. This mutates the
 *   array in-place and produces a different final array after the top-level
 *   call returns.
 *
 * Methods:
 * - changeArray(int[] arr, int i, int val): recursive method that fills
 *   elements starting at index i with consecutive values beginning at val,
 *   prints the array at the base case, and then modifies values while
 *   unwinding (backtracking).
 * - changeArrayIterative(int[] arr, int startVal): iterative equivalent that
 *   reproduces the same forward-fill and reverse backtracking behavior using
 *   explicit loops (no recursion).
 * - printArray(int[] arr): helper that prints array contents on a single line.
 * - main(String[] args): example driver that creates arrays, invokes the
 *   recursive and iterative methods and prints the final state.
 *
 * Example run (with array length 5 and starting val = 1):
 * - During recursion, before backtracking, printed array: 1 2 3 4 5
 * - After all backtracking finishes and main prints the array: -1 0 1 2 3
 *
 * Notes / explanation:
 * - The initial print (inside the base case) shows the array as filled in the
 *   forward recursion order. The second print (in main) shows the array after
 *   every frame has subtracted 2 from the value it had set, so earlier
 *   positions end up reduced more as the stack unwinds.
 * - This is an intentionally small example to illustrate how recursion and
 *   backtracking can mutate shared state (the same array) at different times
 *   in the call stack.
 */
public class BacktrackingArray {
    public static void changeArray(int[] arr, int i,int val)
    {
        if(i==arr.length)
        {
            printArray(arr);
            return;
        }

        //recursion
        arr[i]=val;
        changeArray(arr,i+1,val+1);
        //backtracking
        arr[i]=arr[i]-2;
    }

    /**
     * Iterative equivalent of changeArray that reproduces the same observable
     * behavior without recursion:
     * - fill arr[0..n-1] with consecutive values starting at startVal
     * - print the array (the "forward" view)
     * - simulate backtracking by subtracting 2 from elements in reverse order
     */
    public static void changeArrayIterative(int[] arr, int startVal) {
        // fill forward
        for (int i = 0; i < arr.length; i++) {
            arr[i] = startVal + i;
        }
        // print forward state (equivalent to base case in recursion)
        printArray(arr);
        // simulate the backtracking/unwinding step: subtract 2 from last to first
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] - 2;
        }
    }

    public static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr=new int[5];
        // recursive demonstration
        changeArray(arr,0,1);
        printArray(arr);

        // iterative demonstration on a fresh array showing the same behavior
        int[] arr2 = new int[5];
        changeArrayIterative(arr2, 1);
        printArray(arr2);
    }
}
