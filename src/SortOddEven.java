import java.util.Arrays;

public class SortOddEven {


    public static void main(String[] args) {
        int nums[] = new int[]{54, 122, 1, 1, 3, 3, 4, 5, 4, 5, 14};


        int size = nums.length;

        for (int i = 0; i < size; ++i)
            for (int j = i + 1; j < size; ++j) {
                if (0 == nums[i] % 2) {
                    if (0 != nums[j] % 2) {
                        int k = nums[i];
                        nums[i] = nums[j];
                        nums[j] = k;
                    }

                }

            }
        System.out.println(Arrays.toString(nums));

    }


}
