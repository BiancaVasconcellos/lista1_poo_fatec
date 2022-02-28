import javax.swing.JOptionPane;
public class Ex02 {

    public static void main (String[] x){

        //declaração de variáveis

        double numero1, numero2, numero3, numero4, resultado;

        //entrada de dados

        numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
        numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
        numero3=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
        numero4=Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto numero"));

        //processamento
 
        numero1 = numero1 * numero1;
        numero2 = numero2 * numero2;
        numero3 = numero3 * numero3;
        numero4 = numero4 * numero4;

        resultado = numero1 + numero2 + numero3 + numero4;

        //saida

        String s = String.format(
            "O valor da soma: %.2f.",
            resultado
        );
        JOptionPane.showMessageDialog(null, s);
         

   
    }

    
}