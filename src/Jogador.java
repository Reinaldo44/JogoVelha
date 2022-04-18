import java.util.Scanner;

public class Jogador {

    String nome;

    public Jogador(String nome){

        this.nome = nome;
        
    }
    
    //Método que faz a jogada do jogador que recebe a opção desejada via teclado.
    public static int[] fazerJogada(Scanner scan, char sa){

        int p[] = new int [2];
   
        System.out.printf("%s %c %n","Quem joga: ", sa);
        System.out.print("Informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a Coluna: ");
        p[1] = scan.nextInt();
        return p;
   
    }
    
}
