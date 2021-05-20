package main.java.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/5/20 11:03
 */
public class TopKFrequent {

    public static List<String> topKFrequent(String[] words, int k) {
        // List<String>
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> resultTmp = new ArrayList<>();
        map.forEach((key, v) -> {
            resultTmp.add(key);
        });
        resultTmp.sort(Comparator.comparingInt(map::get));
        //  resultTmp.sort((a1, a2) -> map.get(a2) - map.get(a1));
        return resultTmp.subList(0, k);
    }

    public static void main(String[] args) {
        String[] param = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(param, 2));
    }

}
