public class Algoritmo3 {
    public static double calculo(int n){
        if(n == 1) {
            return 1;
        }
        return calculo(n- 1) + 1.0/n;
    }

    public static void main(String[] args) {
        System.out.println(calculo(2));
    }
}
