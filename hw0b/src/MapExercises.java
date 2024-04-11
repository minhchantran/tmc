import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (char curr = 'a'; curr <= 'z'; curr++) {
            map.put(curr, i);
            i++;
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, i*i);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> map1 = new HashMap<>();
        int count = 0;
        List<String> appeared = new ArrayList<>();
        for (String i : words) {
            if (!appeared.contains(i)) {
                appeared.add(i);
            }
        }
        for (String i : appeared) {
            for (String j : words) {
                if (j.equals(i)) {
                    count++;
                }
            }
            map1.put(i, count);
            count = 0;
        }
        return map1;
    }
}
