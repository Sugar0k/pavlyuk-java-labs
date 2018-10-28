import java.io.IOException;
import java.util.Scanner;
import myPack.myStack.*;

public class main {

    public static void face() throws IOException {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("push arg -   Добавить число в начало стек\npop - Взять элемент стека");
        System.out.println("clear - очищает стек\nchek - Посмотреть элемент стека\nwork - меняет нименьший элемент стека на 0");
        System.out.println("empty - Проверка на пустоту, если не пувыс выведет стек\nhelp - Вывести это меню\nexit - Выход");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }



    public static void main(String[] args) throws IOException {
        boolean exit = false;
        face();
        Stack stack = new Stack();

        while (exit == false) {

            Scanner jin = new Scanner(System.in);
            String words[] = jin.nextLine().split(" ");
            switch (words[0]){
                case "work":
                    if (stack.empty() == false) stack.temp();
                    stack.printStack();
                    break;
                case "empty":
                    if (stack.empty() == true) System.out.println("Ваш стек пуст");
                    else  stack.printStack();
                    break;
                case "pop":
                    if (stack.empty() == false) System.out.println(stack.pop());
                    stack.printStack();
                    break;
                case "chek":
                    if (stack.empty() == false) System.out.println(stack.chek());
                    stack.printStack();
                    break;
                case "clear":
                    stack.clear();
                    System.out.println("Ваш стек пуст");
                    break;
                case "5":
                    stack.push(1);
                    stack.push(2);
                    stack.push(3);
                    stack.push(4);
                    stack.push(5);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "push":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    stack.push(Integer.parseInt(words[1]));
                    stack.printStack();
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
