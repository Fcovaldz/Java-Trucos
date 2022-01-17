/*
@autor Francisco Bañuelos.
*/
package trucos.acopladores;

import java.util.Objects;

public class Perro {
    String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza);
    }
}
