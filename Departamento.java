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

    public static void MenuDepartamento(String opcion){
        Scanner in=new Scanner(System.in);
        boolean lectura=true;
        String clave;
        System.out.println("dime la clave departamento");
        clave=in.nextLine();
        Administrador a1=new Administrador();
        a1.compararDepartamento2(clave);
        int n=Integer.parseInt(opcion);
        while(lectura){
            if(n==1){

            }else if(n==2){

            }else if(n==3){

            }else if(n==4) {
                lectura=false;
            }
            else{

            }
        }
    }

}


