package DIO;
//Abaixo segue um exemplo de c�digo que voc� pode ou n�o utilizar
import java.util.Scanner;

 public class Problem{

	// TODO: complete os espa�os em branco com sua solu��o para o problema

     public static void main(String[] args) {
        
	    //a classe Scanner auxilia na leitura dos dados de entrada
         Scanner scan = new Scanner(System.in);

         int N= scan.nextInt();
         String string = scan.nextLine();
	    
	    
	    //quebra string em v�rias substrings a partir de um caractere
         String[] s = string.split(" 					");

         double[] idade = new double[N];

         for (int i = 0; i < N; i++){
        	 
        	 System.out.printf("");
        	 
             idade[i] =  scan.nextInt();
         }
         
         System.out.println("Nao poderao entrar as idades: ");
         
         for (int i = 0; i < N; i++){
             if(idade[i] < 18){
            	 
                 System.out.println(N);
             }

         }
     }
 }