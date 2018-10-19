public class lab3 {
    public static void main(String[] args){
        int a = 2024, b = 341;
        int c =-(a / b + a % b) * 5;
        System.out.printf("-(a / b + a %% b) * 5 = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        System.out.printf("a = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(a), a, a, a);
        System.out.printf("b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(b), b, b, b);
        c = -a;
        System.out.printf("-a = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        c = a + b;
        System.out.printf("a + b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        c = a - b;
        System.out.printf("a - b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        c = a * b;
        System.out.printf("a * b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        c = a / b;
        System.out.printf("a / b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        c = a % b;
        System.out.printf("a %% b = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(c), c, c, c);
        a++;
        System.out.printf("a++ = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(a), a, a, a);
        b--;
        System.out.printf("b-- = %s(2) = %x(16) = %o(8) = %d(10)\n", Integer.toBinaryString(b), b, b, b);
    }
}
