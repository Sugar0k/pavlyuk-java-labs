public class lab6_1 {
    private static double g(double x){
        if (x <= 0) return (3 * Math.pow(x, 2.0)) / (1 + Math.pow(x, 2.0));
        else return Math.pow((1.0 + 2.0 * x / (1.0 + Math.pow(x, 2.0))), 1.0/2);
    }

    private static double z(double x){
        if (x < 0) return Math.pow(1.0 + (Math.pow(x,2.0) / (1 + Math.pow(x, 2.0))), 1.0/2);
        else return (2 * Math.cos(x)) / Math.sqrt(1 + Math.pow(Math.abs(2 * Math.sin(3 * x)),1. / 3.0));
    }
    public static void main(String[] args){
        double y = g(10) - z(10);
        System.out.printf("%s %s %s", y, g(10), z(10));
    }
}
