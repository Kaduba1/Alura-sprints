import javax.swing.*;
import java.text.DecimalFormat;

public class App {

        public static void main(String[] args) throws Exception {
            Object[] options = {"Convertir Divisas", "Convertir Temperatura",
                    "Salir de la aplicacion"};
            int elige = JOptionPane.showOptionDialog(null, "Que quieres haces?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (elige == 2) {
                JOptionPane.showMessageDialog(null, "App cerrada");
                System.exit(0);
            }
            if (elige == 0) {
                DecimalFormat formaterarDivisa = new DecimalFormat("#.##");//No entendi esto
                boolean continuarPrograma = true;
                while (continuarPrograma) {
                    String[] opciones = {"Pesos colombianos a euros", "Pesos colombianos a dolares", "Pesos colombianos a libras Esterlinas", "Pesos colombianos a Yen", "Pesos colombianos a Won"};
                    String cambio = (String) JOptionPane.showInputDialog(null, "Elije una opcion", "Conversor de moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos colombianos");
                    double pesos = 0;
                    try {
                        pesos = Double.parseDouble(input);//Convierte la entrada en un numero del tipo double
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    } if (cambio.equals("Pesos colombianos a euros")) {
                        double euros = pesos / 5109.86;
                        JOptionPane.showMessageDialog(null, euros + "Pesos colombianos son: " + formaterarDivisa.format(euros) + "Euros");
                    } else if (cambio.equals("Pesos colombianos a dolares")) {
                        double dolares = pesos / 4788.63;

                        JOptionPane.showMessageDialog(null, dolares + "Pesos colombianos son: " + formaterarDivisa.format(dolares) + "Dolares");
                    } else if (cambio.equals("Pesos colombianos a libras Esterlinas")) {
                        double libras = pesos / 5774.28;
                        JOptionPane.showMessageDialog(null, libras + "Pesos colombianos son: " + formaterarDivisa.format(libras) + "libras Esterlinas");
                    } else if (cambio.equals("Pesos colombianos a Yen")) {
                        double yen = pesos / 35.32;
                        JOptionPane.showMessageDialog(null, yen + "Pesos colombianos son: " + formaterarDivisa.format(yen) + "Yen");

                    } else if (cambio.equals("Pesos colombianos a Won")) {
                        double won = pesos / 3.70;
                        JOptionPane.showMessageDialog(null, won + "Pesos colombianos son: " + formaterarDivisa.format(won) + "Won");
                    }

                    int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando la App?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                        continuarPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado");
                    }

                }
            }
            if (elige == 1){
                boolean seguirPrograma = true;
                while(seguirPrograma){
                    String [] opciones = {"Celsius a Farenheit", "Farenheit a Celsius"};
                    int opcion = JOptionPane.showOptionDialog(null, "Elije una opcion: ", "Conversor de temperatura", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                    String valorNominal = JOptionPane.showInputDialog(null,"ingrese valor a convertir");
                    double valor= 0.0;
                    try{
                        valor = Double.parseDouble(valorNominal);
                    } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                        System.exit(0);
                    }
                    double resultado = 0;
                    if(opcion == 0){
                        resultado = (valor * 9/5) +32;
                        JOptionPane.showMessageDialog(null,valor + "Grados Celsius son: " + resultado + "Grados Farenheit.");
                    } else if (opcion == 1){
                        resultado = (valor - 32) *5/9;
                        JOptionPane.showMessageDialog(null,valor + "Grados Farenhet son: " + resultado + "Grados Celsius.");
                    }
                    int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir utilizando el programa? ","", JOptionPane.YES_NO_OPTION);
                    if(continuar == JOptionPane.NO_OPTION){
                        seguirPrograma = false;
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    }
                }
            }
        }
    }

