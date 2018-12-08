public class Solution38 {
    public String countAndSay(int n) {
        String result = "1";
        if(n == 1)
            return "1";
        else {
            for(int j = 0;j<n-1;j++){
                String temp = "";
                int length = result.length();
                for(int i = 0;i<length;i++){
                    int temp1 = 1;
                    while (i+1 < result.length()){
                        if(result.charAt(i) == result.charAt(i+1)){
                            i++;
                            temp1++;
                        }else break;

                    }
                    temp += Integer.toString(temp1) + result.charAt(i);
                }
                result = temp;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        System.out.println(solution38.countAndSay(9));
    }
}
