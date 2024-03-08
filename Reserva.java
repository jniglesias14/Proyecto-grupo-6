import java.time.Duration;
import java.time.LocalDateTime;
public class Reserva {
    protected LocalDateTime fecha;
    protected Duration duracion;
    protected String clave;

    public Reserva(int año,int mes,int dia,int horas,int duracionhoras, String clave){
        this.clave=clave;
        LocalDateTime l1=LocalDateTime.of(año,mes,dia,horas,0,0);
        Duration d=Duration.ofHours(duracionhoras);

        if(l1.getHour()<9||l1.getHour()>14){
            System.out.println("la fecha es erronea");
        }
        else{
            this.fecha=l1;
        }

        if(this.fecha.plusHours(duracionhoras).getHour()<=14){
            this.duracion=d;
        }
        else{
            System.out.println("intervalo erroneo");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Reserva r) {
            return this.fecha ==  r.fecha && this.duracion==r.duracion;
        }
        else{
            return false;
        }
    }


    public String toString() {
        return "Fecha " + this.fecha + " Duracion " +this.duracion + " Departamento "+ this.clave;
    }

}