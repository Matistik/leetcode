import java.util.Arrays;
import java.util.HashMap;

public class RotateArray_Medium {

    // druhy solution s hash mapou, 3 hodiny som na tom robil len preto aby som zistil ze je to podstatne pomalsie
    public static void main(String[] args) {

        int[] nums = new int[]{1,2};
        int k = 11;
        int rotatedNums[] = new int[nums.length];
        HashMap<Integer,Integer> intMap2 = new HashMap<>();



        for (int i = 0; i < nums.length;i++){

            intMap2.put(((k+i)%nums.length),nums[((k+i)%nums.length)]);
             nums[(k+i)%nums.length] = nums[i];

                if (i >= k || (k > nums.length && i >= k%nums.length)){
                    nums[(k+i)%nums.length] = intMap2.get(i);
                }
        }

        System.out.println(Arrays.toString(nums));

     }

     //learned solution, ako hovoril nick, niektore veci tak proste su a treba sa ich len naucit, najsor reversnem array, potom ho reversnem po k a potom od k
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    //prvy takmer instantny solution
    public void rotate(int[] nums, int k) {

        int rotatedNums[] = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            rotatedNums[(k+i)%nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length;i++){

            nums[(k+i)%nums.length] = rotatedNums[(k+i)%nums.length];

        }
    }
}
