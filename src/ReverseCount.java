//Code added from recursion 1= 3rd code
//This is called as tail recursion
//Recursion starts from the last poistion it says myself 1 add it to you and count till the end and return to me.
//1
//1+1=2
//1+2=3
//1+3=4
//1+4=5
public class ReverseCount {

    public static int reverseCount(int p, int count) {
        if (p==0) {
            return count;
        }
        return reverseCount(p-1, count+1);
    }

    public static void main(String[] args) {
        int positions = 5;
        int total = reverseCount(5, 0);
        System.out.println(total);
    }
}
// 5 -> 0
// 4 -> 1
// 3 -> 2
// 2 -> 3
// 1 -> 4
// 0 -> 5