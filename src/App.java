

public class App {
    
    // Str1 = azobecozebanc
    // Str2 = abc

    // Substring1: azobec
    // Substring2: cozeba

    // SubstringN: banc

    // returns the smallest string that contains the characters in Str2

    public static String findSubs(String one, String two) {

        int len = one.length();
        String output = "";

        for (int i = 0; i < one.length(); i++) {
            String sub = one.substring(i); // Simplified substring

            if (two.chars().allMatch(c -> sub.indexOf(c) >= 0)) { // Functional style matching
                if (sub.length() < len) {
                    output = sub;
                    len = sub.length();
                }
            }
        }

        return output;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(findSubs("azobecozebanc", "abc")); // Output: banc
        
    }
}
