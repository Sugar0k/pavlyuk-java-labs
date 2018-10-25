import java.io.IOException;
import java.util.Scanner;
import myPack.myStack.*;

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
        Stack list = new Stack();
        Stack testList = new Stack();

        while (exit == false) {

            Scanner jin = new Scanner(System.in);
            String words[] = jin.nextLine().split(" ");
            switch (words[0]){
                case "get":
                    System.out.println(list.get());
                    break;
                case "chek":
                    System.out.println(list.chek());
                    break;
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
                    testList.printStack();
                    break;
                case "5":
                    list.push(1);
                    list.push(2);
                    list.push(3);
                    list.push(4);
                    list.push(5);
                    break;
                case "print":
                    list.printStack();
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "push":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    list.push(Integer.parseInt(words[1]));
                    list.printStack();
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
