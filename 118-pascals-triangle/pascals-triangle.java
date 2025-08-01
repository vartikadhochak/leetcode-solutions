import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) {
            return triangle;
        }
        
        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 1);
            List<Integer> currentRow = new ArrayList<>();
            
            // The first element is always 1
            currentRow.add(1);
            
            // Each triangle element (except first and last) is the sum of the elements
            // above-and-to-the-left and above-and-to-the-right
            for (int j = 1; j < rowNum; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // The last element is always 1
            currentRow.add(1);
            
            triangle.add(currentRow);
        }
        
        return triangle;
    }
}