public class lab6_2 {
    public static  void main(String[] args){
        char k = 'А';
        switch (k) {
            case 'А':
            case 'Б':
            case 'В':
            case 'Г':
            case 'Д':
                System.out.println("Номер варианта: 1");
                break;
            case 'Е':
            case 'Ё':
            case 'Ж':
            case 'З':
            case 'И':
            case 'К':
                System.out.println("Номер варианта: 2");
                break;
            case 'Л':
            case 'М':
            case 'Н':
            case 'О':
            case 'П':
                System.out.println("Номер варианта: 3");
                break;
            case 'Р':
            case 'С':
            case 'Т':
            case 'У':
            case 'Ф':
                System.out.println("Номер варианта: 4");
                break;
            case 'Х':
            case 'Ц':
            case 'Ч':
            case 'Ш':
            case 'Щ':
                System.out.println("Номер варианта: 5");
                break;
            case 'Э':
            case 'Ю':
            case 'Я':
                System.out.println("Номер варианта: 6");
                break;
                default:
                    System.out.println("Неправидьно задана фамилия студента");
                    break;

        }
    }
}
