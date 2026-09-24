import java.util.Scanner;

public class cuarto {
    static void main(String[] args){
        Scanner dato =new Scanner(System.in);
        System.out.println("ingrese hasta que numero");
        int numero= dato.nextInt();
        int suma =0;

        for (int i = 0; i < numero ; i++) {  //i va de 0 hasta el numero que le indiquemos y cosn la VARIABLE SUMA  suma de el numero i hasta n(numero que le indicamos)
            suma=suma+i;
            System.out.println(suma);

    }

    }
}
