import javax.swing.JOptionPane;
public class Ex07{
    
    public static void main (String[]x){

        //declaração de variaveis

        double anos, meses, dias;
        

        //entrada de dados

        anos = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua idade?"));
        meses = Double.parseDouble(JOptionPane.showInputDialog("Qual sua idade em meses?"));
        dias = Double.parseDouble(JOptionPane.showInputDialog("Qual sua idade em dias?"));

        //processamento

        dias = (dias + (anos * 365) + (meses * 30));
        
        //saida

        String s = String.format(
            "Idade em dias: %s",
            dias
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    
