import java.util.*;
/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 */

class solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        for (int num = 1; num <= numRows; num++) {
            row.add(0, 1);
            for (int index = 1; index < row.size() - 1; index++) {
                row.set(index, row.get(index) + row.get(index + 1));
            }

            triangle.add(new ArrayList<Integer>(row));
        }

        return triangle;
    }

}

/*
 * time complexity = O(n^2) and space complexity = O(n^2)
 */