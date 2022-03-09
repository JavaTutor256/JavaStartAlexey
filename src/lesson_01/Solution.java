package lesson_01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello world";
        String abc = "abc";
        String abd = "abb";
        System.out.println(isPalindrom("amma"));
//        System.out.println(s.substring(2,5));
//        System.out.println(s.indexOf('o'));
//        String[] strArray = s.split("\s+");
//        System.out.println(Arrays.toString(strArray));
//        char x = 97;
//        System.out.println(x);

//        System.out.println(abc.compareTo(abd));
        char[] charArray = s.toCharArray();

//        System.out.println(s.concat(" and Alexey"));
//        int[] arr = {1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(charArray));
/*        char e = s.charAt(1);
        System.out.println(e);*/
//        String newString = s.toUpperCase();
//        System.out.println("s: " + s + "\n" + "newString: " + newString);
    }

    // amma
    public static boolean isPalindrom(String str){
        for (int i = 0; i < str.length()/2; i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - i - 1);
            if (c1 != c2) return false;
        }
        return true;
    }

    public static boolean isUniqStringv2(String str){
        if (str.length() > 26) return false;
        boolean[] arr = new boolean[123];
        for (int i = 0; i < str.length(); i++) {
            if (!arr[str.charAt(i)]){
                arr[str.charAt(i)] = true;
            }else{
                return false;
            }
        }
        return true;
    }

    // blablabla
    public static boolean isUniqString(String str){
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
