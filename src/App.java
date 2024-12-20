public class App {

    // Str1 = azobecozebanc
    // Str2 = abc

    // Substring1: azobec
    // Substring2: cozeba

    // SubstringN: banc

    // returns the smallest string that contains the characters in Str2

    public static String findSubs(String one, String two) {

        String shortest = "";
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < one.length(); i++) {
            for (int j = i + 1; j <= one.length(); j++) {  // Iterate through all possible substrings
                String sub = one.substring(i, j);

                if (two.chars().allMatch(c -> sub.indexOf(c) >= 0)) {
                    if (sub.length() < minLength) {
                        shortest = sub;
                        minLength = sub.length();
                    }
                }
            }
        }

        return shortest;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(findSubs("azobecozebanc", "abc")); // Output: banc
        System.out.println(findSubs("abczobecozebanc", "abc")); // Output: abc
    }
}
