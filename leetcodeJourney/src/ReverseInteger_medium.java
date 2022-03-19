public class ReverseInteger_medium {

    public static void main(String[] args) {

        int reversedNumber = 0;
        int x = 1534236469;

        while (x != 0) {

            if (reversedNumber > 214748364 || reversedNumber < -214748364) {
                System.out.println(0);
            }

            int pop = x % 10;
            reversedNumber = (reversedNumber * 10) + pop;
            x /= 10;
        }

        System.out.println(reversedNumber);

    }

}
