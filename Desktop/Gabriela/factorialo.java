public class factorialo{ 

public static void main (String[] args){
    int num = 8;
    int result = factorial(num);
    System.out.println("El factorial de "+ num + " es " + result);
}

private static int factorial(int num){
    int fact = 1;
    if (num != 0){
        for (int i = num; i>0;i--){
            fact=fact*i;
        }
    }
    return fact;
    }
}