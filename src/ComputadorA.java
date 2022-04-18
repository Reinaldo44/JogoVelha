import java.util.Random;

public class ComputadorA {

   public String nome = "Computador A";
    
   public static int[] fazerJogada(char simbolo, Tabuleiro tabuleiro[][]){

     int p[] = new int [2];
     Random random = new Random();
  
      System.out.printf("%s %c %n","Quem joga: ", simbolo);

     

        if (tabuleiro[0][0].getSimbolo() == ' '){

          p[0] = 0;
          p[1] = 0;
          return p;

        }

        else if (tabuleiro[0][1].getSimbolo() == ' '){
 
          p[0] = 0;
          p[1] = 1;
          return p;

        }

        else if (tabuleiro[0][2].getSimbolo() == ' '){

          p[0] = 0;
          p[1] = 2;
          return p;

        }
        
        for(int i=0; i<20;i++){
        //p[0] = random.nextInt(6);
        p[0] = random.nextInt(6);
        p[1] = random.nextInt(6);
            
          if(tabuleiro[p[0]][p[1]].getSimbolo() == ' '){

          break;

        } 

        }
        
         return p;
    }    
}
