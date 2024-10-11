
import javax.swing.JOptionPane;

    public class Ejercicio3 {
        public static void main(String[] args) {
            String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"};
            double[] facturasPendientes = new double[clientes.length];

            // Pedir al usuario ingresar el monto de las facturas pendientes para cada cliente
            for (int i = 0; i < clientes.length; i++) {
                facturasPendientes[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el monto de la factura pendiente para " + clientes[i] + ":"));
            }

            // Generar el reporte de clientes con facturas mayores a $500
            enviarFacturas(clientes, facturasPendientes);
        }

        public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
            StringBuilder reporte = new StringBuilder("Clientes con facturas mayores a $500:\n");

            for (int i = 0; i < clientes.length; i++) {
                if (facturasPendientes[i] > 500) {
                    reporte.append(clientes[i]).append(": $").append(facturasPendientes[i]).append("\n");
                }
            }

            JOptionPane.showMessageDialog(null, reporte.toString());
        }
    }


