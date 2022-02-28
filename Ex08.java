import javax.swing.JOptionPane;
public class Ex08{
    
    public static void main (String[]x){

        //declaração de variaveis

        double total_eleitores, votos_brancos, votos_nulos, votos_validos, porcentagem_branco,
        porcentagem_nulos, porcentagem_validos;
        

        //entrada de dados

        total_eleitores = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero total de eleitores?"));
        votos_brancos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos em branco?"));
        votos_nulos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos nulos?" ));
        votos_validos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos validos"));

       
        //processamento

        porcentagem_branco = 100 * votos_brancos/total_eleitores;
        porcentagem_nulos = 100 * votos_nulos/total_eleitores;
        porcentagem_validos = 100 * votos_validos/total_eleitores;  
        
        //saida

        
        String s = String.format(
            "Votos Validos: %f", porcentagem_validos, 
            "Votos Nulos: %f", porcentagem_nulos,
            "Votos em Branco: %f", porcentagem_branco
        );
        JOptionPane.showMessageDialog(null, s);
        JOptionPane.showMessageDialog(null, porcentagem_nulos);
        JOptionPane.showMessageDialog(null, porcentagem_branco);


    }
    
}    
