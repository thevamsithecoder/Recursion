//Code added from recursion 1= 1st code
//Q)Addition of two numbers by using functions
public class MethodStack {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int sum = add(a,b);
        System.out.println(sum);

    }
}
//What really happeds when a method add calling to another method main?
/**
 * Stack data structure works behind the scene. Lets assume a bucket you are droping one box B1, B2 & B3.
 * can you pullout the B1 box from the bucket?
 * yes, you can but i will remove B3 first then B2 then i am able to remove B1.
 * LIFO priniciple works Here. This bucket is basically called stack. When we insert element is called push,
 * when take out the element from the top of the element is called pop. JVM memory is a stack.
 * Initially the control was in main method then it goes to add method.
 * In the bucket stack, first main method avaialble then add method available then add method popped out from the stack by
 * doing addition.Execution add method finished, after that main method also popped out from the stack and gave the result as 9.
 *
 * Speciality of main method is the execution of code starts from the main method
 */