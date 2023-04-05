import java.util.Scanner;

public class Calculadora{

    public static void main(String[] args){

        double a, n, res = 1; //a= base e n= expoente


        Scanner input = new Scanner(System.in);



        System.out.println("Informe a base: ");
        a = input.nextDouble();

        System.out.println("Informe o expoente: ");
        n = input.nextDouble();
 
        for (double i = n; i >= 1; i-- ) {
            res = res * a;
            System.out.println("Res:" +res);

        }

        System.out.println("Resultado:"+res);





    }


}
    
    
    