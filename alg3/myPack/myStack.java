package myPack;

public class myStack {

    public  static class Stack {
        private myStackElement head;
        private myStackElement tail;
        private int size = 0;

        public void clear(){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        public void copy(Stack list){
            int[] a = new int[size];
            if (size == 0) return;
            myStackElement t = head;
            int i = size;
            while (t.next != null) {
                i--;
                a[i] = t.data;
                t = t.next;
            }
            i--;
            a[i] = t.data;

            for (int j : a){
                list.push(j);
            }
        }

        public int chek(){
            return head.data;
        }

        public int get(){
            int c = head.data;
            if (size == 1) {
                head = head.next;
            } else {
                clear();
            }
            return c;
        }

        public void push(int data)
        {
            myStackElement a = new myStackElement();
            a.data = data;
            size++;

            if(head == null)
            {
                head = a;
                tail = a;
            }
            else {
                a.next = head;
                head = a;
            }
        }

        public void printStack()
        {
            if (size == 0){
                System.out.println("Ваш список пуст");
                return;
            }
            myStackElement t = head;
            while (t != null)
            {
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }

        public int size(){
            return size;
        }

        public  static class myStackElement {
            myStackElement next;
            int data;
        }
    }


}
