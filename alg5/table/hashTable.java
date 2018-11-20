package table;

public class hashTable { //without hope


    public static class hash {
        private final int hashSize = 10;
        private class box{
            String data;
            int key;
            boolean state;
        }

        private box arr[] = new box[hashSize];

        public void kill(int key){
            int temp = key % hashSize;
            int i = 0;
            final int c = 3, d = 2;
            while (arr[temp].state){
                if (arr[temp].key == key){
                    arr[temp].data = null;
                    arr[temp].state = false;
                    arr[temp].key =  0;
                }
                i++;
                temp = (key % hashSize + (c * i + d * i * i)) % hashSize;
            }
            arr[temp].data = null;
            arr[temp].state = false;
            arr[temp].key =  0;
        }

        public boolean empty(int key){
            int temp = key % hashSize;
            if (arr[temp].state == false) return true;
            else {
                int i = 0;
                final int c = 3, d = 2;
                while (arr[temp].state){
                    if (arr[temp].key == key) return false;
                    i++;
                    temp = (key % hashSize + (c * i + d * i * i)) % hashSize;
                }
                return true;
            }
        }

        public String search(int key){
            int temp = key % hashSize;
            int i = 0;
            final int c = 3, d = 2;
            while (arr[temp].state){
                if (arr[temp].key == key) return arr[temp].data;
                i++;
                temp = (key % hashSize + (c * i + d * i * i)) % hashSize;
            }
            return arr[temp].data;
        }

        public void show(){
            for (int i = 0; i < hashSize; i++){
                if (arr[i].state == false) System.out.println(i + " clear" );
                else System.out.println(i + " " + arr[i].key + " " + arr[i].data + " " + arr[i].state);
            }
        }

        private int takeKey(int key){
            int temp = key % hashSize;
            if (arr[temp].state == false) return temp;
            else {
                int i = 0;
                final int c = 3, d = 2;
                while (arr[temp].state){
                    i++;
                    temp = (key % hashSize + (c * i + d * i * i)) % hashSize;
                }
                return temp;
            }

        }

        public void setCell(int a, String data){
            int index = takeKey(a);
            arr[index].state = true;
            arr[index].data = data;
            arr[index].key = a;
        }

        public void getState(int a){
            int b = takeKey(a);
            System.out.println(arr[b].state);
        }

        public hash(){
            for (int i = 0; i < arr.length; i++){
                arr[i] = new box();
            }
        }

    }

}
