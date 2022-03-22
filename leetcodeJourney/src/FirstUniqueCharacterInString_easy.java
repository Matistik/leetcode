import java.util.HashMap;

public class FirstUniqueCharacterInString_easy {

    public static void main(String[] args) {


        System.out.println('b' - 'a');


    }

    //nauceny

        public static int firstUniqChar(String s) {
            int freq [] = new int[26];
            for(int i = 0; i < s.length(); i ++)
                freq [s.charAt(i) - 'a'] ++;
            for(int i = 0; i < s.length(); i ++)
                if(freq [s.charAt(i) - 'a'] == 1)
                    return i;
            return -1;
        }


    //moj solution
    class Solution {
        public int firstUniqChar(String s) {

            char[] characters = s.toCharArray();
            boolean isUnique = false;
            for (int i = 0; i < characters.length;i++){
                isUnique = false;
                for (int j = 0; j < characters.length;j++){

                    if (i == j){
                        continue;
                    }

                    if (characters[i] == characters[j]) {
                        isUnique = true;
                        break;
                    }
                }

                if (!isUnique){
                    return i;
                }

            }

            return -1;

        }
    }




}
