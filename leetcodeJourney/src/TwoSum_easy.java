import java.util.HashMap;
import java.util.Map;

public class TwoSum_easy {


    //learnedSolution
    //first encounter with hashmap
    public int[] twoSum2(int[] nums, int target) {

        int result = 0;
        int[] out = new int[2];

        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (num_map.containsKey(complement)){
                return new int[] {num_map.get(complement), i};

            }
            num_map.put(nums[i],i);

        }
        return out;

    }


     //mySolution
    public int[] twoSum(int[] nums, int target) {

        int result = 0;
        int[] out = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                result = nums[i] + nums[j];
                if (result == target){
                    out[0] = i;
                    out[1] = j;

                    return out;
                }
                else {
                    result = 0;
                }
            }
        }
        return out;
    }
}
