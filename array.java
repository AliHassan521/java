
public class array {

    public static void main(String[] args) {

        // static array
        // int nums[] = { 1, 2, 3, 4, 5 };

        // System.out.println(nums[0]);

        // int nums[] = new int[5];

        // nums[4] = 2;

        // System.out.println(nums[4]);

        // int nums[] = new int[6];

        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = i;
        // }

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        int nums[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // another method to iterate arrays

        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}