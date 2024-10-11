import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Pedir al usuario el número de facturas
        int numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de facturas:"));
        double[] facturas = new double[numFacturas];

        // Pedir al usuario ingresar el monto de cada factura
        for (int i = 0; i < facturas.length; i++) {
            facturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la factura " + (i + 1) + ":"));
        }

        // Calcular y mostrar el impuesto de cada factura
        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        final double IMPUESTO = 0.21;
        StringBuilder reporte = new StringBuilder("Reporte de impuestos:\n");

        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * IMPUESTO;
            double totalConImpuesto = facturas[i] + impuesto;
            reporte.append("Factura ").append(i + 1).append(": $").append(facturas[i])
                    .append(" + Impuesto ($").append(impuesto)
                    .append(") = $").append(totalConImpuesto).append("\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
