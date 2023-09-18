import java.util.Scanner;

public class sumaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el límite inferior: ");
        int limiteInferior = scanner.nextInt();
        
        System.out.print("Ingrese el límite superior: ");
        int limiteSuperior = scanner.nextInt();
        
        scanner.close();
        
        long resultado = calcularSumatoriaRecursiva(limiteInferior, limiteSuperior);
        
        System.out.println("La sumatoria de " + limiteInferior + " al cuadrado hasta " + limiteSuperior + " al cuadrado es: " + resultado);
    }
    
    public static long calcularSumatoriaRecursiva(int limiteInferior, int limiteSuperior) {
        if (limiteInferior > limiteSuperior) {
            return 0;
        } else {
            long resultadoParcial = limiteInferior * limiteInferior;
            long sumaRecursiva = calcularSumatoriaRecursiva(limiteInferior + 1, limiteSuperior);
            return resultadoParcial + sumaRecursiva;
        }
    }
}