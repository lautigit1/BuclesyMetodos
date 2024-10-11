import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] productos = {"Televisor", "Laptop", "Smartphone", "Tablet", "Cámara"};
        int[] stocks = new int[productos.length];

        // Pedir al usuario ingresar el stock de cada producto
        for (int i = 0; i < productos.length; i++) {
            stocks[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el stock de " + productos[i] + ":"));
        }

        // Generar el reporte de productos con menos de 5 unidades
        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        StringBuilder reporte = new StringBuilder("Productos con menos de 5 unidades:\n");

        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                reporte.append(productos[i]).append(": ").append(stocks[i]).append(" unidades\n");
            }
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
