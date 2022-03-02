import javax.swing.JOptionPane;
public class Ex05 {
    
    public static void main (String[]x){

        //declaração de variaveis

        Integer base, altura, area;
        

        //entrada de dados

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
       
        //processamento

        area = base * altura;
        
        //saida

        String s = String.format(
            "O valor da area: %d",
            area
        );
        JOptionPane.showMessageDialog(null, s);

    }   

}    