import javax.swing.JOptionPane;
public class Ex08{
    
    public static void main (String[]x){

        //declaração de variaveis

        Double total_eleitores, votos_brancos, votos_nulos, votos_validos;
        

        //entrada de dados

        total_eleitores = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero total de eleitores?"));
        votos_brancos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos em branco?"));
        votos_nulos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos nulos?" ));
        votos_validos = Double.parseDouble(JOptionPane.showInputDialog("Qual o numero de votos validos"));

       
        //processamento

        votos_brancos = (votos_brancos/total_eleitores) * 100; 
        votos_nulos = (votos_nulos/total_eleitores) * 100;
        votos_validos = (votos_validos/total_eleitores) * 100;
        
        //saida

        
        String resultado = String.format(       
            "%.0f eleitores: Percentual: Votos Brancos: %.0f%%, Votos Nulos: %.0f%%, Votos Validos: %.0f%%", 
            total_eleitores, votos_brancos, votos_nulos, votos_validos
        );

        JOptionPane.showMessageDialog(null, resultado);  
    }
}