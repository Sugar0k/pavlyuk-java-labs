import myPack.mylist.*;
import java.io.IOException;
import java.util.Scanner;




public class main {

    public static void face() throws IOException {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("addF arg -   Добавить число в начало списка\naddB arg - Добавить число в конец списка");
        System.out.println("add n arg - Добавить в n по счёту элемент списка элемен arg\ndel n - Удалить n элемент списка");
        System.out.println("ref - Создаёт новый список из элементов стоящих в обратном порядке");
        System.out.println("clear - очищает список");
        System.out.println("print - Вывести лист\nsize - Вывести количество элементов списка\nhelp - Вывести это меню\nexit - Выход");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }



    public static void main(String[] args) throws IOException {
        boolean exit = false;
        face();
        List list = new List();
        List testList = new List();

        while (exit == false) {


            Scanner jin = new Scanner(System.in);
            String words[] = jin.nextLine().split(" ");
            switch (words[0]){
                case "clear":
                    list.clear();
                    break;
                case "ref":
                    if (list.size() == 0) {
                        int[] a = new int[list.size()];
                        System.out.println("Ваш лист пуст");
                        break;
                    }
                    list.copy(testList);
                    testList.printList(1);
                    break;
                case "del":
                    list.delElByIndex(Integer.parseInt(words[1]));
                    list.printList(1);
                    break;
                case "5":
                    list.add(1, 1);
                    list.add(2, 2);
                    list.add(3, 3);
                    list.add(4, 4);
                    list.add(5, 5);
                    break;
                case "add":
                    if(words.length < 3){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    list.add(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                    list.printList(1);
                    break;
                case "print":
                    list.printList(1);
                    break;
                case "delByData":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    list.delEl(Integer.parseInt(words[1]));
                    list.printList(1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "addF":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    list.addFront(Integer.parseInt(words[1]));
                    list.printList(1);
                    break;
                case "addB":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    list.addBack(Integer.parseInt(words[1]));
                    list.printList(1);
                    break;
                case "help":
                    face();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Повторите ввод");
            }

        }
    }

}
