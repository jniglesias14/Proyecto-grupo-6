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



        Reserva r=new Reserva(2023,3,23,12,1);
        Reserva r2=new Reserva(2023,3,23,13,1);
        Sala s1=new Sala("juntas","J");
        s1.añadirReserva(r);
        s1.añadirReserva(r2);
        s1.ListarReservas();
        System.out.println("-----------");
        s1.cancelarReserva(r2);
        s1.ListarReservas();
        */

/*
        Reserva r1 = new Reserva(2024, 2, 2, 9, 2);
        Reserva r2 = new Reserva(2024, 2, 3, 9, 2);
        Reserva r3 = new Reserva(2024, 2, 4, 9, 2);
        Administrador a1 = new Administrador();
        a1.añadirSalas("juntas", "j");
        a1.añadirSalas("ventas", "v");
        a1.ListarSalas();
        */

        Administrador a1=new Administrador();
        a1.añadirDepartamento("ventas","V");
        a1.ListarDepartamentos();
        a1.eliminarDepartametno("V");
        System.out.println("---");
        a1.ListarDepartamentos();

    }
}