public class Algoritmo2 {
    public static int incrementa(int a, int b) {
        int soma = 0;
        if (a == 0 && b == 0) {
            return soma;
        } else if (a > 0) {
            soma++;
            return soma + incrementa(a - 1, b);
        } else if (b > 0) {
            soma++;
            return soma + incrementa(a, b - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 2;

        System.out.println(incrementa(a, b));
    }
}
