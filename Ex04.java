import javax.swing.JOptionPane;
public class Ex04 {
    
    public static void main (String[]x){

        //declaração de variaveis

        Integer numero, resultado;
        

        //entrada de dados

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero?"));

        //processamento

        resultado = numero - 1;
        
        //saida

        String s = String.format(
            "O valor da soma: %d",
            resultado
        );
        JOptionPane.showMessageDialog(null, s);





    }
}


