import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 同构字符串
 */
public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
//        Map<Character, ArrayList<Integer>> map1 = new HashMap<>();
//        Map<Character, ArrayList<Integer>> map2 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            boolean flag = false;
//            if (!map1.containsKey(s.charAt(i))){
//                ArrayList<Integer> arrayList = new ArrayList<>();
//                arrayList.add(i);
//                map1.put(s.charAt(i),arrayList);
//            }else {
//                flag = true;
//                map1.get(s.charAt(i)).add(i);
//            }
//            if(!map2.containsKey(t.charAt(i))){
//                if(flag)
//                    return false;
//                else {
//                    ArrayList<Integer> arrayList = new ArrayList<>();
//                    arrayList.add(i);
//                    map2.put(t.charAt(i),arrayList);
//                }
//            }else {
//                if(!flag)
//                    return false;
//                else {
//                    map2.get(t.charAt(i)).add(i);
//                    if(map1.get(s.charAt(i)).retainAll(map2.get(t.charAt(i))))
//                        return false;
//                }
//            }
//
//        }
//        return true;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }
        }
        return true;
    }
}
