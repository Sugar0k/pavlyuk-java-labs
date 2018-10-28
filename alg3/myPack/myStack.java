package myPack;

public class myStack {

    public  static class Stack {
        private myStackElement head;
        private myStackElement tail;
        private int size = 0;

        public boolean empty(){
            if (size == 0) return true;
            return false;
        }

        public void temp(){ // Заменяет первый минимальный элемент на 0
            if (size == 1){
                head.data = 0;
                return;
            }
            int min = head.data;
            myStackElement t = head;
            myStackElement a = head;
            while (t.next != null){
                if (t.data < min){
                    min = t.data;
                    a = t;
                }
                t = t.next;
            }
            if (tail.data < min){
                tail.data = 0;
                return;
            }
            a.data = 0;
        }

        public void clear(){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        public int chek(){
            return head.data;
        }

        public int pop(){
            int c = head.data;
            if (size != 1) {
                head = head.next;
                size--;
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
                System.out.println("Ваш стек пуст");
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
