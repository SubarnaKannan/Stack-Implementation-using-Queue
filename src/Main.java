import java.util.*;
class Queue {
    Stack<Integer> s1, s2;
    Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void add (int val) {
        while (!s1.isEmpty())
            s2.push (s1.pop());
        s1.push(val);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }
    public int top() {
        if (!s1.isEmpty())
            return s1.peek();
        return -1;
    }
    public int poll() {
        if (!s1.isEmpty())
            return s1.pop();
        return -1;
    }
}
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Queue que = new Queue();
        for (int i=0;i<n;i++)
            que.add(sc.nextInt());
        System.out.println(que.top());
        System.out.println(que.poll());
        System.out.println(que.top());
        System.out.println(que.poll());
    }
}