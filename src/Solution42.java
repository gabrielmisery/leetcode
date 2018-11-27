import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 接雨水
 */

public class Solution42 {
//    public int trap(int[] height) {
//        int result = 0;
//        int distance = 0;
//        Stack<Integer> arrDistance = new Stack<>();
//        boolean flag = true;
//        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> smallStack = new Stack<>();
//        for (int i = 0; i < height.length; i++) {
//            if (stack.isEmpty() && height[i] != 0) {
//                stack.push(height[i]);
//                continue;
//            }
//
//            if (height[i] != 0) {
//                if (height[i] < stack.peek()) {
//                    smallStack.push(height[i]);
//                    if (!arrDistance.isEmpty())
//                        arrDistance.push(distance - arrDistance.peek() - arrDistance.size());
//                    else
//                        arrDistance.push(distance);
//                    flag = false;
//                    distance++;
//                } else if (distance == 0 && stack.peek() == height[i]) {
//                    stack.push(height[i]);
//                } else {
//                    int count = 0;
//                    while (!smallStack.isEmpty()) {
//                        count += smallStack.pop();
//                    }
//                    flag = true;
//                    result += distance * stack.pop() - count;
//                    distance = 0;
//                    stack.push(height[i]);
//                    while (!arrDistance.isEmpty())
//                        arrDistance.pop();
//                }
//            } else {
//                distance++;
//            }
//            if (i == height.length - 1 && !flag) {
//                int count = 0;
//                int max = smallStack.pop(), minus = 0, dis = 0;
////                while (!smallStack.isEmpty()) {
////                    count += smallStack.pop();
////                }
////                result += distance * height[i] - count;
////                distance = 0;
////                stack.push(height[i]);
//                if (max > smallStack.peek()) {
//                    minus += smallStack.pop();
//                    dis += arrDistance.pop();
//                }
//                while (smallStack.size() >= 2 && !arrDistance.isEmpty()) {
//                    if (max > smallStack.peek()) {
//                        minus += smallStack.pop();
//                        dis += arrDistance.pop();
//                    } else {
//                        count += Math.min(max, smallStack.pop()) * (dis + arrDistance.pop()) - minus;
//                    }
////                    count += Math.min(smallStack.pop(), smallStack.peek()) * arrDistance.pop();
//                }
//                count += Math.min(max, stack.pop()) * (distance + dis + arrDistance.pop() - 1) - minus;
//                result += count;
//            }
//
//        }
//        return result;
//    }

    public int trap(int[] height) {
        if (height == null || height.length < 3)
            return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        int area = 0;

        while (left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                if (leftMax > height[left])
                    area += leftMax - height[left];
                left++;
            } else {
                if (rightMax > height[right])
                    area += rightMax - height[right];
                right--;
            }
        }

        return area;
    }

    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        int[] height = new int[]{4, 0, 3};
        System.out.println(solution42.trap(height));
    }
}
