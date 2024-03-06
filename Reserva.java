import java.time.Duration;
import java.time.LocalDateTime;
    public class Reserva {
        protected LocalDateTime fecha;
        protected Duration duracion;

        public Reserva(int año,int mes,int dia,int horas,int duracionhoras){

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

        public void mostrar(){
            System.out.println("Fecha"+this.fecha+"Duracion"+this.duracion);
        }
    }


