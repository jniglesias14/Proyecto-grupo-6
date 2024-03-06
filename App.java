import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String contraseña;
        String opcion;
        int n;
        boolean seguir=true;

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
                System.out.println("dime la opcion");
                opcion=in.nextLine();

                Departamento.MenuDepartamento(opcion);
            }else{
                seguir=false;
            }
        }

        Reserva r=new Reserva(2023,3,23,13,1);
        r.mostrar();

    }
}
