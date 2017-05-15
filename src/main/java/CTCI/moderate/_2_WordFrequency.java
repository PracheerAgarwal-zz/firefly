package CTCI.moderate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pracheer.agarwal on 5/15/17.
 */
public class _2_WordFrequency {
    public static void main(String[] args) {
        String[] book = {"abcd", "atp", "eta"};
        _2_WordFrequency obj = new _2_WordFrequency();
        Map<String, Integer> dictionary = obj.getDictionary(book);
    }

    Map<String, Integer> getDictionary(String[] book) {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        for(String str : book) {
            String key = str.trim().toLowerCase();
            if(dictionary.containsKey(key)){
                dictionary.put(key , dictionary.get(key) + 1);
            } else {
                dictionary.put(key, 1);
            }
        }

        return dictionary;
    }
}
