interface Empleado {
    double calcularSalario();
}

interface Bonificable {
    double calcularBonificacion();
}

interface Imponible {
    double calcularImpuesto();
}

class EmpleadoFull implements Empleado, Bonificable, Imponible {
    private double salario;

    public EmpleadoFull(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public double calcularBonificacion() {
        return salario * 0.1;
    }

    public double calcularImpuesto() {
        return salario * 0.05;
    }
}

public class MainEmpleados {
    public static void main(String[] args) {
        EmpleadoFull e = new EmpleadoFull(1000);

        double total = e.calcularSalario()
                      + e.calcularBonificacion()
                      - e.calcularImpuesto();

        System.out.println("Total a cobrar: $" + total);
    }
}