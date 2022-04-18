//classe Tabuleiro onde está toda a regra referente ao tabuleiro, onde começa com suas propiedade, contrutor e seus métodos
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
   
   //Método responsavel por mostrar o tabuleiro que esta sendo jogado.
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

 //Método que verifica se a jogada é possivel de ser realizada
 public static boolean verificaJogada(Tabuleiro[][] tabuleiro, int p[],char simboloAtual){
      if(tabuleiro[p[0]][p[1]].getSimbolo() == ' '){

        tabuleiro[p[0]][p[1]].setSimbolo(simboloAtual);

        return true;
      }
      else{

         return false;
      }
     
  }

//Método que popula cada posição da matriz para e criar o tabuleiro.
public static void iniciarJogo(Tabuleiro[][] tabuleiro){

      for(int l=0; l<3; l++){

          for(int c=0; c<3; c++){
             
              tabuleiro[l][c] = new Tabuleiro();

          }
      }
  }

//Método que verifica a vitória por parte do jogador ou por parte computador.
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

    else if( tabuleiro[0][1].getSimbolo() == 'X' &&
             tabuleiro[1][1].getSimbolo() == 'X' &&
             tabuleiro[2][1].getSimbolo() == 'X') {

             return true; 
     }  

    else if( tabuleiro[0][1].getSimbolo() == 'O' &&
             tabuleiro[1][1].getSimbolo() == 'O' &&
             tabuleiro[2][1].getSimbolo() == 'O'){

          return true;
     }

    else if(tabuleiro[0][2].getSimbolo() == 'X' &&
          tabuleiro[1][2].getSimbolo() == 'X' &&
          tabuleiro[2][2].getSimbolo() == 'X' ) {

          return true; 
    }

    else if( tabuleiro[0][2].getSimbolo() == 'O' &&
             tabuleiro[1][2].getSimbolo() == 'O' &&
             tabuleiro[2][2].getSimbolo() == 'O' ){

        return true;

    }

    else if( tabuleiro[0][0].getSimbolo() == 'X' &&
             tabuleiro[1][1].getSimbolo() == 'X' &&
             tabuleiro[2][2].getSimbolo() == 'X' ) {

          return true; 

    }

    else if( tabuleiro[0][0].getSimbolo() == 'O' &&
             tabuleiro[1][1].getSimbolo() == 'O' &&
             tabuleiro[2][2].getSimbolo() == 'O' ){

         return true;
    }

    else if( tabuleiro[2][0].getSimbolo() == 'X' &&
             tabuleiro[1][1].getSimbolo() == 'X' &&
             tabuleiro[0][2].getSimbolo() == 'X'){

         return true; 
    }

    else if( tabuleiro[2][0].getSimbolo() == 'O' &&
             tabuleiro[1][1].getSimbolo() == 'O' &&
             tabuleiro[0][2].getSimbolo() == 'O' ){

         return true;
    } 

     return false;

  }
    
}
