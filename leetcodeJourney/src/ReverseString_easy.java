import java.util.Arrays;

public class ReverseString_easy {

    public static void main(String[] args) {
        Character s[] = new Character[]{'h','e','l','l','o'};

    }

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while (start < end){
            Character temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
    }


}
