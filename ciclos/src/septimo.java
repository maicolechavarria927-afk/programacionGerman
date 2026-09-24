import java.util.Scanner;

public class septimo {
    static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el los 5 numero");
        int numeros= dato.nextInt();

        int suma=0;

        for (int i = 1; i <5 ; i++) {      //para que el solo haga los numero que yo quiero es le quito el "= "   o inicio desde 0
            dato.nextInt();
            suma=suma+i;

        }
        double promedio=suma/5;
        System.out.println(promedio);         //muestro el promedio de las 5 notas que mando el usuario para despues dividirlas el acumulador o suma por 5 que son las  notas
    }
}