package StackByDSA;

import java.util.Stack;

public class PushAtAnyIndex {
    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        System.out.println(st);
        int idx = 2;
        int val = 11;
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);


    }
}
