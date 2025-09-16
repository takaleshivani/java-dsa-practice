package org.example.recursion;

public class TilingProblemCode {

    //Problem: Given a wall of size 2 x n and tiles of size 2 x 1, find the number of ways to tile the wall.
    //You can place the tile vertically or horizontally.

    //solution:
    //if tiles are placed horizontally, choices are 2 * (n-2)
    //if tiles are placed vertically, choices are 2 * (n-1)
    public static int tilingProblem(int numberOfTiles)
    {
        if(numberOfTiles == 0 || numberOfTiles == 1)
            return 1;

        int vertical=tilingProblem(numberOfTiles-1);
        int horizontal=tilingProblem(numberOfTiles-2);

        return vertical + horizontal;
    }

    public static void main(String[] args)
    {
        System.out.print("Number of ways to place tiles are :" + String.valueOf(tilingProblem(5)));
    }
}
