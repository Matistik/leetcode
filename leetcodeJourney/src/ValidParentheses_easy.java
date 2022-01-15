import java.util.Stack;

public class ValidParentheses_easy {

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
        //prva iteracia pushne do stacku '('

        //druha iteracia pushne do stacku '['

        //v tretej iteracie neplati podmienka z pushom
        // plati ale podmienka ze charakter je ]
        // pomocou funckie peek sa pozrie na top stacku, stack : [ ( ] [ [ ] , podmienka ze na peeku je ']' plati
        // a zaroven stack nieje prazdny
        //pomocou funckie pop sa vyhodi charakter na tope, stack teda bude vyzerat [ ( ]

        //stvrta iteracia bude vyzerat podobne ako tretia, pozrie sa na predosli, bude sediet a popne zatvorku

        //isEmpty plati a teda vracia true

    }

    public static boolean isValid(String s){

        if (s.length() % 2 != 0){
            return false;
        }

        Stack<Character> characterStack = new Stack<>();
        for(Character c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                characterStack.push(c);
            } else if (c == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') { //najskor sa treba pozriet ci je prazdny, inak by program padol
                characterStack.pop();
            }
            else if (c == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                characterStack.pop();
            }
            else if (c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                characterStack.pop();
            }
            else {
                return false;
            }
        }
        return characterStack.isEmpty();

    }


    //previous solution from codewars, added other brackets
    //did not pass leetcode problem
    public static boolean isValidOld(String s)
    {
        int counter = 0;
        int leftCounter = 0, leftSquareCounter = 0, leftBracketCounter = 0;
        int rightCounter = 0, rightSquareCounter = 0, rightBracketCounter = 0;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == ')'){
                rightCounter++;
                counter++;
            }
            if (s.charAt(i) == '('){
                leftCounter++;
                counter--;
            }

            if (s.charAt(i) == ']'){
                rightSquareCounter++;
                counter++;
            }
            if (s.charAt(i) == '['){
                leftSquareCounter++;
                counter--;
            }

            if (s.charAt(i) == '}'){
                rightBracketCounter++;
                counter++;
            }
            if (s.charAt(i) == '{'){
                leftBracketCounter++;
                counter--;
            }



            if (rightCounter > leftCounter || rightBracketCounter > leftBracketCounter || rightSquareCounter > leftSquareCounter  ){
                return false;
            }

        }
        if (rightCounter < leftCounter || rightBracketCounter < leftBracketCounter || rightSquareCounter < leftBracketCounter){
            return false;
        }

        if (counter == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
