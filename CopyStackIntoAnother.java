package StackByDSA;

import java.util.Scanner;
import java.util.Stack;

public class CopyStackIntoAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st = new Stack<>();
        System.out.println("Enter Number of the values: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of the element: ");
        for (int i=0; i<n;i++ ){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while (st.size() >0 ){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();
//            or we can do
            rt.push(st.pop());
        }
        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
//        System.out.println(rt);
//        System.out.println(st);

    }
}
//if we want to copy all elements in same order than we have to take one other stack in which we can store
//the elements in reverse order and than in same order in actual stack

