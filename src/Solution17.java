import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution17 {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Integer, ArrayList<String>> map = new HashMap<>();

        map.put(2, creatDic("abc"));
        map.put(3, creatDic("def"));
        map.put(4, creatDic("ghi"));
        map.put(5, creatDic("jkl"));
        map.put(6, creatDic("mno"));
        map.put(7, creatDic("pqrs"));
        map.put(8, creatDic("tuv"));
        map.put(9, creatDic("wxyz"));

        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            list.add(map.get(Integer.parseInt(String.valueOf(digits.charAt(i)))));
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(0).get(i));
            getLetters(list.get(0), result);
        }
        return
    }

    public static ArrayList<String> creatDic(String letters) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            list.add(String.valueOf(letters.charAt(i)));
        }
        return list;
    }

    public static void getLetters(List<String> list, List<String> result) {

    }
}
