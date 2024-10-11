import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[] ventas = new double[30];

        // Pedir al usuario las ventas diarias
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa las ventas del día " + (i + 1) + ":"));
        }

        // Calcular los ingresos mensuales totales
        double ingresosMensuales = calcularIngresosMensuales(ventas);

        // Mostrar el total de ingresos mensuales
        JOptionPane.showMessageDialog(null, "El total de ingresos mensuales es: $" + ingresosMensuales);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }
}

