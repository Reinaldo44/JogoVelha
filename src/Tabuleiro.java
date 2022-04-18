import java.util.Scanner;

public class Tabuleiro {

    private char simbolo;

    public Tabuleiro(){

       this.simbolo =' ';
    }

    public char getSimbolo(){

       return simbolo;

    }

    public void setSimbolo(char simbolo){

       if(this.simbolo == ' '){    
          this.simbolo = simbolo;
       }
       else{
           System.out.print("Campo já usado");
       }

   }

   public static void telaJogo(Tabuleiro[][] tabuleiro){

            
     System.out.println("    0 | 1 | 2 |");
     System.out.println("--------------");
     System.out.printf("0 | %C | %C | %C |%n",tabuleiro[0][0].getSimbolo(),tabuleiro[0][1].getSimbolo(),tabuleiro[0][2].getSimbolo());
     System.out.println("--------------");
     System.out.printf("1 | %C | %C | %C |%n",tabuleiro[1][0].getSimbolo(),tabuleiro[1][1].getSimbolo(),tabuleiro[1][2].getSimbolo());
     System.out.println("--------------");
     System.out.printf("2 | %C | %C | %C |%n",tabuleiro[2][0].getSimbolo(),tabuleiro[2][1].getSimbolo(),tabuleiro[2][2].getSimbolo());
     System.out.println("--------------");
 }

 public static boolean verificaJogada(Tabuleiro[][] tabuleiro, int p[],char simboloAtual){
      if(tabuleiro[p[0]][p[1]].getSimbolo() == ' '){

        tabuleiro[p[0]][p[1]].setSimbolo(simboloAtual);

        return true;

      }
      else{

         return false;
      }
     
  }

  public static void iniciarJogo(Tabuleiro[][] tabuleiro){

      for(int l=0; l<3; l++){

          for(int c=0; c<3; c++){
             
              tabuleiro[l][c] = new Tabuleiro();

          }
      }
  }

 public static int[] fazerJogada(Scanner scan, char sa){

     int p[] = new int [2];

     System.out.printf("%s %c %n","Quem joga: ", sa);
     System.out.print("Informe a linha: ");
     p[0] = scan.nextInt();
     System.out.print("Informe a Coluna: ");
     p[1] = scan.nextInt();

     return p;

 }

 public static boolean retornaVitoria(Tabuleiro[][] tabuleiro){

      if (tabuleiro[0][0].getSimbolo() == 'X' &&  
          tabuleiro[0][1].getSimbolo() == 'X' &&
          tabuleiro[0][2].getSimbolo() == 'X' 
         ) {
          return true;    
           
      }
     else if( tabuleiro[0][1].getSimbolo() == 'O' &&
              tabuleiro[0][0].getSimbolo() == 'O' &&
              tabuleiro[0][2].getSimbolo() == 'O' ){
              return true;
     }
      
     else if(tabuleiro[1][0].getSimbolo() == 'X' &&
             tabuleiro[1][1].getSimbolo() == 'X' &&
             tabuleiro[1][2].getSimbolo() == 'X') {
             return true; 
        
      }
     else if(tabuleiro[1][0].getSimbolo() == 'O' &&
             tabuleiro[1][1].getSimbolo() == 'O' &&
             tabuleiro[1][2].getSimbolo() == 'O' ){
             return true;
     }

     else if(tabuleiro[2][0].getSimbolo() == 'X' &&
          tabuleiro[2][1].getSimbolo() == 'X' &&
          tabuleiro[2][2].getSimbolo() == 'X' ) {
         return true; 
     }

     else if(tabuleiro[2][0].getSimbolo() == 'O' &&
     tabuleiro[2][1].getSimbolo() == 'O' &&
     tabuleiro[2][2].getSimbolo() == 'O' ){
         return true;
     }
      
     else if(tabuleiro[0][0].getSimbolo() == 'X' &&
             tabuleiro[1][0].getSimbolo() == 'X' &&
             tabuleiro[2][0].getSimbolo() == 'X' ) {

          return true; 
      }

      else if(tabuleiro[0][0].getSimbolo() == 'O' &&
      tabuleiro[1][0].getSimbolo() == 'O' &&
      tabuleiro[2][0].getSimbolo() == 'O'){
         return true;
      }
     else if(tabuleiro[0][1].getSimbolo() == 'X' &&
          tabuleiro[1][1].getSimbolo() == 'X' &&
          tabuleiro[2][1].getSimbolo() == 'X' 
 ) {

          return true; 
     }

     else if(tabuleiro[0][1].getSimbolo() == 'O' &&
     tabuleiro[1][1].getSimbolo() == 'O' &&
     tabuleiro[2][1].getSimbolo() == 'O'){
          return true;
     }
     else if(tabuleiro[0][2].getSimbolo() == 'X' &&
          tabuleiro[1][2].getSimbolo() == 'X' &&
          tabuleiro[2][2].getSimbolo() == 'X' ) {

          return true; 
     }

     else if(tabuleiro[0][2].getSimbolo() == 'O' &&
     tabuleiro[1][2].getSimbolo() == 'O' &&
     tabuleiro[2][2].getSimbolo() == 'O' ){
        return true;
     }

     else if(tabuleiro[0][0].getSimbolo() == 'X' &&
          tabuleiro[1][1].getSimbolo() == 'X' &&
          tabuleiro[2][2].getSimbolo() == 'X' ) {

          return true; 
     }
     else if(tabuleiro[0][0].getSimbolo() == 'O' &&
     tabuleiro[1][1].getSimbolo() == 'O' &&
     tabuleiro[2][2].getSimbolo() == 'O' ){
         return true;
     }

     else if(tabuleiro[2][0].getSimbolo() == 'X' &&
          tabuleiro[1][1].getSimbolo() == 'X' &&
          tabuleiro[0][2].getSimbolo() == 'X') {

          return true; 
    }
     else if(tabuleiro[2][0].getSimbolo() == 'O' &&
     tabuleiro[1][1].getSimbolo() == 'O' &&
     tabuleiro[0][2].getSimbolo() == 'O' ){
          return true;
     }

    return false;
  }
    
}
