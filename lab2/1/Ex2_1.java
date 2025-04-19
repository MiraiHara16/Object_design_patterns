import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2_1 {
    public static final int MAX = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        List<Integer> nums = readValidIntegers();

        if (nums.size() == MAX) {
            sort(nums);
        } else {
            System.out.println("Invalid input...");
        }
    }

    private static List<Integer> readValidIntegers() {
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter " + MAX + " valid integers in the range [0, 10]");

        while (nums.size() < MAX) {
            String s = inp.nextLine();

            try {
                int num = Integer.parseInt(s);

                if (num < 0 || num > 10) {
                    System.out.println("Invalid range! Try again!");
                    continue;
                }
                nums.add(num);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid range! Try again!");
            }
        }
        inp.close();

        return nums;
    }

    private static void sort(List<Integer> nums) {
        Collections.sort(nums);

        System.out.println("Sorted numbers:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
