//code added from recursion 1 = 2nd code
public class Count {

    public static int count(int p) {
        if (p==0) { //at 0th position we have zero persons //base case
            return 0;
        }
        return 1+count(p-1); //same function calling itself is called as recursion
    }

    public static void main(String[] args) {
        int positions = 5;
        int result = count(positions);
        System.out.println(result);
    }
}