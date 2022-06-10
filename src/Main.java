public class Main {
    public int[] BubbleSortAlgorithm(int[] arrayNumbers) {
        int temp;
        for (int i = 0; i < arrayNumbers.length - 1; i++) {
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
    public static void main(String[] args) {
        Main demo1 = new Main();
        int[] inputArray = {2, 1, 6, 5, 4, 3, 7, 0};
        for (int i = 0; i < inputArray.length - 1; i++) {
            System.out.println(demo1.BubbleSortAlgorithm(inputArray)[i]);
        }
    }

}