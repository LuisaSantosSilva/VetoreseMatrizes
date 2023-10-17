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
public class EX01 {
    //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
        //criação da variável vetorial com 10 posições (0 a 9)
        int v[] = new int [10];
        
        //declaração de variáveis
        int contpar = 0, somaimpar = 0, i = 0, l = 0;
        
        //estrutura de repetição
        for (i = 0; i <= 9; i++)
        {
            //armazenando a posição do número
            l = i + 1;
            
            //convertendo string para inteiro, armazenando na variavel vetorial inteira
            v[i] = Integer.parseInt(JOptionPane.showInputDialog
                ("Digite o " + l + "° número"));
            
            //verificação de número impar ou par
            if (v[i] % 2 == 1)
            {
                //somando somaimpar e o vetor caso o número for impar
                somaimpar += v[i];
            }
            else
            {
                //caso o número for par acontecerá um incremento ao contpar
                contpar++;
            } 
        }//finalizando estrutura de repetição
         JOptionPane.showMessageDialog(null,"Soma dos números impares = " + somaimpar + "\n Quantidade de números pares = " + contpar); 
    }//finalizando método main()   
}//finalizando classe EX01
   
