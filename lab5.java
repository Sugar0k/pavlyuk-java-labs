public class lab5 {
    public static void main(String[] args){
        char c = 'a', d = 'b';
        char a =  (Character.isLetter(c) && Character.isLetter(d) && c > d)
                ? (char)(c - d) : (char)0470;
        System.out.println("c = " + c + ", d = " + d + ", a = " + a + " код a = " + (int)a);
    }
}
