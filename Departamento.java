import java.util.ArrayList;

public class Departamento {
    // Array estatico con los departamentos de la aplicacion
    private static ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();

    // Metodo publico y estatico para listar todos los departametos
    public static void listarDepartamentos(){
        for (Departamento d: listaDepartamentos) {
            System.out.println(d.toString());
        }
    }

    protected String nombre;
    protected String clave;

    public Departamento(String n,String c){
        this.nombre=n;
        this.clave=c;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre " + this.nombre + " - Clave " + this.clave;
    }
}

