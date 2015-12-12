
package boletin.pkg4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIO
 */
public class Boletin4_2 {

    
    public static void main(String[] args) {
      float precU=0f;
        int cant=0;
        precU=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio unitario"));
        cant=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de unidades"));
        CalcularCobro cobro1=new CalcularCobro(precU,cant);
        JOptionPane.showMessageDialog(null, cobro1.cobroFinal());
    }
    
}
