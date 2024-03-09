import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;

        // Mientras no se elija la opcion 3
        while(n != 3) {
            System.out.println("Bienvenido");
            System.out.println("1) Login Administrador");
            System.out.println("2) Login Departamento");
            System.out.println("3) Salir");
            // Seleccion de opcion con control de errores
            try {
                n = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                n = -1;
            }
            switch(n) {
                case 1: {
                    // Login Administrador
                    System.out.println("Introduzca la contraseña");
                    String pass = in.nextLine();
                    if(pass.equals(Administrador.password)){
                        Administrador.MenuAdmin();
                    }else{
                        System.out.println("contraseña erronea");
                    }
                    break;
                }
                case 2: {
                    // Login Departamento
                    System.out.println("Introduzca la clave");
                    String clave = in.nextLine();
                    if(Administrador.compararDepartamento2(clave)){
                        Departamento.MenuDepartamento();
                    }else{
                        System.out.println("no existe ese departamento");
                    }
                    break;
                }
                case 3: {
                    // Salir sistema
                    System.out.println("Adios");
                    break;
                }
                default: {
                    // Opcion erronea
                    System.out.println("Opcion erronea");
                    break;
                }
            }
        }
    }
}
