/*
@autor Francisco Bañuelos.
*/
package trucos.bloaters;

public class Bloaters {

    public void enviarCarta(Empleado empleado, int dia, int mes, int hora, int minutos) {
        imprimirDireccion(empleado);
    }
    public void invitarAReunion(Empleado empleado, int dia, int mes, int hora, int minutos){

    }
    public void imprimirDireccion(Empleado empleado){
        imprimir(empleado.getNombre());
        imprimir(empleado.getApellidos());
        imprimir(String.valueOf(empleado.getDireccion().getNumero()));
        imprimir(empleado.getDireccion().getCiudad());
        imprimir(String.valueOf(empleado.getDireccion().getCodigoPostal()));
    }
    public void imprimir(String campo){

    }
    public void llamar(int telefono){
        //Comprobar
    }
}
