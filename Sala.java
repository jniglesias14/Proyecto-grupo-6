import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sala {
    private String nombre;
    private String codigo;
    private ArrayList<Reserva> listaReservas;

    public Sala(String n,String c){
        this.nombre=n;
        this.codigo=c;
        this.listaReservas=new ArrayList<Reserva>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean compararReservas(Reserva r) {
        Iterator<Reserva> iterador=this.listaReservas.iterator();
        while(iterador.hasNext()){
            Reserva elemento=iterador.next();
            if(elemento.getFecha().equals(r.getFecha()) ||
            (r.getFecha().isAfter(elemento.getFecha()) && r.getFecha().isBefore(elemento.getFechaFin())) ||
            (r.getFechaFin().isAfter(elemento.getFecha()) && r.getFechaFin().isBefore(elemento.getFechaFin()))) {
                return false;
            }

        }
        return true;
    }

    public void añadirReserva(Reserva r){
        if(compararReservas(r)){
            this.listaReservas.add(r);
        }
        else{
            System.out.println("Horario no disponible");
        }

    }

    public void cancelarReserva(Reserva r){
        if(this.listaReservas.contains(r)){
            this.listaReservas.remove(r);
        }
        else{
            System.out.println("Reserva no encontrada");
        }
    }

    @Override
    public String toString() {
        return "Nombre Sala: " + this.nombre + " - Codigo Sala: " + this.codigo;
    }

    public void listarReservas(){
        Iterator<Reserva> iterador = this.listaReservas.iterator();
        while(iterador.hasNext()){
            Reserva elemento=iterador.next();
            System.out.println(this.toString() + " - " + elemento.toString());
        }
    }

    public void listarDepReservas(String codigoDepartamento){
        Iterator<Reserva> iterador = this.listaReservas.iterator();
        while(iterador.hasNext()){
            Reserva elemento=iterador.next();
            if (elemento.getCodigoDepartamento().equals(codigoDepartamento)) {
                System.out.println(this.toString() + " - " + elemento.toString());
            }
        }
    }

    public void eliminarReservasDepartamento(String codigoDepartamento) {
        ArrayList<Reserva> eliminar = new ArrayList<Reserva>();
        for (Reserva r: listaReservas) {
            if (r.getCodigoDepartamento().equals(codigoDepartamento)) {
                eliminar.add(r);
            }
        }
        for (Reserva r: eliminar) {
            listaReservas.remove(r);
        }
    }
}


