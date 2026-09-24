import java.util.Scanner;

public class decima {
    static void main(String[] args){
        Scanner dato =new Scanner(System.in);
        System.out.println("ingrese su numero");
        int n=dato.nextInt();
        long factorial=1;
        if (n<0){                                 //si el numero que ingrese el usuario es menor que 0 o negativo te aparece un error
            System.out.println("no esta definido para numeros negativos");
        }
        for (int i =1;i<n;i++){                   //va de 1 hasta n o el numero que ingrese le usuario de ahi aplica el procedimiento con la variable "factorial" que te da la factorial de 1 hasta n

             factorial *=i;

            System.out.println("su numero factorial es " + factorial);


        }
    }
}
