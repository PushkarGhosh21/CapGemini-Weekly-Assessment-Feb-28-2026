package stack;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(10);
        st.push(50);
        st.push(20);

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            int curr = st.pop();

            while (!temp.isEmpty() && temp.peek() > curr) {
                st.push(temp.pop());
            }
            temp.push(curr);
        }

        System.out.println(temp);
    }
}
