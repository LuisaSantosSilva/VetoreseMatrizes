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
public class EX05 {
    
    //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
            //declaração do vetor de 0 a 49 posições
            char vetor[] = new char [50];
            
             //declaração de variáveis
            int i= 0, conta=0, conte=0, conti=0, conto=0, contu=0, vInvalida=0;
            double porcenA=0, porcenE=0, porcenI=0, porcenO=0, porcenU=0;
          
            //estrutura de repetição
             while (i<50)
            {
                //entrada de dados
                int quant = i + 1;
                vetor[i] = JOptionPane.showInputDialog("Digite sua " + quant + "° vogal").charAt(0);
              
                //estrutura de decisão
                if (vetor[i] == 'a'){
                    conta++;
                    i++;   
                }
                else if (vetor[i] == 'A'){
                    conta++;
                    i++;
                }
                else if (vetor[i] == 'e'){
                    conte++;
                    i++;
                }
                else if (vetor[i] == 'E'){
                    conte++;
                    i++;
                }
                else if (vetor[i] == 'i'){
                    conti++;
                    i++;
                }
                else if (vetor[i] == 'I'){
                    conti++;
                    i++;
                }
                else if (vetor[i] == 'o'){
                    conto++;
                    i++;
                }
                else if (vetor[i] == 'O'){
                    conto++;
                    i++;
                }
                else if (vetor[i] == 'u'){
                    contu++;
                    i++;
                }
                else if(vetor[i] == 'U'){
                    contu++;
                    i++;
                }
                else{
                    vInvalida++;
                    System.out.println("Você não digitou uma vogal existente");
                    JOptionPane.showMessageDialog(null,"Você não digitou uma vogal existente");
                    i++;
                }  
            }//finalizando estrutura de repetição
            
             //operaçãoes para descobrir porcentagem
             porcenA = (conta * 100) /50;
             porcenE = (conte * 100) /50;
             porcenI = (conti * 100) /50;
             porcenO = (conto * 100) /50;
             porcenU = (contu * 100) /50;
             
            //impressão dos resultados  
            
             System.out.println("quantidade de vezes digitadas a letra A = " + conta + "\nsua porcentagem no grupo é de = " + porcenA + "%");
             System.out.println("quantidade de vezes digitadas a letra E = " + conte + "\nsua porcentagem no grupo é de = " + porcenE + "%");
             System.out.println("quantidade de vezes digitadas a letra I = " + conti + "\nsua porcentagem no grupo é de = " + porcenI + "%");
             System.out.println("quantidade de vezes digitadas a letra O = " + conto + "\nsua porcentagem no grupo é de = " + porcenO + "%");
             System.out.println("quantidade de vezes digitadas a letra U = " + contu + "\nsua porcentagem no grupo é de = " + porcenU + "%");
             System.out.println("quantidade de vogais inválidas = " + vInvalida );
             
             JOptionPane.showMessageDialog(null," quantidade de letras A = " + conta + "\n Sua porcentagem no grupo = " + porcenA + "%\n" + 
                     "\n Quantidade de letras E = " + conte + "\n Sua porcentagem no grupo = " + porcenE + "%\n" + 
                     "\n Quantidade de letras I = " + conti + "\n Sua porcentagem no grupo = " + porcenI + "%\n" + 
                     "\n Quantidade de letras O = " + conto + "\n Sua porcentagem no grupo = " + porcenO + "%\n" + 
                     "\n Quantidade de letras U = " + contu + "\n Sua porcentagem no grupo = " + porcenU + "%\n" +
                     "\n Quantidade de vogais inválidas = " + vInvalida);
                    
    }//finalizando método main()
    
}//finalizando classe EX05

