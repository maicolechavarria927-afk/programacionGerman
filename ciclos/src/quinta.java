import java.util.Scanner;

public class quinta {
static void main(String[] args){
    Scanner dato = new Scanner(System.in);
    System.out.println("ingrese m");
    int m = dato.nextInt();

    System.out.println("ingrese n");
    int n = dato.nextInt();
    int suma=0;
    for (int i = m; i < n; i++) {              //se pide m y n, con la variable "suma " se suma todo los numero de n a m
        suma=suma+i;
        System.out.println(suma);
    }

}
}
