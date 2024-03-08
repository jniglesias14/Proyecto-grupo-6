import java.util.Iterator;

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
        boolean lectura=true;
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


