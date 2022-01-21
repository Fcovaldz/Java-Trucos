/*
 * @autor Francisco Bañuelos.
 */
package trucos.solid;

public class InterfazVisual {

    public void dibujarBoton() {
        Rectangulo borde = new Rectangulo(25, 25, 200, 200);
        borde.dibujar();
    }
}
