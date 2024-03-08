import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String contraseña;
        String opcion;
        int n;
        boolean seguir = true;


        while(seguir){
            System.out.println("dime la opcion \n1)menu administrador \n2)menu departamento \n3)salir");
            opcion=in.nextLine();
            n=Integer.parseInt(opcion);
            if(n==1){
                System.out.println("dime la contraseña");
                contraseña=in.nextLine();
                if(contraseña.equals(Administrador.password)){
                    Administrador.MenuAdmin();
                }
                else{
                    System.out.println("contraseña erronea");
                }
            }else if(n==2){
                System.out.println("dime la clave");
                opcion=in.nextLine();
                if(Administrador.compararDepartamento2(opcion)){
                    Departamento.MenuDepartamento();
                }else{
                    System.out.println("no existe ese departamento");
                }


            }else if(n==3){
                System.out.println("adios");
                seguir=false;
            }
            else{
                System.out.println("error");
            }
        }




/*
        Reserva r1 = new Reserva(2024, 2, 2, 9, 2);
        Reserva r2 = new Reserva(2024, 2, 3, 9, 2);
        Reserva r3 = new Reserva(2024, 2, 4, 9, 2);
        Administrador.añadirSalas("juntas","J");
        Administrador.añadirSalas("cine","C");
        Administrador.añadirSalas("biblioteca","B");
        Administrador.añadirReservaSalas(r1,"J");
        Administrador.añadirReservaSalas(r2,"C");
        Administrador.añadirReservaSalas(r3,"B");
        Administrador.ListarSalas();
        System.out.println("----");
        Administrador.cancelarReservaSalas(r1,"J");
        Administrador.ListarSalas();
        System.out.println("-----");
        Administrador.cancelarReservaSalas(r2,"C");
        Administrador.ListarSalas();

*/

    }
}
