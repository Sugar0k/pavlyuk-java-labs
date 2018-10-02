public class lab3 {

    public static void main(String[] args){
        int a = 9, b = 2;
        int c =-(a / b + a % b) * 5;
        System.out.printf("a = %s(2) = %x(16) = %o(8) = %d(10)\nb = %s(2) = %x(16) = %o(8) = %d(10)\na + b = %s(2) = %x(16) = %o(8) = %d(10)\n",Integer.toBinaryString(a), a, a, a, Integer.toBinaryString(b), b, b, b, Integer.toBinaryString(c), c, c, c);
    }
}
