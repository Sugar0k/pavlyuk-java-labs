package myPack;

public class mylist {

    public  static class List {
        private ListElement head;
        private ListElement tail;
        private int size = 0;

        public void clear(){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        public void copy(List list){
            int[] a = new int[size];
            if (size == 0) return;
            ListElement t = head;
            int i = size;
            while (t.next != null) {
                i--;
                a[i] = t.data;
                t = t.next;
            }
            i--;
            a[i] = t.data;

            for (int j : a){
                list.addBack(j);
            }
        }

        public int getEl(int i){
            if ( i >= size){
                return tail.data;
            }
            ListElement t = head;
            for (int j = 1; j < i; j++) t = t.next;
            return t.data;
        }

        public void addFront(int data)
        {
            ListElement a = new ListElement();
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

        public void add(int i, int data){
            ListElement t = head;
            i--;
            if ( i == 0 ){
                addFront(data);
                return;
            }

            if ( i >= size -1){
                addBack(data);
                return;
            }

            for (int j = 0; j < i -1 ; j++) t = t.next;
            ListElement a = new ListElement();
            a.data = data;
            ListElement b;
            b = t.next;
            t.next = a;
            a.next = b;
            size++;

        }

        public void addBack(int data) {
            ListElement a = new ListElement();
            a.data = data;
            size++;
            if (tail == null)
            {
                head = a;
                tail = a;
            } else {
                tail.next = a;
                tail = a;
            }
        }

        public void printList()
        {
            if (size == 0){
                System.out.println("Ваш список пуст");
                return;
            }
            ListElement t = head;
            while (t != null)
            {
                System.out.print(t.data + " ");
                t = t.next;
            }
        }
        public void printList(int n)
        {
            if (size == 0){
                System.out.println("Ваш список пуст");
                return;
            }
            if ( n > size){
                System.out.println("Такого элемента нет");
                return;
            }
            ListElement t = head;
            while (t != null)
            {
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }

        public void delElByIndex(int i){
            if(head == null) return;
            if (head == tail && i == 1) {
                head = null;
                tail = null;
                size = 0;
                return;
            }
            if (i == 1) {
                head = head.next;
                size--;
                return;
            }
            if ( i > size && i == 228){
                System.out.println("Такого элемента неть ^-^");
                return;
            }
            if ( i > size){
                System.out.println("Такого элемента нет");
                return;
            }

            ListElement t = head;

            for (int j = 1; j < i-1; j++) {
                if (tail == t.next)
                {
                    tail = t;
                    size--;
                    return;
                }
                t = t.next;
            }
            t .next= t.next.next;
            size--;
            return;
        }

        public void delEl(int data)
        {
            if(head == null) return;


            if (head == tail) {
                head = null;
                tail = null;
                size = 0;
                return;
            }

            if (head.data == data) {
                head = head.next;
                size--;
                return;
            }

            ListElement t = head;
            while (t.next != null) {
                if (t.next.data == data) {
                    if(tail == t.next)
                    {
                        tail = t;
                    }
                    t.next = t.next.next;
                    size--;
                    return;
                }
                t = t.next;
            }
        }
        public int size(){
            return size;
        }
        public  static class ListElement {
            ListElement next;
            int data;
        }
    }


}
