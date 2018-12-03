package table;

public class hashTable { //очищайте мусор :D

    public static class hash {
        private final int hashSize;
        private class box{
            String data;
            int key;
            boolean state,next,first;
            int earlyI;
            byte temp;// 0 - ничего; 1 - первый; 2 - перед ним есть;
        }

        private box arr[];

        private int takeKey(int key, boolean state) {// state показывает какую ячеку искать(если false то свобоную true наоборот)
            int index = key % hashSize;
            if (state == true) if (arr[index].state == true && arr[index].key == key){
                System.out.println("yvgbhnjo");
                arr[index].temp = 1;
                return index;
            }
            else if (arr[index].state == false && arr[index].next == false){
                arr[index].temp = 1;
                System.out.println("nope");
                return index;
            }
            int i = 0;
            final int c = 3, d = 2;
            if (state) {
                while (arr[index].next) {
                    if (arr[index].key == key) {
                        return index;
                    }
                    i++;
                    index = (key % hashSize + (c * i + d * i * i)) % hashSize;
                }
                if (arr[index].key == key) {
                    return index;
                }
                i++;
                index = (key % hashSize + (c * i + d * i * i)) % hashSize;
                return index;
            }
            else {
                while (arr[index].state != false) {
                    i++;
                    index = (key % hashSize + (c * i + d * i * i)) % hashSize;
                }
                if (i == 1) arr[index].earlyI = key % hashSize;
                else {
                    i--;
                    arr[index].earlyI = (key % hashSize + (c * i + d * i * i)) % hashSize;
                 //   System.out.println("asdasdas");
                }
                return index;
            }
        }

        public void kill(int key){
            int index = takeKey(key, true);
            arr[index].data = null;
            arr[index].state = false;
            arr[index].key =  0;
           // System.out.println(index);
        }

        public boolean empty(int key){
            int index = takeKey(key, true);
            return !arr[index].state;
        }

        public String search(int key){
            int index = takeKey(key, true);
            return arr[index].data;

        }

        public void getState(int key){
            int index = takeKey(key,true);
         //   System.out.println(arr[index].state);
        }

        public void show(){
            for (int i = 0; i < hashSize; i++){
                if (arr[i].state == false) System.out.println(i + " " + arr[i].key + " " + arr[i].data + " " + arr[i].state + " " + arr[i].next + " " + arr[i].earlyI + " " + arr[i].first + " clear");
                else System.out.println(i + " " + arr[i].key + " " + arr[i].data + " " + arr[i].state + " " + arr[i].next + " " + arr[i].earlyI + " " + arr[i].first);
            }
        }

        public void setCell(int a, String data){
            int index = takeKey(a,false);
            if (arr[index].temp == 1) arr[index].first = true;
            if (arr[index].earlyI != -1){
                if (arr[index].first == false) arr[arr[index].earlyI].next = true;
                arr[index].earlyI = -1;
            }
            arr[index].state = true;
            arr[index].data = data;
            arr[index].key = a;
            arr[index].temp = 0;
        }

        public hash(int size){
            hashSize = size;
            arr = new box[hashSize];
            for (int i = 0; i < arr.length; i++){
                arr[i] = new box();
                arr[i].earlyI = -1;
            }

        }

    }

}
