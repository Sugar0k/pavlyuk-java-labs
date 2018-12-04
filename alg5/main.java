import java.util.Scanner;
import table.hashTable.*;
public class main {


    public static void face(){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("set key inf - Добавить inf в ячейку с ключём key\ndel key - Очистить ячейку с ключём key");
        System.out.println("empty key - Находит ячейку по ключу\nhelp - Вывести это меню\nexit - Выход\nprint - Вывод таблицы");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }

    public  static void main(String[] args){
        Scanner jin = new Scanner(System.in);
        hash sh;
        System.out.println("Задайте размер хеш таблицы, но не меньше 20");
        while (true){
            int size = jin.nextInt();
            if (size < 20 ){
                System.out.println("Повторите ввод");
                continue;
            }
            sh = new hash(size);
            sh.print();
            break;
        }
        face();
        boolean exit = false;
        while (exit == false) {

            jin = new Scanner(System.in);
            String words[] = jin.nextLine().split(" ");
            switch (words[0]){
                case "del":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    if (sh.empty(Integer.parseInt(words[1])) == false){
                        System.out.println("Элемент удалён");
                        sh.del(Integer.parseInt(words[1]));
                    }
                    else System.out.println("Элемента с таким ключём нет");
                    sh.print();
                    break;
                case "empty":
                    if(words.length < 2){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    if (sh.empty(Integer.parseInt(words[1])) == false) System.out.println("Элемент с таким ключём уже есть ");
                    else System.out.println("Элемента с таким ключём нет ");
                    sh.print();
                    break;
                case "set":
                    if(words.length < 3){
                        System.out.println("Повторите ввод");
                        break;
                    }
                    if (sh.empty(Integer.parseInt(words[1])) == false) System.out.println("Элемент с таким ключём уже есть " + sh.search(Integer.parseInt(words[1])));
                    else sh.setCell(Integer.parseInt(words[1]), words[2]);
                    sh.print();
                    break;
                case "print":
                    sh.print();
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
