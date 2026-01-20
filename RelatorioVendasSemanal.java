/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RelatorioVendasSemanal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        // Segunda versão do programa relatorio de vendas por semana 
        // nessa versão usamos vetores para adicionar mais funcionalidades 
        
        
        double[] diasSemana= new double[7]; //vetor para guardar os valores dos dias da semana 
        
        
        System.out.println("""
                           
                           =================================================
                           
                                 RELATORIO DE VENDAS DA SEMANA
                           
                           =================================================
                           
                           """);
        
        double totalVendas=0;
        double mediaVendas=0;
        int vendasAcimaMedia=0;
        
        // Esse array armazena os valores das vendas em cada dia da semana 
        
        
        for(int i=0;i< diasSemana.length;i++){
            System.out.print(" Vendas do dia "+(i+1)+" -> R$ ");
            diasSemana[i]=sc.nextDouble();
            
            totalVendas+=diasSemana[i]; 
        }
        
        mediaVendas=totalVendas/7;
        
        System.out.printf(" \n Total de vendas da semana foi de R$ %.2f",totalVendas);
        System.out.println(" ");
        System.out.printf(" A média  de vendas da semana foi de R$ %.2f",mediaVendas);
        System.out.println(" ");
        
        // Esse array verifica qual dia da semana vendeu acima da media e totaliza os dias 
        // imprime quais dias venderam acima da media
        
        for(int i=0;i<diasSemana.length;i++){
            if(diasSemana[i]>mediaVendas){
                System.out.println(" ");
                System.out.printf("Dia "+(i+1)+" da semana vendeu acima da média com o valor de  R$ %.2f  ",diasSemana[i]);
                vendasAcimaMedia++;
            }
        }
        System.out.println( " ");
        // se houver algum dia em que as vendas foram acima da media ele imprime o total de dias
        
        if(vendasAcimaMedia>0){
            System.out.println(" Totalizando "+vendasAcimaMedia+" que as vendas foram acima da média.");
        }else{
            System.out.println("Essa semana não houve nenhum dia em que as vendas foram acima da media  ");
        }
        
        
        sc.close();
    }
    
}
