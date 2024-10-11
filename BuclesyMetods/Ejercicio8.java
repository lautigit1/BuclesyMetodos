import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        String[] empleados = {"Empleado A", "Empleado B", "Empleado C", "Empleado D", "Empleado E"};
        int[] horasTrabajadas = new int[empleados.length];
        final double TARIFA_POR_HORA = 15.0;

        // Pedir al usuario ingresar las horas trabajadas por cada empleado en la semana
        for (int i = 0; i < empleados.length; i++) {
            horasTrabajadas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas trabajadas por " + empleados[i] + " en la semana:"));
        }

        // Calcular y mostrar el pago semanal de cada empleado
        calcularPagoSemanal(empleados, horasTrabajadas, TARIFA_POR_HORA);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas, double tarifaPorHora) {
        StringBuilder reporte = new StringBuilder("Reporte de pagos semanales:\n");

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * tarifaPorHora;
            reporte.append(empleados[i]).append(": $").append(pagoSemanal).append("\n");
        }

        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
