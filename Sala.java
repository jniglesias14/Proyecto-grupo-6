import java.util.ArrayList;

public class Sala {
    protected String nombre;
    protected String clave;
    private static ArrayList<Sala> listaSalas = new ArrayList<Sala>();

    // Metodo publico y estatico para listar todas las salas
    public static void listarSalas(){
        for (Sala s: listaSalas) {
            System.out.println(s.toString());
        }
    }


    // Metodo publico y estatico para listar todas las reservas
    public static void listarReservas(){
        for (Sala s: listaSalas) {
            System.out.println(s.toString());
            for(Reserva r: s.listaReservas) {
                System.out.println(r.toString());
            }
        }
    }

    protected ArrayList<Reserva> listaReservas;
    public Sala(String n,String c){
        this.nombre=n;
        this.clave=c;
        this.listaReservas=new ArrayList<Reserva>();
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
        for(Reserva r: this.listaReservas){

        }
    }

    @Override
    public String toString() {
        return "Nombre " + this.nombre + " - Clave " + this.clave;
    }
}



