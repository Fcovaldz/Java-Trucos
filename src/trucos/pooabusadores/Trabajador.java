/*
@autor Francisco Bañuelos.
*/
package trucos.pooabusadores;

public class Trabajador extends Empleado{
    public Trabajador(TipoDeEmpleado tipoDeEmpleado, float salario, float bonus) {
        super(tipoDeEmpleado, salario, bonus);
    }

    @Override
    public double obtenerSalarioCompleto() {
        return salario;
    }

    @Override
    public double obtenerCoeficienteHorasExtra() {
        return 1.5;
    }
}
