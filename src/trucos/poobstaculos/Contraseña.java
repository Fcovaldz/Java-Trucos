/*
@autor Francisco Bañuelos.
*/
package trucos.poobstaculos;

public class Contraseña {
    private String contraseña;

    public Contraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public boolean esContraseñaValida(String contraseña) {
        return false;
    }
}
