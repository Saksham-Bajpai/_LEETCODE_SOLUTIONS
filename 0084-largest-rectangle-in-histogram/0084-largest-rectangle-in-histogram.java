import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
       int maxArea = 0;
        int nextSmallestRight[] = new int [heights.length];
        int nextSmallestLeft[] = new int [heights.length];
        
        Stack<Integer> s = new Stack<>();
        
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
                }
            if (s.isEmpty()) {
                nextSmallestRight[i] = heights.length;
                }
            else {
                nextSmallestRight[i] = s.peek();
                }
            s.push(i);
            }
        //next Smaller left 
        s = new Stack<>(); //for emptying stack
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
                }
            if (s.isEmpty()) {
                nextSmallestLeft[i] = -1;
                }
            else {
                nextSmallestLeft[i] = s.peek();
                }
            s.push(i);
            }
        //current Area 
        for(int i = 0; i < heights.length; i++) {
            int length = heights [i];
            int width = nextSmallestRight[i] - nextSmallestLeft[i] - 1;
            int currArea = length * width;
            maxArea = Math.max(currArea,maxArea);
            }
        return maxArea;
    }
}