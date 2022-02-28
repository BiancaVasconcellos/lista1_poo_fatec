import javax.swing.JOptionPane;
public class Ex10{
    
    public static void main (String[]x){

        //declaração de variaveis

        double  custo_fabrica, valor_distribuidor, valor_imposto, custo_consumidor, preco_distribuidor, preco_impostos;
        

        //entrada de dados

        custo_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de custo de fabrica?"));
    
        //processamento

        valor_distribuidor = custo_fabrica + (custo_fabrica * preco_distribuidor / 100);
        valor_imposto = custo_fabrica + (custo_fabrica * preco_impostos / 100);
        custo_consumidor = custo_fabrica + valor_distribuidor + valor_imposto;
        
        //saida

        String s = String.format(
            "O custo do consumidor: %s",
            custo_consumidor
        );
        JOptionPane.showMessageDialog(null, s);



    }
    
}    
