/**
 * 1)Multiplication and division we take it as log n how>
 * ans)for(int i = 1; i<n; i= i*n;){
 *     sout(i);
 * }
 *
 *In the above we know i runs for once. But we don't know how many times the n runs
 * So we assume that it will run for k times which is called
 * K assume approach.
 * so i<n goes for k times and i=i*2 goes for k times
 * and sout(i)= k times
 * Total times complexity = 1+k+k+K=3k+1
 * But here we have to convert k in terms of n.
 * In the first iteration value of i = 1
 * In the second iteration value of i = 1*2 =2
 * In the third iteration value of i = 2*2 = 2(square)
 * In the fourth iteration value of i = 2(q)
 * It stops when till i to the power k
 * i= 2 to the power k
 * my for loop condition is i<n; i can say that
 * my for loop stops i>=n i can say like that
 * i>=n
 * 2k>=n
 * log(2k)>= log n //taking log on both sides
 * k log2 >= log n //ignore the constants
 * k = logn
 * so my T.C is 3k+1
 * 3*logn+1
 * O(logn)
 *
 * same applicable for the another for loop of multiplication
 * for(int i = 1; i<n; i= i*3)
 *
 *Recursion example:
 * Ticket counter: Task is figure out no. of people present in the queue
 * No. of people standing infront of me+ myself
 *The answer myself+ infront me one person
 * The last person answers is me+ no on infront me
 * Total count will be the answer
 * 1+ count() 5(1+4)
 *1+ count() 4(1+3)
 *1+ count() 3 (1+2)
 *1+ count() 2 (1+1)
 *1+ count() 1 (1+0)
 * i can say like count i = count(i-1) + 1
 *                 count 5 = count 4+1
 *                  count 4 = count 3+1
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */