import javax.swing.JOptionPane;
public class Ex11{
    
    public static void main (String[]x){

        //declaração de variaveis

        double carros_vendidos, total_vendas, salario_fixo, valor_cada_carro, novo_salario;
        

        //entrada de dados

        carros_vendidos = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros o funcionario vendeu?"));
        total_vendas = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total das suas vendas"));
        salario_fixo = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario fixo do funcionario?"));
        valor_cada_carro = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor que ele recebe por cada carro vendido?"));

        //processamento

        novo_salario = salario_fixo + (valor_cada_carro * carros_vendidos) + (total_vendas * 0.05);
        
        //saida

        String s = String.format(
            "Novo salario: %.2f.",
            novo_salario
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    
