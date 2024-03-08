import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public  class Administrador {
    Scanner in=new Scanner(System.in);
    protected static final String password = "ADMIN";

    protected static ArrayList departamentos= new ArrayList<>();
    protected static ArrayList salas=new ArrayList<>();



    public static boolean compararDepartamento(String n, String c) {

        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if (elemento.getNombre().equals(n) || elemento.getCodigo().equals(c)) {
                return false;
            }

        }
        return true;
    }
    public static boolean compararDepartamento2( String c) {

        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if ( elemento.getCodigo().equals(c)) {
                return true;
            }

        }
        return false;
    }

    public static void añadirDepartamento(String n, String c) {

        if (compararDepartamento(n, c)) {
            Departamento d = new Departamento(n, c);
            departamentos.add(d);
        } else {
            System.out.println("no se puede meter");
        }

    }

    public static void eliminarDepartametno(String clave) {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if (elemento.getCodigo().equals(clave)) {
                departamentos.remove(elemento);
                break;
            }

        }


    }

    public static void ListarDepartamentos() {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            System.out.println(elemento.toString());
        }
    }

    public static boolean compararSalas(String n, String c) {

        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            if (elemento.getNombre().equals(n) || elemento.getCodigo().equals(c)) {
                return false;
            }

        }
        return true;
    }

    public static void añadirSalas(String n, String c) {

        if (compararSalas(n, c)) {
            Sala s = new Sala(n, c);
            salas.add(s);
        } else {
            System.out.println("no se puede meter");
        }

    }

    public static void eliminarSala(String clave) {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            if (elemento.getCodigo().equals(clave)) {
                salas.remove(elemento);
                break;
            }

        }


    }














    public static void ListarSalas() {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            System.out.println(elemento.toString());
            elemento.ListarReservas();
        }
    }
    public static void añadirReservaSalas(Reserva r,String codigo) {
        Iterator<Sala> iterator = salas.iterator();
        while (iterator.hasNext()) {
            Sala elementosala = iterator.next();
            if (elementosala.getCodigo().equals(codigo)) {
                elementosala.añadirReserva(r);
            }
        }
    }

    public static void cancelarReservaSalas(Reserva r, String codigo) {

        Iterator<Sala> iterator = salas.iterator();
        while (iterator.hasNext()) {
            Sala elementosala = iterator.next();
            if (elementosala.getCodigo().equals(codigo)) {
                elementosala.cancelarReserva(r);
            }

        }
    }





    public static void MenuAdmin() {
        Scanner in=new Scanner(System.in);
        String opcion;
        int n;
        Administrador a1=new Administrador();
        boolean lectura = true;
        while (lectura) {
            System.out.println("dime la opcion \n1)Listar departamentos \n2)Añadir departamento \n3)Eliminar departamento \n4)Listar salas \n5)Añadir sala \n6)Eliminar sala \n7)Listar todas las reservas \n8)Cerrar sesion");
            opcion= in.nextLine();
            n=Integer.parseInt(opcion);
            if (n == 1) {
                Administrador.ListarDepartamentos();
            } else if (n == 2) {
                String nombre,codigo;
                System.out.println("dime el nombre del departamento");
                nombre=in.nextLine();
                System.out.println("dime el codigo del departamento");
                codigo=in.nextLine();
                Administrador.añadirDepartamento(nombre,codigo);
            } else if (n == 3) {
                String clave;
                System.out.println("dime la clave del departamento");
                clave=in.nextLine();
                Administrador.eliminarDepartametno(clave);
            } else if (n == 4) {
                Administrador.ListarSalas();
            } else if (n == 5) {
                String nombre,codigo;
                System.out.println("dime el nombre de la sala");
                nombre=in.nextLine();
                System.out.println("dime el codigo de la sala");
                codigo=in.nextLine();
                Administrador.añadirSalas(nombre,codigo);
            } else if (n == 6) {
                String clave;
                System.out.println("dime la clave");
                clave=in.nextLine();
                Administrador.eliminarSala(clave);
            } else if (n == 7) {
                Administrador.ListarSalas();
            } else if (n == 8) {
                lectura = false;
            } else {
                System.out.println("numero erroneo");

            }

        }


        }


    }





