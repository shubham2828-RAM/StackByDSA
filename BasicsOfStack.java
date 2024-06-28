package StackByDSA;

import java.util.*;

public class BasicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(8);
        st.push(3);
        st.push(5);
        System.out.println(st.peek());  /*by peek function we can used to print or know about last
        element */
        System.out.println(st);
        System.out.println(st.size()); /*by this we can know the size of the stack*/
        st.pop();/*by this we can remove the last element */
        System.out.println(st);
        System.out.println(st.size());




    }
}
