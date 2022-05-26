package com.hello;
/*
 given n, print up to n line
 1
 11
 21
 1211
 111221
 312211
 
 
*/
public class SophieDadQuestion1 {
    public static void answer(int n) {
        helper("1", n);
    }

    private static void helper(String str, int n) {
        
        if (n > 0 && str.length() == 1) {
            System.out.println(str);
            n--;
        }
        if (n < 1) {
            return;
        }

        StringBuilder builder = new StringBuilder();
        int count = 1;
        for( int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(i == str.length()-1) {
                builder.append(count).append(current);
                break;
            }
            if (current == str.charAt(i+1)) {
                count++;
            } else {
                builder.append(count).append(current);
                count = 1;
            }
        }
        String result = builder.toString();
        System.out.println(result);
        helper(result, n-1);
    }
}
