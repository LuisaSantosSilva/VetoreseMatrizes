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
public class EX04 {
    //pacote de extenção do núcleo de java
    public static void main(String[] args)
    {
        //declaração do vetor de 0 a 9 posições
        int numero[] = new int [10];
        
        //estrutura de repetição para entrada de dados
        for (int i = 0; i < 10; i++){
            int quant = i + 1;
            //entrada de números do usuário
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + quant + "º número"));
        }
        //estrutura de repetição dos 10 números digitados pelo usuário
        for (int i = 0; i < 10; i++){
            int fatorial = 1;
            
            //enquanto o x for menor ou igual ao número digitado peo usuário que foi armazenado na posição do vetor numero[i]
            for (int x = 1; x<= numero[i]; x++){
                //caso o número digitado for 0 apresentar 1 seguindo a regra do 0 fatorial
                if (numero[i] == 0) {
                    fatorial = 1;
                //se o fatorial não for 0, o fatorial irá receber o fatorial vezes o x até o x chegar no número digitado pelo usuário    
                } else {
                    fatorial = fatorial * x;
                }
            }
            //impressão dos resultados
            JOptionPane.showMessageDialog(null,"O resultado do fatorial do número " + numero[i] + " = " + fatorial);
            System.out.println("O resultado do fatorial do número " + numero[i] + " = " + fatorial);
        }
    }//finalizando método main()  
}//finalizando clase EX04
