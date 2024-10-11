import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numCompras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de compras:"));
        double[] compras = new double[numCompras];

        // Pedir al usuario ingresar el monto de cada compra
        for (int i = 0; i < compras.length; i++) {
            compras[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la compra " + (i + 1) + ":"));
        }

        // Aplicar descuento a las compras que superen los $500
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        final double DESCUENTO = 0.15;
        StringBuilder reporte = new StringBuilder("Reporte de compras con descuento:\n");

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double totalConDescuento = compras[i] - (compras[i] * DESCUENTO);
                reporte.append("Compra ").append(i + 1).append(": $").append(compras[i])
                        .append(" - Descuento (15%) = $").append(totalConDescuento).append("\n");
            } else {
                reporte.append("Compra ").append(i + 1).append(": $").append(compras[i]).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
