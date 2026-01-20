/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class MonitoramentoDeProdutividadeSemanal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Uma empresa deseja acompanhar quantas tarefas conclui um funcionario 
        // por dia durante a semana para avaliar a produ;tividade
        
        int[] tarefasConcluidas=new int[7]; // criando array para armazenar a quantidade de tarefas  concluidas na semana 
        int totalTarefasDia=0; 
        int AcimaMedia=0;
        
        
        System.out.println("""
                           
                           
                           =========================================================
                           
                                 RELATORIO DE PRODUTIVIDADE SEMANAL
                           
                           =========================================================
                           
                           
                           
                           """);
        // Armazenamento de dados
        
        for(int i=0; i<tarefasConcluidas.length;i++){
            System.out.println("Quantas tarefas foi executada no dia "+(i+1)+" -> ");
            tarefasConcluidas[i]=sc.nextInt();
            totalTarefasDia+=tarefasConcluidas[i];   
        }
            System.out.println(" ");
            
        //Processamento dos dados 
        
        int media=totalTarefasDia/tarefasConcluidas.length; 
        
        
        System.out.println(" Sua media de produtividade da semana foi de "+media);
        System.out.println(" ");
        //Verifcação se houve ou não dias acima da media de produtividade, caso tenha , imprime o dia e a quanridade de tarefas
        
        for(int i=0; i<tarefasConcluidas.length;i++){
         if(tarefasConcluidas[i]>media){
             System.out.println(" No dia "+(i+1)+" a produtividade foi acima da media -> "+tarefasConcluidas[i]);
             AcimaMedia++;
         }   
        }
          
        // Aqui analisamos os dados gerados para imprimir ao usurio se a semana dele foi produtiva ou não baseada em um criterio de dias acima da media
        
        if(AcimaMedia>5){
            System.out.println("    Exelente! Sua semana foi bem produtiva com "+ AcimaMedia+" com a produtividade acima da media ");
        }else if(AcimaMedia>3){
            System.out.println("    Em nivel de produtividade sua semana foi regular com "+AcimaMedia+" dias produtivos acima da media ");
        }else{
            System.out.println("    Sua semana não foi tão produtiva quanto o esperado com apenas "+AcimaMedia+" de dias com produtividade acima media");
        }
        
        
        System.out.println("""
                           
                           ============================================================
                                 RELATORIO FINALIZADO
                           ============================================================
                           
                           
                           """);
        
       sc.close();
    }
}
