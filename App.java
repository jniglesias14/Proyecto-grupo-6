import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        int opcion;
        boolean seguir=true;
        while(seguir){
            System.out.println("dime la opcion \n1)menu administrador \n2)menu departamento");
            opcion=in.nextInt();
            if(opcion==1){
                System.out.println("dime la opcion");
                opcion=in.nextInt();
                Administrador.MenuAdmin(opcion);
            }else if(opcion==2){
                System.out.println("dime la opcion");
                opcion=in.nextInt();
                Departamento.MenuDepartamento(opcion);
            }else{
                seguir=false;
            }
        }
*/
        Reserva r=new Reserva(2023,3,23,14,2);

    }
}
