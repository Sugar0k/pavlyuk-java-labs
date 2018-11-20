import java.util.Scanner;
import table.hashTable.*;
public class main {


    public static void face(){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("push arg -   Добавить число в начало стек\npop - Взять элемент стека");
        System.out.println("clear - очищает стек\nchek - Посмотреть элемент стека\nwork - меняет нименьший элемент стека на 0");
        System.out.println("empty - Проверка на пустоту, если не пувыс выведет стек\nhelp - Вывести это меню\nexit - Выход");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }

    public  static void main(String[] args){

        hash sh = new hash();

        boolean exit = false;
        Scanner jin = new Scanner(System.in);
        while (exit == false) {

            jin = new Scanner(System.in);
            String words[] = jin.nextLine().split(" ");
            switch (words[0]){
                case "kill":
                    if (sh.empty(Integer.parseInt(words[1])) == false){
                        System.out.println("Элемент удалён");
                        sh.kill(Integer.parseInt(words[1]));
                    }
                    else System.out.println("Элемента с таким ключём нет");
                    break;
                case "empty":
                    if (sh.empty(Integer.parseInt(words[1])) == false) System.out.println("Элемент с таким ключём уже есть " + sh.search(Integer.parseInt(words[1])));
                    else System.out.println("Элемента с таким ключём нет ");
                    break;
                case "set":
                    sh.setCell(Integer.parseInt(words[1]), words[2]);
                    break;
                case "show":
                    sh.show();
                    break;
                case "1":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    sh.getState(Integer.parseInt(words[1]));
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
