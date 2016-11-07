package com.jags.explore.java.progexercises;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jags on 13/10/2015.
 */
public class StringDuplicate {

    public static void main(String[] args) {
        StringDuplicate sd = new StringDuplicate();
        String dupStr = "Java languagej";
        sd.findDuplicate(dupStr);
    }

    private void findDuplicate(String dupStr) {
        char[] chars = dupStr.toCharArray();
        Set<Character> dupChars = new HashSet<>();
        Set<Character>  foundChars = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (foundChars.contains(aChar)) {
                dupChars.add(aChar);
            } else {
                foundChars.add(aChar);
            }
        }
        System.out.println(dupChars.size());
        System.out.println(dupChars);
    }
}
