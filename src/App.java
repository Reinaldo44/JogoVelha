import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Tabuleiro[][] tabuleiro = new Tabuleiro[3][3];
        Scanner scan = new Scanner(System.in);
        char simboloJogador = 'X';
        char simboloComputador = 'O';
        boolean game = true;
        boolean vitoria;
        String jogador1;
        int computador1;
        String vitoriaComputador;

        System.out.println("Digite seu nome: ");
        jogador1 = scan.nextLine();
        Jogador jogador = new Jogador(jogador1);

        System.out.println("Digite o numero que você quer jogar: ");
        System.out.println(" 1 - Fácil: ");
        System.out.println(" 2 - Medio: ");
        System.out.println(" 3 - Difícil: ");
        computador1 = scan.nextInt();
        
        vitoriaComputador = verificaComputador(computador1);

       Tabuleiro.iniciarJogo(tabuleiro);

        while(game){
         
            
            try{          
               
                if(Tabuleiro.verificaJogada(tabuleiro,ComputadorA.fazerJogada(simboloComputador, tabuleiro),simboloComputador)){
                    Tabuleiro.telaJogo(tabuleiro);
                }              

                  /* if(simboloAtual == 'X'){
                       
                       simboloAtual = 'O';

                    }
                    else{

                        simboloAtual = 'X';

                    }*/

                //fazerJogada(scan,simboloAtual);
                //retornaVitoria(tabuleiro);
               
                vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                if(vitoria){

                   System.out.printf(vitoriaComputador," você venceu venceu");
                    break;
                }

                if(Tabuleiro.verificaJogada(tabuleiro,Tabuleiro.fazerJogada(scan,simboloJogador),simboloJogador)){

                    Tabuleiro.telaJogo(tabuleiro);
                
                } 

                vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                if(vitoria){
                    
                    System.out.printf(jogador.nome, " você venceu");
                    break;
                }
            }catch(Exception e){
               System.out.printf("Campo já marcado");    
            }

        }
        System.out.printf("Fim do Jogo");
    }

    public static String verificaComputador(int computador1){

        String opcaoComputador = "";
            
        if(computador1 == 1){

           ComputadorA computadorA = new ComputadorA();
           opcaoComputador = computadorA.nome; 
        }
         else if(computador1 == 2){
           ComputadorB computadorB = new ComputadorB();
           opcaoComputador = computadorB.nome;
        
         }

         else if(computador1 == 3){
           ComputadorC computadorC = new ComputadorC();
           opcaoComputador = computadorC.nome;  
         }

         else{
            System.out.printf("Opção inválida");
            
         }

        return opcaoComputador;

        }
     

}


