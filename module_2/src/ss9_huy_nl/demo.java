package ss9_huy_nl;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        String str = "CodegymDaNang";
        System.out.println(solution(str));

    }

    static String solution(String str) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
        }
        for (int i = 0; i < characterList.size(); i++) {
            char upperCaseChar = Character.toUpperCase(characterList.get(i));
            if (characterList.get(i).equals(upperCaseChar)) {
                if (i == 0) {
                    char lowerCaseChar = Character.toLowerCase(characterList.get(i));
                    characterList.set(i, lowerCaseChar);
                } else {
                    char lowerCaseChar = Character.toLowerCase(characterList.get(i));
                    characterList.set(i, lowerCaseChar);
                    characterList.add(i, ' ');
                }
            }
        }
        String result = "";
        for (int i = 0; i < characterList.size(); i++) {
            result += characterList.get(i);
        }
        return result;
    }
}