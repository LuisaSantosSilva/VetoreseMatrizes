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
public class EX02 {
    //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
      //declaração de vetor da posição 0 a 99
      double vetorn[] = new double [100];
      
      //declaração de variáveis
      double md = 0, soma = 0;
      int qtd = 0, i = 0, x = 0;
      
      //estrutura de repetição
      for ( i = 0; i < 100; i++)
      {
         //entrada de dados
         x = i + 1;
         vetorn[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + x + "ª número"));
         //soma dos vetores
         soma += vetorn [i];
      }
      
      //cálculo da média
      md = soma/100;
      
      //estrutura de repetição
      for (i = 0; i < 100; i++)
      {
          //estrutura de decisão
          if (vetorn[i] > md)
          {
              //quantidade de números acima da média
              qtd++;
          }//finalizando estrutura de decisão
          
      }//finalizando estrutura de repetição
      JOptionPane.showMessageDialog(null," Média do grupo: " + md + "\n Quantidade dos valores acima da média: " + qtd);
    }//finalizando método main()   
}//finalizando classe EX02