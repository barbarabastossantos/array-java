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
public class ControleDespesasMensais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        
        double[] diasMes=new double[30];
        double totalGastos=0;
        double mediaGastos=0;
        int diasAcimaMedia=0;
        double valorMaximo=0;
        double valorMinimo=0;
        boolean primeiro=true;
        
        System.out.println("""
                           
                           =======================================
                           
                                 RELATÓRIO MENSAL DE DESPESAS 
                           
                           ========================================
                           
                           
                           """);
        
        
        //Primeiro array para armazenamento de dados 
        
        for(int i=0;i<diasMes.length;i++){
            System.out.print("Digite o gasto do "+(i+1)+" dia -> R$ ");
            diasMes[i]=sc.nextDouble();
            totalGastos+=diasMes[i];
        }
        
        System.out.println(" ");
        
        mediaGastos=totalGastos/diasMes.length; // processamento dos dados para obter a media
        
        
        //Saída de dados
        
        System.out.printf("   Total de gatos do mês foi de R$ %.2f ",totalGastos);
        System.out.println(" ");
        System.out.printf("  A média dos gastos desse mês foi de R$ %.2f ",mediaGastos);
        System.out.println(" ");
        
        //Segundo array para verificar quais e quantos dias estam acima da media 
        
        for(int i=0;i< diasMes.length;i++){
            if(diasMes[i] > mediaGastos){
                diasAcimaMedia++;
                System.out.printf("No dia %d você gastou R$ %.2f , esse valor ultrapassou seu gasto medio.",(i+1),diasMes[i]);
                System.out.println(" ");
            }   
        }
        
        // Verifica se tivemos ou não dias que ultrapassaram a media
        // caso tenha ele imprime
        
        if(diasAcimaMedia>0){
            System.out.println(" Esse mês tivemos "+diasAcimaMedia+" dias acima da media. ");
        }else{
            System.out.printf(" Esse mês não tivemos nenhum dia que o gasto ultrapassou a media de R$ %.2f",mediaGastos);
        }
        
        
        System.out.println( " ");
        
        // Terceiro array verifica qual foi o maior e o menor gasto do mês 
        
        for(int i=0; i<diasMes.length;i++){
            if(primeiro){ // usamos essa logica do "primeiro" para o valor do max e min ser inicializado corretamente
                valorMaximo=diasMes[i];
                valorMinimo=diasMes[i];
                primeiro=false;
                
            }else if(diasMes[i]>valorMaximo){
                valorMaximo=diasMes[i];
            }else if(diasMes[i]<valorMinimo){
                valorMinimo=diasMes[i];
            }         
        }
        
        // Saida de dados 
        
        System.out.printf(" O maior gasto do mês foi de R$ %.2f ",valorMaximo);
        System.out.println( " ");
        System.out.printf(" O menor gasto do mês foi de R$ %.2f ",valorMinimo);
        System.out.println( " ");
        
        
        // Quarto array verifica se houve algum dia em que o valor diario ultrapassou R$ 600,00
        // caso haja ele imprime um alerta
        
        
        for(int i=0;i< diasMes.length;i++){
            if(diasMes[i]>600){
                System.out.println( " ");
                System.out.println("  ALERTA !!! No dia "+(i+1)+" voce gastou mais de R$ 600,00");
                System.out.printf(" Seu gasto foi de R$ %.2f ",diasMes[i]);
                System.out.println("Mantenha seus gastos dentro do orçamento para ter seus finanças sob controle.");
            }
        }
        System.out.println("""
                           
                           
                             ===================================================
                                 
                                 RELATÓRIO DE GASTOS DO MÊS FINALIZADO
                           
                           =====================================================
                           
                           """);
        sc.close();
    }
}
 