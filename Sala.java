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

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean compararreservas(Reserva r) {

        Iterator<Reserva> iterador=this.listaReservas.iterator();
        while(iterador.hasNext()){
            Reserva elemento=iterador.next();
            if(elemento.getFecha().equals(r.getFecha()) ||
                    r.getFecha().isAfter(elemento.getFecha()) && r.getFecha().isBefore(elemento.getFechafin()) ||
                    r.getFechafin().isAfter(elemento.getFecha()) && r.getFechafin().isBefore(elemento.getFechafin())){
                return false;
            }

        }
        return true;
    }

    public void añadirReserva(Reserva r){
        if(compararreservas(r)){
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


    @Override
    public String toString() {
        return "nombre: "+this.nombre+" codigo: "+this.codigo;
    }

    public void ListarReservas(){
        toString();
        Iterator<Reserva> iterador=this.listaReservas.iterator();
        while(iterador.hasNext()){
            Reserva elemento=iterador.next();
            System.out.println(elemento.toString());
        }
    }

}


