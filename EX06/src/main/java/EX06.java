/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Luisa Santos Silva
 */
//import javax.swing
import javax.swing.JOptionPane;
//criando classe
public class EX06 {
    //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
        // declaração de vetores de posições 0 a 99 
       int qtd[] = new int [100];
       double preco[] = new double [100];
       
       //declaração de variáveis
       int i = 0, x = 0;
       double fat = 0;
       
       //estrutura de repetição
       while (i < 100)
       {
           //entrada de dados e incremento
           x = i + 1;
           qtd[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da " + x + "ª mercadoria vendida"));
           preco[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da " + x + "ª mercadoria vendida"));
           fat += preco[i] * qtd[i];
           i++;
       }
       //impressão do resultado
       JOptionPane.showMessageDialog(null,"O faturamento mensal é de: " + fat + " reais");
    }//finalizando método main()
}//finalizando classe EX06
