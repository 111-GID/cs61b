import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character,Integer> m= new HashMap<>();
        for(int i=0;i<26;i++){
            m.put((char)('a'+i),i+1);
        }
        return m;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            int j= (int) Math.pow(i,2);
            m.put(i,j);
        }
        return m;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> m= new HashMap<>();
        for (String elem:words){
            if(!m.containsKey(elem)){
                m.put(elem,1);
            }else{
                m.put(elem,m.get(elem)+1);
            }
        }
        return m;
    }
    public static void main(String[] args){
        int i=0;
        for(char key : letterToNum().keySet()){
            System.out.print(key);
            System.out.println(letterToNum().get(key));
        }


    }
}
