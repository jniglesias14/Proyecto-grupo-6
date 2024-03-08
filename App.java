import java.util.Scanner;

public class App {
    protected static final String password="1234A";

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Opcion menu principal
        int opcion = 0;
        System.out.println("Bienvenido al sistema");

        // Mientras no valga 3
        while(opcion != 3) {
            System.out.println("1. Login Admin");
            System.out.println("2. Login Departamento");
            System.out.println("3. Salir");

            opcion = in.nextInt();

            // Switch menu principal
            switch (opcion) {
                case 1: {
                    // Admin
                    in.nextLine();
                    System.out.println("Introduzca clave de sistema");
                    String pass = in.nextLine();
                    // Compara la clave, si es igual entra
                    if (pass.equalsIgnoreCase(password)) {
                        // Menu Admin
                        int opcion2 = 0;
                        // Mientras no sea 8
                        while (opcion2 != 8) {
                            System.out.println("1. Listar departamentos");
                            System.out.println("2. Añadir departamentos");
                            System.out.println("3. Eliminar departamentos");
                            System.out.println("4. Listar salas");
                            System.out.println("5. Añadir sala");
                            System.out.println("6. Eliminar sala");
                            System.out.println("7. Listar reservas");
                            System.out.println("8. Cerrar sesion");
                            opcion2 = in.nextInt();

                            // Switch admin
                            switch (opcion2) {
                                case 1: {
                                    // Listar departamentos
                                    Departamento.listarDepartamentos();
                                    break;
                                }
                                case 2: {
                                    // Añadir departamento
                                    in.nextLine();
                                    System.out.println("Nombre departamento");
                                    String nombre = in.nextLine();
                                    System.out.println("Clave departamento");
                                    String clave = in.nextLine();
                                    break;
                                }
                                case 3: {
                                    // Eliminar departamento
                                    in.nextLine();
                                    System.out.println("Clave departamento");
                                    String clave = in.nextLine();
                                    break;
                                }
                                case 4: {
                                    // Listar Salas
                                    Sala.listarSalas();
                                    break;
                                }
                                case 5: {
                                    // Añadir Sala
                                    in.nextLine();
                                    System.out.println("Nombre sala");
                                    String nombre2 = in.nextLine();
                                    System.out.println("Clave sala");
                                    String clave3 = in.nextLine();
                                    break;
                                }
                                case 6: {
                                    // Eliminar Sala
                                    in.nextLine();
                                    System.out.println("Clave sala");
                                    String clave = in.nextLine();
                                    break;
                                }
                                case 7: {
                                    // Mostrar reservas
                                    Sala.listarReservas();
                                    break;
                                }
                                case 8: {
                                    // Cerrar Sesion
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion erronea");
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Clave admin erronea");
                    }
                    break;
                }
                case 2: {
                    // Departamento
                    in.nextLine();
                    System.out.println("Introduzca Clave de Departamento");
                    String claveDepartamento = in.nextLine();
                    // Buscamos por clave
                    /*
                    if (encuentra?) {
                        // Menu departamento
                        int opcion2 = 0;
                        // Mientras no valga cuatro
                        while (opcion2 != 4) {
                            System.out.println("1. Añadir reserva");
                            System.out.println("2. Cancelar reserva");
                            System.out.println("3. Listar todas las reservas");
                            System.out.println("4. Cerrar sesion");
                            opcion2 = in.nextInt();

                            // Switch menu departamento
                            switch (opcion2){
                                case 1: {
                                    // Añadir reserva
                                    break;
                                }
                                case 2: {
                                    // Cancelar reserva
                                    break;
                                }
                                case 3: {
                                    // Listar todas las reservas
                                    break;
                                }
                                case 4: {
                                    // Cerrar Sesion
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion erronea");
                                    break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Clave departamento errornea");
                    }
                    */
                    break;
                }
                case 3: {
                    System.out.println("Adios");
                    break;
                }
                default: {
                    System.out.println("Opcion erronea");
                    break;
                }
            }
        }
    }
}

