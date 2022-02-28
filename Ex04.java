import javax.swing.JOptionPane;
public class Ex04 {
    
    public static void main (String[]x){

        //declaração de variaveis

        double numero, resultado;
        

        //entrada de dados

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero?"));

        //processamento

        resultado = numero - 1;
        
        //saida

        String s = String.format(
            "O valor da soma: %.2f.",
            resultado
        );
        JOptionPane.showMessageDialog(null, s);





    }
}


