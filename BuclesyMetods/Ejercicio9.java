import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de productos:"));
        double[] preciosOriginales = new double[numProductos];

        // Pedir al usuario ingresar el precio original de cada producto
        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosOriginales[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio original del producto " + (i + 1) + ":"));
        }

        // Calcular y mostrar el precio final con descuento de cada producto
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);
        StringBuilder reporte = new StringBuilder("Reporte de precios finales con descuento:\n");

        for (int i = 0; i < preciosFinales.length; i++) {
            reporte.append("Producto ").append(i + 1).append(": $").append(preciosOriginales[i])
                    .append(" - Descuento (10%) = $").append(preciosFinales[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        final double DESCUENTO = 0.10;
        double[] preciosFinales = new double[preciosOriginales.length];

        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] - (preciosOriginales[i] * DESCUENTO);
        }
        return preciosFinales;
    }
}
