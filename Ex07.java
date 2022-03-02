import javax.swing.JOptionPane;
public class Ex07{
    
    public static void main (String[]x){

        //declaração de variaveis

        Integer anos, meses, dias;
        

        //entrada de dados

        anos = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade em meses?"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade em dias?"));

        //processamento

        dias = (dias + (anos * 365) + (meses * 30));
        
        //saida

        String s = String.format(
            "Idade em dias: %d",
            dias
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    


   