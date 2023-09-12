package ru.ollyeys.neetcode150.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

class validAnagram {
    public static boolean  isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }

        if (sMap.equals(tMap)) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("abcd", "abcde"));
    }
}
