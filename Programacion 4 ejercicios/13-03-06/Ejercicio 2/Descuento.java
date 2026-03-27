interface Descuento {
    double aplicarDescuento(double precio);
}

class DescuentoFijo implements Descuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.9; // 10%
    }
}

class DescuentoPorCantidad implements Descuento {
    public double aplicarDescuento(double precio) {
        return precio * 0.8; // 20%
    }
}

class Carrito {
    private double total;

    public Carrito(double total) {
        this.total = total;
    }

    public void aplicar(Descuento d) {
        total = d.aplicarDescuento(total);
    }

    public void mostrarTotal() {
        System.out.println("Total: $" + total);
    }
}

public class MainDescuentos {
    public static void main(String[] args) {
        Carrito c = new Carrito(1000);

        c.aplicar(new DescuentoFijo());
        c.mostrarTotal();

        c.aplicar(new DescuentoPorCantidad());
        c.mostrarTotal();
    }
}