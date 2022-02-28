import javax.swing.JOptionPane;
public class Exercicio01 {
    public static void main(String[] x) {

        //declaração de variáveis

        double dolar, real, resultado;
      
        //entrada de dados 

        dolar=Double.parseDouble(JOptionPane.showInputDialog("Quantos dolares voce quer converter?"));
        real=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da cotacao?"));

        //processamento

        resultado = dolar * real; 

      

        //saida

       
        String s = String.format(
            "O valor do dolar em reais e: %.2f.",
            resultado
        );
        JOptionPane.showMessageDialog(null, s);
         
         
    }
    
}
