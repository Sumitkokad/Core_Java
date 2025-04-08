/*
 3. return length(str.substring(1)) + 1;
str.substring(1) returns the string excluding the first character.

Each recursive call shortens the string by one character.

+ 1 counts the current character.



length("abcde")
→ length("bcde") + 1
→ (length("cde") + 1) + 1
→ ((length("de") + 1) + 1) + 1
→ (((length("e") + 1) + 1) + 1) + 1
→ ((((length("") + 1) + 1) + 1) + 1) + 1
→ ((((0 + 1) + 1) + 1) + 1) + 1
→ 5


*/

public class Solution {
public static int length(String str) {
if(str.length() == 0) {
return 0;
}
return length(str.substring(1)) + 1;
}
public static void main(String[] args) {
String str = "abcde";
System.out.println(length(str));
}
}
