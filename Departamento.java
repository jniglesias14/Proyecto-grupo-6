import java.util.Iterator;
import java.util.Scanner;
public class Departamento {
    protected String nombre;
    protected String codigo;

    public Departamento(String n,String c){
        this.nombre=n;
        this.codigo=c;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre: "+this.nombre+" codigo: "+this.codigo;
    }

    public static void MenuDepartamento(){
        Scanner in=new Scanner(System.in);
        boolean lectura=true;
        int n;
        String opcion;
        while(lectura){
            System.out.println("dime la opcion \n1)Añadir reserva \n2)Cancelar reserva \n3)Listar todas las reservas \n4)Cerrar sesion ");
            opcion= in.nextLine();
            n=Integer.parseInt(opcion);
            if(n==1){
                int y,m;
                int d,h,i;
                String codigo;
                System.out.println("dime el año,mes,dia,hora,duracion");
                y=in.nextInt();
                m=in.nextInt();
                d=in.nextInt();
                h=in.nextInt();
                i= in.nextInt();
                Reserva r=new Reserva(y,m,d,h,i);
                in.nextLine();
                System.out.println("dime el codigo de la sala");
                codigo=in.nextLine();
                Administrador.añadirReservaSalas(r,codigo);
            }else if(n==2){
                int y,m;
                int d,h,i;
                String codigo;
                System.out.println("dime el año,mes,dia,hora,duracion");
                y=in.nextInt();
                m=in.nextInt();
                d=in.nextInt();
                h=in.nextInt();
                i= in.nextInt();
                Reserva r=new Reserva(y,m,d,h,i);
                in.nextLine();
                System.out.println("dime el codigo de la sala");
                codigo=in.nextLine();
                Administrador.cancelarReservaSalas(r,codigo);
            }else if(n==3){
                Administrador.ListarSalas();
            }else if(n==4) {
                lectura=false;
            }
            else{
                System.out.println("opcion erronea");
            }
        }
    }

}


