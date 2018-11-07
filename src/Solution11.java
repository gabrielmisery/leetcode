public class Solution11 {
    public static void main(String[] args) {
        int[] n = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxArea(n));
    }

    public static int maxArea(int[] height) {
        int temp, width, result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                width = j - i;
                if (height[i] > height[j]) {
                    temp = height[j] * width;
                } else
                    temp = height[i] * width;
                if (temp >= result)
                    result = temp;
            }
        }
        return result;
    }
}
