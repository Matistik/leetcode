import java.util.HashMap;

public class RomanToInteger_easy {

    public static void main(String[] args) {

        String s = "CCXLVII";
        int integer = 0;


        HashMap<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        for (int i = 0; i < s.length(); i++){

            if ( i != s.length()-1 && ((s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) || (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) || (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))) ){
                    integer += romans.get(s.charAt(i + 1)) - romans.get(s.charAt(i));
                    i++;
                }
                else {
                    integer += romans.get(s.charAt(i));
                }
        }

          System.out.println(integer);

    }

}
