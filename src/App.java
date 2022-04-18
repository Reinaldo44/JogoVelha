import java.util.Scanner;

public class App {

    //Este é o método principal do projeto onde começa iniciaando as variáveis que serão usadas na classe main(principal).
    public static void main(String[] args) throws Exception {

        Tabuleiro[][] tabuleiro = new Tabuleiro[3][3];
        Scanner scan = new Scanner(System.in);
        char simboloJogador = 'X';
        char simboloComputador = 'O';
        boolean game = true;
        boolean vitoria;
        String jogador1;
        int computador1;
        int contador = 0;

        //Aqui onde recebemos o nome do jogador vindo do teclado.
        System.out.println("Digite seu nome: ");
        jogador1 = scan.nextLine();
        Jogador jogador = new Jogador(jogador1);

        //Aqui recebemos do teclado a opção do jogador referente a qual computador ele quer enfrentar.
        System.out.println("Digite o numero que você quer jogar: ");
        System.out.println(" 1 - Computador A: ");
        System.out.println(" 2 - Computador B: ");
        System.out.println(" 3 - Computador C: ");
        computador1 = scan.nextInt();

        //Aqui é onde iniciamos o jogo de acordo com a opção do jogador então criamos o objeto de acordo com a opção desejada chamando o método do objeto escolido.            
        if(computador1 == 1){
            
            //Cria o objeto
            ComputadorA computadorA = new ComputadorA();
            
            //Inicia o tabuleiro
            Tabuleiro.iniciarJogo(tabuleiro);
         
            //Aqui acontece o jogo enquanto tiver jogada e não tiver ganhador.
            while(game){
             
                
                try{          
                   
                    //Chamada do método que verifica se a casa esta vazia e faz a jogada do computador.
                    if(Tabuleiro.verificaJogada(tabuleiro,ComputadorA.fazerJogada(simboloComputador, tabuleiro),simboloComputador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    }              
                    
                    //Chamada do método que retorna a vitoria do computador.
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
    
                       System.out.println(computadorA.nome + " você venceu");
                        break;
                    }

                    //verifica se ainda tem casa disponivel para ser jogada e encerra caso não tem mais opção para jogar.
                    if(contador >= 9){
                        break;
                    }
                    
                    //Chamada do método que verifica se a casa esta vazia e faz a jogada do Jogador.
                    if(Tabuleiro.verificaJogada(tabuleiro,Jogador.fazerJogada(scan,simboloJogador),simboloJogador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    
                    } 
                    
                    //Chamada do método que retorna a vitoria do jogador
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
                        
                        System.out.println(jogador.nome + " você venceu");
                        break;
                    }
                    
    
                }catch(Exception e){
    
                   System.out.printf("Campo já marcado"); 
    
                }
    
            }
    
            System.out.printf("Fim do Jogo");
            
         }
         
         //O codigo segue como acima se a opção fo do Computador B
          else if(computador1 == 2){
            ComputadorB computadorB = new ComputadorB();
            Tabuleiro.iniciarJogo(tabuleiro);

            while(game){
             
                
                try{          
                   
                    if(Tabuleiro.verificaJogada(tabuleiro,ComputadorB.fazerJogada(simboloComputador, tabuleiro),simboloComputador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    }              
                   
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
    
                       System.out.println(computadorB.nome + " você venceu");
                        break;
                    }
    
                    if(contador >= 9){
                        break;
                    }
    
                    if(Tabuleiro.verificaJogada(tabuleiro,Jogador.fazerJogada(scan,simboloJogador),simboloJogador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    
                    } 
    
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
                        
                        System.out.println(jogador.nome + " você venceu");
                        break;
                    }
                    
    
                }catch(Exception e){
    
                   System.out.printf("Campo já marcado"); 
    
                }
    
            }
    
            System.out.printf("Fim do Jogo");
         
          }
          
          //O codigo segue como acima se a opção fo do Computador C
          else if(computador1 == 3){
            ComputadorC computadorC = new ComputadorC();
            Tabuleiro.iniciarJogo(tabuleiro);

            while(game){
             
                
                try{          
                   
                    if(Tabuleiro.verificaJogada(tabuleiro,ComputadorC.fazerJogada(simboloComputador, tabuleiro),simboloComputador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    }              
                   
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
    
                       System.out.println(computadorC.nome + " você venceu");
                        break;
                    }
    
                    if(contador >= 9){
                        break;
                    }
    
                    if(Tabuleiro.verificaJogada(tabuleiro,Jogador.fazerJogada(scan,simboloJogador),simboloJogador)){
    
                        Tabuleiro.telaJogo(tabuleiro);
                        contador++;
                    
                    } 
    
                    vitoria = Tabuleiro.retornaVitoria(tabuleiro);
                    if(vitoria){
                        
                        System.out.println(jogador.nome + " você venceu");
                        break;
                    }
                    
    
                }catch(Exception e){
    
                   System.out.printf("Campo já marcado"); 
    
                }
    
            }
    
            System.out.printf("Fim do Jogo");

          }
 
         else{

             System.out.printf("Opção inválida");
             
         }

    }


}


