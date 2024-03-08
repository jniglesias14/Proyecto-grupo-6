import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public  class Administrador {
    Scanner in=new Scanner(System.in);
    protected static final String password = "1234A";

    protected static ArrayList departamentos;
    protected static ArrayList salas;

    public Administrador() {
        departamentos = new ArrayList<>();
        salas = new ArrayList<>();

    }


    public  boolean compararDepartamento(String n, String c) {

        Iterator<Departamento> iterador = this.departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if (elemento.getNombre().equals(n) || elemento.getCodigo().equals(c)) {
                return false;
            }

        }
        return true;
    }
    public  boolean compararDepartamento2( String c) {

        Iterator<Departamento> iterador = this.departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if ( elemento.getCodigo().equals(c)) {
                return false;
            }

        }
        return true;
    }

    public  void añadirDepartamento(String n, String c) {

        if (compararDepartamento(n, c)) {
            Departamento d = new Departamento(n, c);
            this.departamentos.add(d);
        } else {
            System.out.println("no se puede meter");
        }

    }

    public  void eliminarDepartametno(String clave) {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if (elemento.getCodigo().equals(clave)) {
                departamentos.remove(elemento);
                break;
            }

        }


    }

    public  void ListarDepartamentos() {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            System.out.println(elemento.toString());
        }
    }

    public  boolean compararSalas(String n, String c) {

        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            if (elemento.getNombre().equals(n) || elemento.getCodigo().equals(c)) {
                return false;
            }

        }
        return true;
    }

    public  void añadirSalas(String n, String c) {

        if (compararSalas(n, c)) {
            Sala s = new Sala(n, c);
            salas.add(s);
        } else {
            System.out.println("no se puede meter");
        }

    }

    public  void eliminarSala(String clave) {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            if (elemento.getCodigo().equals(clave)) {
                salas.remove(elemento);
                break;
            }

        }


    }














    public  void ListarSalas() {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            System.out.println(elemento.toString());
            elemento.ListarReservas();
        }
    }
    public void añadirReservaSalas(Reserva r,String codigo) {
        Iterator<Sala> iterator = this.salas.iterator();
        while (iterator.hasNext()) {
            Sala elementosala = iterator.next();
            if (elementosala.getCodigo().equals(codigo)) {
                elementosala.añadirReserva(r);
            }
        }
    }

    public void cancelarReservaSalas(Reserva r, String codigo) {

        Iterator<Sala> iterator = this.salas.iterator();
        while (iterator.hasNext()) {
            Sala elementosala = iterator.next();
            if (elementosala.getCodigo().equals(codigo)) {
                elementosala.cancelarReserva(r);
            }

        }
    }





    public static void MenuAdmin(String opcion) {
        Scanner in=new Scanner(System.in);
        int n = Integer.parseInt(opcion);
        Administrador a1=new Administrador();
        boolean lectura = true;
        while (lectura) {
            if (n == 1) {
                a1.ListarDepartamentos();
            } else if (n == 2) {

                String nombre,codigo;
                System.out.println("dime el nombre del departamento");
                nombre=in.nextLine();
                System.out.println("dime el codigo del departamento");
                codigo=in.nextLine();
                a1.añadirDepartamento(nombre,codigo);
            } else if (n == 3) {
                String clave;
                System.out.println("dime la clave del departamento");
                clave=in.nextLine();
                a1.eliminarDepartametno(clave);
            } else if (n == 4) {
                a1.ListarSalas();
            } else if (n == 5) {
                String nombre,codigo;
                System.out.println("dime el nombre del departamento");
                nombre=in.nextLine();
                System.out.println("dime el codigo del departamento");
                codigo=in.nextLine();
                a1.añadirSalas(nombre,codigo);
            } else if (n == 6) {
                String clave;
                System.out.println("dime la clave");
                clave=in.nextLine();
                a1.eliminarSala(clave);
            } else if (n == 7) {
                a1.ListarSalas();
            } else if (n == 8) {
                lectura = false;
            } else {
                System.out.println("numero erroneo");

            }
        }


        }


    }





