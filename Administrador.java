import java.util.ArrayList;
import java.util.Iterator;

public  class Administrador {

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















/*

    public boolean compararreservas(Reserva r) {
        Iterator<Sala> iterator=this.salas.iterator();
        while(iterator.hasNext()){
            Sala elementosala=iterator.next();
            Iterator<Reserva> iterador=elementosala.listaReservas.iterator();
            while(iterador.hasNext()){
                Reserva elementoreserva=iterador.next();
                if(elementoreserva.getFecha().equals(r.getFecha()) ||
                        r.getFecha().isAfter(elementoreserva.getFecha()) && r.getFecha().isBefore(elementoreserva.getFechafin()) ||
                        r.getFechafin().isAfter(elementoreserva.getFecha()) && r.getFechafin().isBefore(elementoreserva.getFechafin())){
                    return false;
                }

            }

        }
        return true;


    }

    public void añadirReservaSalas(Reserva r,Sala s){

        if(compararreservas(r)){
            Iterator<Sala> iterator=this.salas.iterator();
            while(iterator.hasNext()){
                Sala elementosala=iterator.next();
                if(elementosala.equals(s)){
                    elementosala.añadirReserva(r);
                }
                else{
                    System.out.println("no se puede meter");
                }

        }
        else{
            System.out.println("no se puede meter");
        }

    }

    public void cancelarReservaSalas(Reserva r,Sala s){
        if(listaReservas.contains(r)){
            this.listaReservas.remove(r);
        }
        else{
            System.out.println("esa reserva no existe");
        }
    }


*/


    public static void MenuAdmin(String opcion) {
        int n = Integer.parseInt(opcion);
        boolean lectura = true;
        while (lectura) {
            if (n == 1) {

            } else if (n == 2) {

            } else if (n == 3) {

            } else if (n == 4) {

            } else if (n == 5) {

            } else if (n == 6) {

            } else if (n == 7) {

            } else if (n == 8) {
                lectura = false;
            } else {

            }
        }
    }



}



