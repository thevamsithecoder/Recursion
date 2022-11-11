//Code added from recursion1=4th code
//Q) Given an array find the sum of the elements
public class ArraySum {

    public static int linearSum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i]; //sum = sum+arr[i]
        }
        return sum;
    }
    // Space = 1+1 = 2*n^0 = O(n^0) = O(1)
    // Time = O(n)

    public static int recursiveSum(int[] arr, int position) {
        if (position==arr.length) { //base case //when we are at the end then no elements to add so return 0
            return 0;
        }
        return arr[position] + recursiveSum(arr, position+1); //current sum+rest of the position
    }
    // Space = 0 = 0*n^0 = O(n^0) = O(1)
    // Time = O(n)

    public static void main(String[] args) {
        int[] arr = new int[] {2,5,3,1,4,5,6,8}; //0th position+rest part of the elements, 0+1 th posiitio+rest of the element

        int sum = linearSum(arr);
        int rSum = recursiveSum(arr, 0);
        System.out.println(sum + " " + rSum); //34 34 both answers are correct
    }
}