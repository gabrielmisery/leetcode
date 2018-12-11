/**
 *
 * 最后一个单词的长度
 */
public class Solution58 {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty())
            return 0;
        if(s.indexOf(s.length()-1) == ' ')
            return 0;
        String[] temp = s.split(" ");
        return temp[temp.length-1].length();
    }
    public static void main(String[] args){
        Solution58 solution58 = new Solution58();
        System.out.println(solution58.lengthOfLastWord("     "));
    }
}
