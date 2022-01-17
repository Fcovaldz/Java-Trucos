/*
@autor Francisco Bañuelos.
*/
package trucos.bloaters;

import trucos.bloaters.Direccion;

public class Empleado {
    private final int id;
    private final String nombre;
    private final String apellidos;
    private final Direccion direccion;
    private int telefono;

    public Empleado(int id, String nombre, String apellidos, Direccion direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad(), direccion.getCodigoPostal());
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Direccion getDireccion() {
        return new Direccion(direccion.getCalle(), direccion.getNumero(), direccion.getCiudad(), direccion.getCodigoPostal());
    }
}
