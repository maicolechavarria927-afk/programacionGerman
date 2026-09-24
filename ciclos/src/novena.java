import java.util.Scanner;

public class novena {
    static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese la cantidad de estudiantes");
        int estu= dato.nextInt();
        int suma =0;
        for (int i = 0; i <estu ; i++) {                  //veces que tiene que pedir la nota de los estudiantes
            System.out.println("ingrese la nota 1 del estudiantes");
            int nota1= dato.nextInt();

            System.out.println("ingrese la nota 2 del estudiantes");                 //pido las 3 notas
            int nota2= dato.nextInt();

            System.out.println("ingrese la nota 3 del estudiantes");
            int nota3= dato.nextInt();
            suma=suma+nota1+nota2+nota3;


        }


        double promedio=suma/3;
        System.out.println(promedio);                       //muestra el promedio
    }
}
