import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] clientes = {"Cliente A", "Cliente B", "Cliente C", "Cliente D", "Cliente E"};
        int[] compras = new int[clientes.length];
        double[] totalCompras = new double[clientes.length];

        // Pedir al usuario ingresar la cantidad de compras y el total gastado de cada cliente
        for (int i = 0; i < clientes.length; i++) {
            compras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de compras de " + clientes[i] + ":"));
            totalCompras[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el total gastado por " + clientes[i] + ":"));
        }

        // Calcular y aplicar los descuentos a los clientes que califican
        calcularDescuentos(clientes, compras, totalCompras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras, double[] totalCompras) {
        StringBuilder reporte = new StringBuilder("Reporte de Descuentos por Fidelización:\n");
        double descuento = 0.10;

        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                double totalConDescuento = totalCompras[i] - (totalCompras[i] * descuento);
                reporte.append(clientes[i]).append(": $").append(totalConDescuento).append(" (con 10% de descuento)\n");
            } else {
                reporte.append(clientes[i]).append(": $").append(totalCompras[i]).append("\n");
            }
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
