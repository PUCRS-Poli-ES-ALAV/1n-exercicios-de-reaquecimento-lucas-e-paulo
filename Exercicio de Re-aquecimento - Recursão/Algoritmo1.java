public class Algoritmo1 {
    public static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }
        
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int result = multiply(a, b);
        System.out.println(a + " * " + b + " = " + result);
    }
}