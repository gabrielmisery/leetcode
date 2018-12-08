import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 整数转罗马数字
 */
public class Solution12 {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        for(int key:map.keySet()){
            for(int i = 0;i<num/key;i++){
                result.append(map.get(key));
            }
            num = num%key;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.intToRoman(1994));
    }
}
