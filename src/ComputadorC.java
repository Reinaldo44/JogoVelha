import java.util.Random;

public class ComputadorC {

    public String nome = "Difícil";

    public static int[] fazerJogada(char simbolo, Tabuleiro tabuleiro[][]){

        int p[] = new int [2];
  
        System.out.printf("%s %c %n","Quem joga: ", simbolo);

        Random random = new Random();

         for(int i=0; i<20;i++){

            p[0] = random.nextInt(6);
            p[1] = random.nextInt(6);
            
         if(tabuleiro[p[0]][p[1]].getSimbolo() == ' '){

           break;
           
         }
        
        }
        return p;
    }   
    
}
