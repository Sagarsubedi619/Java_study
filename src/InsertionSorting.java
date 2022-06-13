public class InsertionSorting {

    public int[] InsertionSortingImplementation(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int j = i - 1;
            current = nums[i];
            while (j >= 0 && nums[j] > current) {
                nums[j + 1] = nums[j];
                j = j - 1;
                nums[j + 1] = current;
            }
        }
        return nums;
    }

    public int[] InsertionSortingImplementationDescending(int[] nums) {
        int current = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int j = i - 1;
            current = nums[i];
            while (j >= 0 && nums[j] < current) {
                nums[j + 1] = nums[j];
                j = j - 1;
                nums[j + 1] = current;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertionSorting demo1=new InsertionSorting();
        int[] inputArray = {2, 1, 6, 5, 4, 3, 7};
        var x = demo1.InsertionSortingImplementation(inputArray);
       //var y = demo1.InsertionSortingImplementationDescending(inputArray);
        for (int i = 0; i < inputArray.length ; i++) {
            System.out.println(x[i]);
            //System.out.println(y[i]);


        }
    }
}
