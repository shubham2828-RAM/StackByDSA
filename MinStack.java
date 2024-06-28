package StackByDSA;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack(){
//        constructor
    }
    public void push(int val ){
        if(st.size() == 0){
            st.push(val);
            min.push(val);
        }
        else {
            st.push(val);
            if (min.peek() <val) min.push(min.peek());
            else min.push(val);
            }
        }
        public void pop(){
        st.pop();
        min.pop();

    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return min.peek();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(4);


    }
}
