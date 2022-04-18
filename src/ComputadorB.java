import java.util.Random;

public class ComputadorB {

    //Método que faz a jogada do Computador B, ele faz um random aleatório em todas as jogadas.
    public String nome = "Computador B";
    
    public static int[] fazerJogada(char simbolo, Tabuleiro tabuleiro[][]){

       int p[] = new int [2];
       Random random = new Random();
  
       System.out.printf("%s %c %n","Quem joga: ", simbolo);

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
