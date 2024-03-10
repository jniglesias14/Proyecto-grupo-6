import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public  class Administrador {
    private static final String password = "ADMIN";

    protected static ArrayList<Departamento> departamentos= new ArrayList<Departamento>();
    protected static ArrayList<Sala> salas=new ArrayList<Sala>();

    public static Departamento recuperarDepartamentoPorCodigo(String codigo) throws Exception {
        for (Departamento d: departamentos) {
            if (d.getCodigo().equals(codigo)) {
                return d;
            }
        }
        throw new Exception("Departamento no encontrado");
    }

    public static Sala recuperarSalaPorCodigo(String codigo) throws Exception {
        for (Sala s: salas) {
            if (s.getCodigo().equals(codigo)) {
                return s;
            }
        }
        throw new Exception("Sala no encontrada");
    }

    public static boolean existeDepartamento(String nombre, String codigo) {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            if (elemento.getNombre().equals(nombre) || elemento.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public static void añadirDepartamento(String nombre, String codigo) throws Exception {
        if (existeDepartamento(nombre, codigo)) {
            throw new Exception("Ya existe un departamento con uno de los valores introducidos");
        }
        Departamento d = new Departamento(nombre, codigo);
        departamentos.add(d);
    }

    public static void eliminarDepartamento(String codigo) throws Exception {
        Departamento d = recuperarDepartamentoPorCodigo(codigo);
        departamentos.remove(d);
        for (Sala s: salas) {
            s.eliminarReservasDepartamento(codigo);
        }
    }

    public static void listarDepartamentos() {
        Iterator<Departamento> iterador = departamentos.iterator();
        while (iterador.hasNext()) {
            Departamento elemento = iterador.next();
            System.out.println(elemento.toString());
        }
    }

    public static boolean existeSala(String nombre, String codigo) {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            if (elemento.getNombre().equals(nombre) || elemento.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public static void añadirSala(String nombre, String codigo) throws Exception {
        if (existeSala(nombre, codigo)) {
            throw new Exception("Ya existe una sala con uno de los valores introducidos");
        }
        Sala s = new Sala(nombre, codigo);
        salas.add(s);
    }

    public static void eliminarSala(String codigo) throws Exception {
        Sala s = recuperarSalaPorCodigo(codigo);
        salas.remove(s);
    }

    public static void listarSalas() {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            System.out.println(elemento.toString());
        }
    }

    public static void listarAllReservas() {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            elemento.listarReservas();
        }
    }

    public static void listarDepReservas(String codigoDepartamento) {
        Iterator<Sala> iterador = salas.iterator();
        while (iterador.hasNext()) {
            Sala elemento = iterador.next();
            elemento.listarDepReservas(codigoDepartamento);
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
                    Administrador.listarDepartamentos();
                    break;
                }
                case 2: {
                    // Añadir departamento
                    System.out.println("Introduzca nombre de departamento");
                    String nombre=in.nextLine();
                    System.out.println("Introduzca codigo de departamento");
                    String codigo=in.nextLine();
                    try {
                        Administrador.añadirDepartamento(nombre, codigo);
                    } catch(Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    // Eliminar departamento
                    System.out.println("Introduzca codigo de departamento");
                    String codigo=in.nextLine();
                    try {
                        Administrador.eliminarDepartamento(codigo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    // Listar Salas
                    Administrador.listarSalas();
                    break;
                }
                case 5: {
                    // Añadir sala
                    System.out.println("Introduzca nombre de la sala");
                    String nombre=in.nextLine();
                    System.out.println("Introduzca codigo de la sala");
                    String codigo=in.nextLine();
                    try {
                        Administrador.añadirSala(nombre,codigo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 6: {
                    // Eliminar sala
                    System.out.println("Introduzca codigo de la sala");
                    String codigo=in.nextLine();
                    try {
                        Administrador.eliminarSala(codigo);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 7: {
                    // Listar reservas
                    Administrador.listarAllReservas();
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





