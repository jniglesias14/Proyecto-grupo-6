import java.util.ArrayList;
import java.util.Iterator;

public  class Administrador {

    protected static final String password="1234A";
    protected ArrayList departamentos;




    public  boolean comprobar(String clave){
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento departamentoActual = iterador.next();
            if (departamentoActual.getCodigo().equals(clave)) {
                System.out.println("El código está repetido");
                return true;
            }
        }
        return false;


    }
    public static void MenuAdmin(String opcion){
        int n=Integer.parseInt(opcion);
        boolean lectura=true;
        while(lectura){
            if(n==1){

            }else if(n==2){

            }else if(n==3){

            }else if(n==4){

            }else if(n==5){

            }else if(n==6){

            }else if(n==7){

            }else if(n==8){
                lectura=false;
            }else{

            }
        }
    }

}
