import java.util.*;

public class Leetcode_17 {
    public static void main(String[] args) {
//        System.out.println(letterCombinations("23"));
        pad("","89");
    }

//    public static List<String> letterCombinations(String digits) {
//        List<String> result = new ArrayList<>();
//        if (digits.isEmpty()) return result;
//
//        String[] map = { "",    "",    "abc", "def",
//                "ghi", "jkl", "mno", "pqrs",
//                "tuv", "wxyz" };
//        backtrack(result, digits, "", 0, map);
//        return result;
//    }
//
//    private static void backtrack(List<String> result, String digits, String current, int index, String[] map) {
//        // Base case: if we've built a combination for all digits
//        if (index == digits.length()) {
//            result.add(current);
//            return;
//        }
//
//        // Find letters for the current digit
//        int digit = digits.charAt(index) - '0';
//        String letters = map[digit];
//
//        // Try each possible letter
//        for (char ch : letters.toCharArray()) {
//            backtrack(result, digits, current + ch, index + 1, map);
//        }
//    }


        static void pad(String p, String up){
            if (up.isEmpty()){
                System.out.println(p);
                return;
            }

            String[] map = {
                    "",    "",    "abc", "def",
                    "ghi", "jkl", "mno", "pqrs",
                    "tuv", "wxyz"
            };

            int digit = up.charAt(0) - '0'; // convert '2' → 2
            String letters = map[digit];    // get "abc" for 2

            for (int i = 0; i < letters.length(); i++) {
                char ch = letters.charAt(i);   // get character at index i
                pad(p + ch, up.substring(1));
            }
        }
}
