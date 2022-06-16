package SortingAlgorithms;

public class SelectionSort {

    public int[] SelctionSortImplementation(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                    temp = nums[minIndex];
                    nums[minIndex] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public int[] SelectionSortDescending(int[] nums){
        int temp=0;
        for(int i=0;i<nums.length-1;i++){
            int maxIndex=i;
            for (int j=i+1;j<nums.length-1;j++){
                if(nums[maxIndex]<nums[j]){
                   maxIndex=j;
                   temp=nums[i];
                   nums[i]=nums[maxIndex];
                   nums[maxIndex]=temp;
                }
            }
        }

        return nums;
    }


    public static void main(String[] args) {
        SelectionSort demo1 = new SelectionSort();
        int[] inputArray = {2, 1, 6, 5, 4, 3, 7};
        var x = demo1.SelctionSortImplementation(inputArray);
        var y = demo1.SelectionSortDescending(inputArray);
        for (int i = 0; i < inputArray.length-1; i++) {
            System.out.println(y[i]);

        }
    }
}
