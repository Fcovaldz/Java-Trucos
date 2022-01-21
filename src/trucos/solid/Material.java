/*
 * @autor Francisco Bañuelos.
 */
package trucos.solid;

public class Material {

    private Double precioMetroCuadrado;

    public Material(Double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public Double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
}
