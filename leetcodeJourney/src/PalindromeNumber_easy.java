public class PalindromeNumber_easy {

    //learnedSolution
    //first encounter with reversing integer
    public static void main(String[] args) {

        int number = 1234;
        int reversedNumber = 0;

        while (number > reversedNumber){
            int lastNumber = number % 10; // nemoze koncit nulou, teda v poslednom cisle ostane zvysok, napr 1234 % 10 = 4
            reversedNumber = (reversedNumber * 10) + lastNumber;
            //0 * 10 + 4 = 4
            //4 * 10 + 3 = 43
            //43 * 10 + 2 = 432
            //432 * 10 + 1 = 4321
            number /= 10; //posuniem cislo dolava
        }
        System.out.println(reversedNumber);

    }

    //mySolution
    public boolean isPalindrome(int x) {

        String temp = Integer.toString(x);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(temp);
        stringBuilder.reverse();

        if (String.valueOf(stringBuilder).equals(temp)){
            return true;
        }
        return false;

    }
}
