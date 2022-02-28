import javax.swing.JOptionPane;
public class Ex05 {
    
    public static void main (String[]x){

        //declaração de variaveis

        double base, altura, area;
        

        //entrada de dados

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));
       
        //processamento

        area = base * altura;
        
        //saida

        String s = String.format(
            "O valor da area: %.2f.",
            area
        );
        JOptionPane.showMessageDialog(null, s);

    }   

}    