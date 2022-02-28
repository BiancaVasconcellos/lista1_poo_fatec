import javax.swing.JOptionPane;
public class Ex09{
    
    public static void main (String[]x){

        //declaração de variaveis

        double salario, reajuste, novo_salario;
        

        //entrada de dados

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de ajuste?"));

        //processamento

        novo_salario = salario + (salario * (reajuste / 100));
        
        //saida

        String s = String.format(
            "Novo salario: %s",
            novo_salario
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    
