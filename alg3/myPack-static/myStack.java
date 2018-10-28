package myPack;

public class myStack {

    public  static class Stack {
        private int[] arr = new int[10000];
        private int size = 0;

        public boolean empty(){
            if (size == 0) return true;
            return false;
        }

        public void temp(){ // Заменяет первый минимальный элемент на 0
            if (size == 1){
                arr[0] = 0;
                return;
            }

            int min = arr[size - 1], index = size -1;

            for (int i = size -1; i >= 0; i--){
                if (arr[i] < min){
                    index = i;
                    min = arr[i];
                }
            }
            arr[index] = 0;

        }

        public void clear(){
            arr = new int[10000];
            size = 0;
        }

        public int chek(){
            return arr[size - 1];
        }

        public int pop(){
            int c = arr[size - 1];
            if (size != 1) {
                arr[size - 1] = 0;
                size--;
            } else {
                clear();
            }
            return c;
        }

        public void push(int data)
        {
            arr[size] = data;
            size++;
        }

        public void printStack()
        {
            if (size == 0){
                System.out.println("Ваш стек пуст");
                return;
            }
            for (int i = size - 1; i >= 0; i--) System.out.print(arr[i] + " ");
            System.out.println();
        }

        public int size(){
            return size;
        }

    }


}
