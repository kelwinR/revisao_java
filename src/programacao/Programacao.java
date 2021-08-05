
package programacao;

/**
 *
 * @author kelwin.rodrigues
 */
public class Programacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Laço de repetição FOR - Tabuada
        int tabuada = 2;
        
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
    }
        
        
        // Laço de repetição WHILE - Enquanto
        int contador = 0;
        while(contador < 100) {
            System.out.println("Contador é menor que 100 = (" + (contador) +")");
            contador+=3;
        }
        System.out.println("Terminou o WHILE");
        
        //Laço de repetição DO WHILE - Contador
        do {
            System.out.println("Contador é menor que 100 = (" + (contador) +")");
            contador+=3;
            
        }while(contador < 100);
        System.out.println("Terminou o DO WHILE");
        
        double a = 5.4;
        double b = 6;
        soma(a, b);
        
        double num1 = 1;
        double num2 = 5;
        double num3 = 10;
        double num4 = 6;
        double num5 = 8;
        media(num1, num2, num3, num4, num5);
        
        
        int[] valores = new int[3];
        valores[0] = 5;
        valores[1] = 5;
        valores[2] = 5;

        double retorno_media = mediaF(valores);
        System.out.println("Média = " + retorno_media);
        
        
    }
        
    private static void soma (double num1, double num2){
        //Criar uma função de soma
        System.out.println("Soma = " + (num1 + num2));
    }
    
    private static void media (double num1, double num2, double num3, double num4, double num5){
            System.out.println("Média = " + ((num1 + num2 + num3 + num4 + num5)/5));
}
   private static double mediaF(int[] nums){
       double res_media = 0;
       System.out.println("Tamanho do ARAY = " + nums.length);
       for(int i = 0; i < nums.length; i++){
           res_media += nums[i];
       }
       res_media = res_media / nums.length;
       
       return res_media;
   }
}
