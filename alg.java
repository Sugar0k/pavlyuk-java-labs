import java.util.ArrayList;
import java.util.List;

public class lab {
    public static void main(String[] args){

        List<Integer> list = new ArrayList();

        for (int i = 0; i < 6; i++){
            list.add(i+1);
        }

        list.add(0,  0);
        list.add(3 , 228);
        list.add(123);

        System.out.println("Изначальный список: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();

        list.remove(0);
        list.remove(2);
        list.remove(list.size()-1);

        list.remove(list.indexOf(2));


        for (int i = list.size() - 1; i >= 0; i--){
            list.add(list.get(i));
        }

        System.out.println("Преобразованный список: ");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }


    }
}
