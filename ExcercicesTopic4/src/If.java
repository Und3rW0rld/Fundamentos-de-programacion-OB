import java.util.Scanner;
public class If {
    /*
    * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIf = sc.nextInt();
        if(numeroIf == 0){
            System.out.println("El numero es igual a cero");
        }else if(numeroIf <0 ){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es positivo");
        }

    }
}
