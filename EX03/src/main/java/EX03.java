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
public class EX03 {
     //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
        //declaração do vetor de 0 a 49 posições
        int vetor[] = new int [50];
        
        //declaração de variáveis
        int nmaior = 0, nmenor=0, pMaior = 0, pMenor = 0, i = 0;
        
        //estrutura de repetição
        for( i = 0; i < 50; i++ ) {
            
            //armazenando a posição para o usuário do número
            int x = i + 1;
            
            //entrada dos números
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + x + "º número"));
        }
        
        //entrada de dados da posição 0 do vetor
        nmenor = vetor[0];
        nmaior = vetor[0];
            
        //estrutura de repetição
        for(i = 0; i < 50; i++) {
            
           //caso o vetor for maior que o número maior
            if (vetor[i] > nmaior){
                //o nmaior passa ser o número daquele vetor
                nmaior = vetor[i];
                //assim é armazenado a posição do número maior através do i
                pMaior = i;
            }
            //caso o vetor for menor que o número menor
            else if (vetor[i] < nmenor){
                //o nmenor passa ser o número daquele vetor
                nmenor = vetor[i];
                //assim é armazenado a posição do número menor através do i
                pMenor = i;
            }
            
        }//finalizando estrutura de repetição
         
        //impressão dos resultados
        JOptionPane.showMessageDialog(null," O maior número: " + nmaior + "\n Sua posição vetorial é: " + pMaior + "° \n \n" +
            " O menor número: " + nmenor + "\n Sua posição vetorial é: " + pMenor + "° ");
        
    }//finalizando método main() 
}//finalizando classe EX03