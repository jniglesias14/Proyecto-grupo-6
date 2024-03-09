import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public  class Administrador {
    private static final String password = "ADMIN";

    protected static ArrayList<Departamento> departamentos= new ArrayList<Departamento>();
    protected static ArrayList<Sala> salas=new ArrayList<Sala>();

    public static Departamento getDepartamento(String codigo) throws Exception {
        for (Departamento d: departamentos) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        throw new Exception("Departamento no encontrado");
    }

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

    public static void login(String pass) throws Exception {
        // Si la contraseña no coincide levantamos excepcion
        if (!password.equals(pass)) {
            throw new Exception("Contraseña erronea");
        }

        Scanner in=new Scanner(System.in);
        int n = -1;
        while (n != 8) {
            System.out.println("Elija una opcion");
            System.out.println("1) Listar departamentos");
            System.out.println("2) Añadir departamento");
            System.out.println("3) Eliminar departamento");
            System.out.println("4) Listar salas");
            System.out.println("5) Añadir sala");
            System.out.println("6) Eliminar sala");
            System.out.println("7) Listar todas las reservas");
            System.out.println("8) Cerrar sesion");

            // Seleccion de opcion con control de errores
            try {
                n = Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                n = -1;
            }
            switch (n) {
                case 1: {
                    // Listar departamentos
                    Administrador.ListarDepartamentos();
                    break;
                }
                case 2: {
                    // Añadir departamento
                    System.out.println("Introduzca nombre de departamento");
                    String nombre=in.nextLine();
                    System.out.println("Introduzca codigo de departamento");
                    String codigo=in.nextLine();
                    Administrador.añadirDepartamento(nombre,codigo);
                    break;
                }
                case 3: {
                    // Eliminar departamento
                    System.out.println("Introduzca codigo de departamento");
                    String codigo=in.nextLine();
                    Administrador.eliminarDepartametno(codigo);
                    break;
                }
                case 4: {
                    // Listar Salas
                    Administrador.ListarSalas();
                    break;
                }
                case 5: {
                    // Añadir sala
                    System.out.println("Introduzca nombre de la sala");
                    String nombre=in.nextLine();
                    System.out.println("Introduzca codigo de la sala");
                    String codigo=in.nextLine();
                    Administrador.añadirSalas(nombre,codigo);
                    break;
                }
                case 6: {
                    // Eliminar sala
                    System.out.println("Introduzca codigo de la sala");
                    String codigo=in.nextLine();
                    Administrador.eliminarSala(codigo);
                    break;
                }
                case 7: {
                    // Listar reservas
                    // Administrador.ListarSalas();
                    break;
                }
                case 8: {
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





