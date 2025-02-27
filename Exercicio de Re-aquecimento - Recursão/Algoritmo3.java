public class Algoritmo3 {
    public static double calculo(double n){
        if(n == 1) {
            return 1;
        }
        return calculo(n- 1) + 1/n;
    }

    public static void main(String[] args) {
        System.out.println(calculo(5));
    }
}
