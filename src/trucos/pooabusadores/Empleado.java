/*
@autor Francisco Bañuelos.
*/
package trucos.pooabusadores;

import trucos.pooabusadores.TipoDeEmpleado;

public abstract class Empleado {

    private TipoDeEmpleado tipoDeEmpleado;
    protected float salario;
    protected float bonus;

    public Empleado(TipoDeEmpleado tipoDeEmpleado, float salario, float bonus) {
        this.tipoDeEmpleado = tipoDeEmpleado;
        this.salario = salario;
        this.bonus = bonus;
    }

    public abstract double obtenerSalarioCompleto();
    public abstract double obtenerCoeficienteHorasExtra();
}
