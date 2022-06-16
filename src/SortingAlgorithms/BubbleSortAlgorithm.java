package SortingAlgorithms;

public class BubbleSortAlgorithm {
    public int[] BubbleSortAlgorithmImplementation(int[] arrayNumbers) {
        int temp;
        for (int i = 0; i < arrayNumbers.length - 2; i++) {
            for (int j = i + 1; j < arrayNumbers.length - 1; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
        return arrayNumbers;
    }

    public int[] BubbleSortForDescending(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        BubbleSortAlgorithm demo1 = new BubbleSortAlgorithm();
        int[] inputArray = {2, 1, 6, 5, 4, 3, 7};
        var x = demo1.BubbleSortAlgorithmImplementation(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(x[i]);
            System.out.println(demo1.BubbleSortForDescending(inputArray)[i]);
        }
    }
}