/*To simply check whether two strings are anagrams, you can sort their  characters and compare the sorted results. Here's a concise method:
Check Lengths: If the lengths of the two strings are not the same, they cannot be anagrams.

Sort and Compare:

Convert the strings into character arrays (toCharArray()).
Sort the arrays (Arrays.sort()).
Compare the sorted arrays (Arrays.equals()).*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
       
        System.out.println(areAnagrams(str1, str2) ? "Anagrams" : "Not Anagrams");
        sc.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays, sort, and compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
