package StackByDSA;

import java.util.Stack;

public class DisplayReverseRec {
    public static void displayRevRec(Stack<Integer> st){
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRec(st);
        st.push(top);
    }
    public static void insertAtBottom(Stack<Integer> st){
//        base case

//        Recursion work
        while (st.size()>0){

        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayRevRec(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        st.push(6); /*by this we can insert 6 at bottom in stack*/
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
