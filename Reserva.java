import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private LocalDateTime fecha;
    private LocalDateTime fechaFin;
    private Duration duracion;
    private String codigoDepartamento;

    public Reserva(int año,int mes,int dia,int horas,int duracionhoras, String codigoDepartamento) throws Exception{
        LocalDateTime l1 = LocalDateTime.of(año,mes,dia,horas,0,0);
        Duration d = Duration.ofHours(duracionhoras);

        if(l1.getHour() < 9 || l1.getHour() > 14 || l1.plusHours(duracionhoras).getHour() > 14){
            throw new Exception("Rango de horas no valido");
        }

        this.fecha = l1;
        this.fechaFin = l1.plusHours(duracionhoras);
        this.duracion = d;
        this.codigoDepartamento = codigoDepartamento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Reserva r) {
            return this.fecha ==  r.fecha && this.duracion==r.duracion && this.codigoDepartamento.equals(r.codigoDepartamento);
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss a");
        return "Reserva: " + this.fecha.format(d1) + " - " + this.fechaFin.format(d1) + " - Departamento: " + this.codigoDepartamento;
    }
}
