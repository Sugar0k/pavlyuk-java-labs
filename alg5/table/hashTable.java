package table;

public class hashTable { //очищайте мусор :D

    public static class hash {
        private final int hashSize;
        private class box{
            String data;
            int key;
            boolean state,next,first; // состояние ячейки; указатель есть ли элемент дальше; указатель первый ли элемент
            int earlyI;
            byte temp;// 0 - ничего; 1 - первый;
        }

        private box arr[];

        private int takeKey(int key, boolean state) {// state показывает какую ячеку искать(если false то свобоную true наоборот)
            int index = key % hashSize;
            if (state == true) if (arr[index].state == true && arr[index].key == key){ //обработка первых элементов
                arr[index].temp = 1;
                return index;
            }
            else if (arr[index].state == false && arr[index].next == false){
                arr[index].temp = 1;
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
                }
                return index;
            }
        }

        public void kill(int key){
            int index = takeKey(key, true);
            clearTrash(key, index);
            arr[index].data = null;
            arr[index].state = false;
            arr[index].key =  0;
            if (arr[index].first == true) arr[index].first = false;
        }

        private void clearTrash(int key, int index){
            if (arr[index].next == true) return;
            int i = 1;
            final int c = 3, d = 2;
            while(((key % hashSize + (c * i + d * i * i)) % hashSize) != index){
                i++;
            }
            i--;
            for (; i > 0;  i--){
                int temp = (key % hashSize + (c * i + d * i * i)) % hashSize;
                arr[temp].next = false;
                if(i == 1){
                    if (arr[key % hashSize].state == false){
                        arr[key % hashSize].next = false;
                    }
                }
                if (arr[temp].state == true) return;
            }
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
            System.out.println(arr[index].state);
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
                if (arr[index].first ==false) arr[arr[index].earlyI].next = true;
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
