import java.util.*;

/**
 * 字母异位词分组
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] num = str.toCharArray();
            Arrays.sort(num);
            String str1 = Arrays.toString(num);
            if(map.containsKey(str1)){
                map.get(str1).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(str1, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution49 solution49 = new Solution49();
        solution49.groupAnagrams(strs);
    }
}
