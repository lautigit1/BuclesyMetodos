import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Pedir al usuario la cantidad de calificaciones
        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de clientes encuestados:"));
        double[] calificaciones = new double[numClientes];

        // Pedir al usuario ingresar las calificaciones de los clientes
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificación del cliente " + (i + 1) + " (de 1 a 5):"));
        }

        // Calcular y mostrar el promedio de satisfacción
        double promedio = calcularPromedioSatisfaccion(calificaciones);
        JOptionPane.showMessageDialog(null, "El promedio de satisfacción del cliente es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(double[] calificaciones) {
        double total = 0;
        for (double calificacion : calificaciones) {
            total += calificacion;
        }
        return total / calificaciones.length;
    }
}
