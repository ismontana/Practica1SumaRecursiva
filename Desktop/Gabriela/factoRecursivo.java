public class factoRecursivo {
    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 8;
        int resultado;

        System.out.println("Programa que calcula el factorial de un número");
        resultado = factorial(numero);
        System.out.println("El factorial de " +numero +" es: " +resultado);
    }
}