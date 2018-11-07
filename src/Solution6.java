public class Solution6 {
    public static void main(String[] args) {
        System.out.print(convert("aasdf", 2));
    }

    public static String convert(String s, int numRows) {
        if (s.length() == 0) {
            return s;
        }
        if (numRows < 2) {
            return s;
        }
        String answer = "";
        int numColumns = 0;
        int tag = numRows - 1;
        int tag2 = tag * 2;
        int columns1 = s.length() / tag2;
        int columns2 = s.length() % tag2;
        if (columns2 == 0) {
            numColumns = columns1 * tag;
        } else if (columns2 <= tag) {
            numColumns = columns1 * tag + 1;
        } else {
            numColumns = columns1 * tag + (columns2 - tag);
        }
        char[][] array = new char[numRows][numColumns];
        int count = 0;
        for (int i = 0; i < numColumns; i++) {
            for (int j = 0; j < numRows; j++) {
                if (i % tag == 0) {
                    array[j][i] = s.charAt(count);
                    count++;
                } else if ((i + j) % tag == 0) {
                    array[j][i] = s.charAt(count);
                    count++;
                }
                if (count >= s.length())
                    break;
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (array[i][j] != 0) {
                    answer = answer + array[i][j];
                }
            }
        }
        return answer;
    }
}
