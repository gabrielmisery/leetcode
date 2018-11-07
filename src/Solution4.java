public class Solution4 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        System.out.print(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = nums1.length + nums2.length;
        int signal1 = 0, signal2 = 0, signal3 = 0;
        int[] nums3 = new int[sumLength];
        double answer;
        int end = sumLength / 2;
        if (nums1.length != 0 && nums2.length != 0) {
            for (; signal3 <= end; ) {
                if (nums1[signal1] < nums2[signal2]) {
                    nums3[signal3] = nums1[signal1];
                    signal1++;
                    signal3++;
                    if (signal1 == nums1.length)
                        break;
                } else {
                    nums3[signal3] = nums2[signal2];
                    signal2++;
                    signal3++;
                    if (signal2 == nums2.length)
                        break;
                }
            }
            if (signal1 == nums1.length && signal3 <= end) {
                for (; signal3 <= end; ) {
                    nums3[signal3] = nums2[signal2];
                    signal2++;
                    signal3++;
                }
            }
            if (signal2 == nums2.length && signal3 <= end) {
                for (; signal3 <= end; ) {
                    nums3[signal3] = nums1[signal1];
                    signal1++;
                    signal3++;
                }
            }
        } else if (nums1.length == 0 && nums2.length != 0) {
            nums3 = nums2;
        } else if (nums1.length != 0 && nums2.length == 0) {
            nums3 = nums1;
        }else {
            return 0;
        }
        if (sumLength % 2 == 0) {
            answer = (double) (nums3[end] + nums3[end - 1]) / 2;
        } else {
            answer = (double) nums3[end];
        }
        return answer;
    }
}
