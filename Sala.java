import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sala {
    protected String nombre;
    protected String codigo;
    protected ArrayList listaReservas;
    public Sala(String n,String c){
        this.nombre=n;
        this.codigo=c;
        this.listaReservas=new ArrayList<>();

    }

    public void añadirReserva(Reserva r){
        if(!this.listaReservas.contains(r)){
            this.listaReservas.add(r);
        }
        else{
            System.out.println("no se puede meter");
        }

    }

    public void cancelarReserva(Reserva r){
        if(this.listaReservas.contains(r)){
            this.listaReservas.remove(r);
        }
        else{
            System.out.println("esa reserva no existe");
        }
    }

    /*
        public boolean comprobar(Reserva r){
            Iterator i=this.listaReservas.iterator();

            while(i.hasNext()){

                if(r.equals(i)){
                    System.out.println("esta repetido");
                    return false;
                }
            }
            return true;
        }
    */
    public void ListarReservas(){
        for(Object o:this.listaReservas){
            System.out.println(o);
        }
    }

}



