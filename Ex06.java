import javax.swing.JOptionPane;
public class Ex06{
    
    public static void main (String[]x){

        //declaração de variaveis

        Integer idade, anos;
        

        //entrada de dados

        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
       
        //processamento

        anos = idade * 365;
        
        //saida

        String s = String.format(
            "Idade em dias: %d.",
            anos
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    
