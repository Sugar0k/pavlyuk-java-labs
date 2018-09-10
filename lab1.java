package lab1;

import java.util.Date;

/**
 * @author Pavlyuk Alexsandr
 */

public class lab1 {

    public static void main(String[] args) {
        String firstName = "Александр";
        String middleName = "Петрович";
        String lastName = "Павлюк";
        String teacherFirstName = "Елена";
        String teacherMiddleName = "Сергеевна";
        String teacherLastName = "Владимирова";
        String groupCode = "ИВТ/б-12о";

        Date date = new Date();

        int variant = 16;
        int productWeight = 19;
        int tareWeight= 3;
        int totalWeight = productWeight + tareWeight;

        String fullName = fullName(lastName, firstName, middleName);
        String fullTeacherName = fullName(teacherLastName, teacherFirstName, teacherMiddleName);

        System.out.println("Прогрумму выполнил: \n" + fullName);
        System.out.println("Дата: " + date);
        System.out.println("Вариант: " + variant);
        System.out.println("Шифр группы: " + groupCode);
        System.out.println("Вес товара: " + productWeight);
        System.out.println("Вес тары: " + tareWeight);
        System.out.println("Общий вес: " + totalWeight);
        System.out.println("Проверил: \n" + fullTeacherName);
    }

    public static String fullName(String a, String b, String c) {
        return a + " " + b + " " + c;
    }
}