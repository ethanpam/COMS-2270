package lab5;

public class Checkpoint1 {
    public static String getInitials(String name){
        String result = "";
        String[] parts = name.split(" ");

        for (int i = 0; i < parts.length; i++) {
            result += parts[i].charAt(0);
        }
        return  result;
    }

    public static int findFirstVowel(String s){
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) >= 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println(getInitials("Cher")); // C
        System.out.println(getInitials("Ethan Pham")); //EP
        System.out.println(getInitials("Edna del Humboldt von der Schooch")); //EdHvDS

        System.out.println("--------------------------------------");

        System.out.println(findFirstVowel("hello")); // 1
        System.out.println(findFirstVowel("str")); // -1
        System.out.println(findFirstVowel("aeiou")); // 0
    }
}