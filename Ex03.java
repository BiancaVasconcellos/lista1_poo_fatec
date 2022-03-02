import javax.swing.JOptionPane;
public class Ex03 {
    
    public static void main (String[]x){

        //declaração de variaveis

        double preco_unitario, quantidade_vendida, comissao, venda;
        

        //entrada de dados

        preco_unitario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do preco unitario?"));
        quantidade_vendida = Double.parseDouble(JOptionPane.showInputDialog("Quantas pecas foram vendidas?"));

        //processamento

        venda = preco_unitario * quantidade_vendida;
        comissao = venda + (venda * 0.05);

        //saida

        String s = String.format(
            "Comissao do vendendor: %.2f.",
            comissao
        );
        JOptionPane.showMessageDialog(null, s);





    }
}
