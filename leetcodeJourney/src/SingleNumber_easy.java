import com.sun.jdi.IntegerValue;

import java.util.HashMap;
import java.util.Optional;

public class SingleNumber_easy {

    public static void main(String[] args) {

        int[] nums = new int[]{4,1,2,1,2};
        HashMap<Integer, Integer> singleNum = new HashMap<>();
        for (int i = 0; i < nums.length;i++){

            if (singleNum.containsKey(nums[i])){
                singleNum.remove(nums[i]);
                continue;
            }
            singleNum.put(nums[i],i);


        }


        System.out.println(singleNum.keySet().stream().findFirst().get());

        int result = 0;
        System.out.println( result = result ^ 4);
        System.out.println( result = result ^ 1);
        System.out.println( result = result ^ 2);
        System.out.println( result = result ^ 1);
        System.out.println( result = result ^ 2);


 }
    //learned Solution using XOR operation
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
