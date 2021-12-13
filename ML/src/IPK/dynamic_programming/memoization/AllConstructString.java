package IPK.dynamic_programming.memoization;

import java.util.*;
import java.util.stream.Collectors;

public class AllConstructString {
    private static Map<String, List<List<String>>> memo = new LinkedHashMap<>();

    public static void main(String[] args) {
        System.out.println(allConstruct(new String[]{"purp", "p", "ur", "le", "purpl"}, "purple"));
        System.out.println(allConstruct(new String[]{"a", "b", "c", "ab"}, "abc"));
        System.out.println(allConstruct(new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}, "abcdef"));
        System.out.println(allConstruct(new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"}, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaad"));
    }

    private static List<List<String>> allConstruct(String[] array, String target) {
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target.equals("")) {
            return Arrays.asList(new ArrayList<>());
        }
        List<List<String>> result = new ArrayList<>();
        for (String word : array) {
            if (target.indexOf(word) == 0) {
                String sub = target.substring(word.length());
                List<List<String>> output = allConstruct(array, sub);
                List<String> arr = new ArrayList<>();
                List<List<String>> res = output.stream().map(each -> {
                    arr.addAll(each);
                    arr.add(0, word);
                    return arr;
                }).collect(Collectors.toList());
                result.addAll(res);
            }
        }
        memo.put(target, result);
        return result;
    }
}
