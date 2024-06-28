package StackByDSA;

public class ArrayImplementation {
    public static class Stack {


        private int[] arr = new int[50];
        private int idx = 0;

        void push(int x) { /*this is function*/
            if (isFull()) {
                System.out.println("Stack is full ");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() { /*this is function*/
            if (idx == 0) {
                System.out.println("Stack is Empty! ");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() { /*this is function*/
            if (idx == 0) {
                System.out.println("Stack  is full ");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {/*this is function*/
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {/*this is function*/
            return idx;
        }

        boolean isEmpty() {/*this is function*/
            if (idx == 0) return true;
            else return false;
        }

        boolean isFull() { /*this is function*/
            if (idx == arr.length) return true;
            else return false;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println("The size: "+st.size());
        st.pop();
        st.display();
        System.out.println("The size: "+st.size());

    }
}
//in this Stack into array

// this is interview asked question which is asked in the interview