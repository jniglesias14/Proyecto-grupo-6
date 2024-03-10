import java.util.Scanner;
public class Departamento {
    private String nombre;
    private String codigo;

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
        return "Nombre Departamento: " + this.nombre + " - Codigo Departamento: " + this.codigo;
    }

    public static void login(String codigoDepartamento) throws Exception {
        // Recuperamos el departamento por codigo
        Administrador.recuperarDepartamentoPorCodigo(codigoDepartamento);

        Scanner in=new Scanner(System.in);
        int n = -1;
        while (n != 4) {
            System.out.println("Elija una opcion");
            System.out.println("1) Añadir reserva");
            System.out.println("2) Cancelar reserva");
            System.out.println("3) Listar todas las reservas");
            System.out.println("4) Cerrar sesion");

            // Seleccion de opcion con control de errores
            try {
                n = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                n = -1;
            }
            switch (n) {
                case 1: {
                    // Añadir reserva
                    System.out.println("Introduzca año, mes, dia, hora y duracion");
                    int year = in.nextInt();
                    int month = in.nextInt();
                    int day = in.nextInt();
                    int hour = in.nextInt();
                    int duracion = in.nextInt();
                    in.nextLine();
                    Reserva r=new Reserva(year, month, day, hour, duracion, codigoDepartamento);
                    System.out.println("Introduzca el codigo de la sala");
                    String codigo=in.nextLine();
                    Administrador.añadirReservaSalas(r, codigo);
                    break;
                }
                case 2: {
                    // Cancelar reserva
                    System.out.println("Introduzca año, mes, dia, hora y duracion");
                    int year = in.nextInt();
                    int month = in.nextInt();
                    int day = in.nextInt();
                    int hour = in.nextInt();
                    int duracion = in.nextInt();
                    Reserva r=new Reserva(year, month, day, hour, duracion, codigoDepartamento);
                    in.nextLine();
                    System.out.println("Introduzca el codigo de la sala");
                    String codigo=in.nextLine();
                    Administrador.cancelarReservaSalas(r,codigo);
                    break;
                }
                case 3: {
                    // Listar reservas
                    Administrador.listarDepReservas(codigoDepartamento);
                    break;
                }
                case 4: {
                    // Cerrar sesion
                    System.out.println("Cerrando sesion");
                    break;
                }
                default: {
                    // Opcion erronea
                    System.out.println("Opcion erronea");
                    break;
                }
            }
        }
    }
}
