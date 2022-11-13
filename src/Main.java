public class Main {
    public static void main(String[] args) {
        for(var n = 0; n < 7; n++) {
            System.out.println("Fatorial Recurisvo p/ n = "+ n +": " + String.valueOf(fatorialRecursivo(n)));
            System.out.println("Fatorial Iterativo p/ n = "+ n +": " +String.valueOf(fatorialIterativo(n)));
        }
    }

    /**
     * Método utilizado para implementar o algoritmo de fatorial por meio de recursão
     * @param int n
     * @return
     */
    public static int fatorialRecursivo(int n){
        if (n == 0) return 1;
        return n * fatorialRecursivo(n - 1);
    }

    /**
     * Método utilizado para implementar o algoritmo de fatorial por meio de iteração
     * @param int n
     * @return
     */
    public static int fatorialIterativo(int n){
        int fat = 1;
        for (n = n; n > 0; n--)
            fat = fat * n;
        return fat;
    }
}