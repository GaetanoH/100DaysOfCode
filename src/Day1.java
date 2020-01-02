import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {

        int[] listToSort = new int[]{12, 4, 10, 5, 2};
        bubbleSort(listToSort);

        System.out.println(Arrays.toString(listToSort));

    }

    private static int[] bubbleSort(int[] list) {

        int temp;

        //Get the first number in the array

        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }
}
