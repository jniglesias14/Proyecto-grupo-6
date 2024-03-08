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
/*
        while(seguir){
            System.out.println("dime la opcion \n1)menu administrador \n2)menu departamento");
            opcion=in.nextLine();
            n=Integer.parseInt(opcion);
            if(n==1){
                System.out.println("dime la contraseña");
                contraseña=in.nextLine();
                if(contraseña.equals(Administrador.password)){
                    System.out.println("dime la opcion");
                    opcion= in.nextLine();
                    Administrador.MenuAdmin(opcion);
                }
                else{
                    System.out.println("contraseña erronea");
                }
            }else if(n==2){
                System.out.println("dime la clave");
                opcion=in.nextLine();
                Administrador a=new Administrador();
                if(a.comprobar(opcion)){
                    System.out.println("dime la clave");
                    opcion=in.nextLine();
                    Departamento.MenuDepartamento(opcion);
                }
                else{
                    System.out.println("no existe el codigo departamento");
                }



            }else{
                seguir=false;
            }
        }

*/


        Administrador a1=new Administrador();
        Reserva r1 = new Reserva(2024, 2, 2, 9, 2);
        Reserva r2 = new Reserva(2024, 2, 3, 9, 2);
        Reserva r3 = new Reserva(2024, 2, 4, 9, 2);
        a1.añadirSalas("juntas","J");
        a1.añadirSalas("cine","C");
        a1.añadirSalas("biblioteca","B");
        a1.añadirReservaSalas(r1,"J");
        a1.añadirReservaSalas(r2,"C");
        a1.añadirReservaSalas(r3,"B");
        a1.cancelarReservaSalas(r1,"J");
        a1.ListarSalas();

    }
}