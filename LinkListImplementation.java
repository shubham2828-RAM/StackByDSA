package StackByDSA;

public class LinkListImplementation {
    public static class Node
    {/*user defined data type*/
        int val;
        Node next;

        Node(int val)
        {  /*we made a constructor in this line */
            this.val = val;
        }
    }
    public static class LLStack
    {
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head=temp;
            size++;
        }
        int pop(){
            if (head == null){  /*size of linklist is 0*/
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head =head.next;
            size--;
            return x;

        }
        int peek(){
            if (head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;

        }
        void displayRec(Node h){
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
            displayRec(head);
        }
        void displayReverse()
        {
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
            System.out.println();
        }
        int size(){  /*getter*/
            return size;
        }
        boolean isEmpty(){
            if (size ==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println();
        System.out.println("The size: "+st.size());
        st.pop();
        st.display();
        System.out.println();
        System.out.println("The size: "+st.size());
    }
}
