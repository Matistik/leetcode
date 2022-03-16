public class Implement_strStr_easy {

    public static void main(String[] args) {

  }

    public int strStrLearned(String haystack, String needle) {


        if(haystack == null || needle == null || needle.length() > haystack.length()){
            return -1;
        }
        if (needle.length() == 0){
            return 0;
        }
        for(int i = 0; i < haystack.length() - needle.length() + 1;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, needle.length() + i).equals(needle)){
                    return i;
                }
            }

        }

        return -1;

    }
     //moj "elegantny solution, mal som problemy so zlozitejsimi testami, no nebol som az tak vedla, vlastne, ako teraz
    //pozeram na jeden YT solution tak jadro som mal v podstate rovnake
    class Solution {
        public int strStr(String haystack, String needle) {


            String subHay = "";
            int startIndex = 0;

            if (needle.length() == 0){
                return 0;
            }
            if (haystack.length() == 0){
                return -1;
            }
            if (needle.length() > haystack.length()){
                return -1;
            }

            if (haystack.equals(needle)){
                return 0;
            }




            for (int i = 0; i < haystack.length();i++){
                if(haystack.charAt(i) == needle.charAt(0) && (i+needle.length()) <= haystack.length()){
                    subHay = haystack.substring(i,i+needle.length());
                }

                if (subHay.equals(needle)){
                    startIndex = i;
                    break;
                }
                else {
                    startIndex = -1;
                }
            }
            return startIndex;
        }
    }


}
