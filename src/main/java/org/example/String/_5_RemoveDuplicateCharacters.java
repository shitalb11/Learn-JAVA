package org.example.String;

public class _5_RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Shiiiiitaaall";
        String result = "";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(result.indexOf(ch) == -1){
                result = result+ch;
            }
        }
        System.out.println("original String: " + str);
        System.out.println("After Removing: " + result);
    }
}

