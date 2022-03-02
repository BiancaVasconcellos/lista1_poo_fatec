import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] x) 
    {
        Double custo_fabrica , custo_consumidor, porcentagem_distribuidor = 28.0,
        percentual_impostos = 45.0, distribuidor, valor_impostos;

        custo_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do custo da fabrica? ")); 

        distribuidor = (custo_fabrica * porcentagem_distribuidor) / 100.000;
        valor_impostos = (custo_fabrica * percentual_impostos) / 100;
        custo_consumidor = distribuidor + valor_impostos;
        
        String resultado = String.format(       
            "O custo final para o consumidor é de: %.2f reais", custo_consumidor
        );

        JOptionPane.showMessageDialog(null, resultado);  
    }
}