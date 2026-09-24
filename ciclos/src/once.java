import java.util.Scanner;

public class once {
    static void main(String[] args){
        Scanner dato=new Scanner(System.in);
        System.out.println("ingrese 10 numeros");
        int numero= dato.nextInt();
        int suma =0;
        for (int i = 0; i <9 ; i++) {
            dato.nextInt();                               // dato.nextInt(); con esto dentro del ciclo lo repito 10 veces el spring el imprimir
            suma=suma+i;                                  //ingreso 10 notas y con la variable promedio , saco el promedio

        }

        double promedio=suma/10;
        System.out.println("el promedio de las 10 notas es de " + promedio);

    }
}
