//Code added from recursion1=4th code
//Q) Given an array find the sum of the elements
public class Practice {
    public static int linearSum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // Space = 1+1 = 2*n^0 = O(n^0) = O(1)
    // Time = O(n)
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,4,5,6,8};
        int sum = linearSum(arr);
        System.out.println(sum);
    }
}