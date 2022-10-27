import java.util.*;

public class Craps {

    public static void main(String[] args) {
        
        int value1 = DiceValues();
        int value2 = DiceValues();

        System.out.println("Dado 1: " + value1);
        System.out.println("Dado 2: " + value2);
        
        int score = value1 + value2;
        System.out.println();        
        System.out.println("Ponto: " + score);

        if(score == 7 || score == 11){
            System.out.println("Você venceu!");
            return;
        }
        
        if(score == 2 || score == 3|| score == 12){
            System.out.println("Você perdeu!");
            return; 
        }
        
        System.out.println("Iniciando Estágio 2!");
        
        System.out.println();
        for(int count = 1; ;count++){
            value1 = DiceValues();
            value2 = DiceValues();

            int score2 = value1 + value2;
            System.out.println("Dado 1: " + value1); 
            System.out.println("Dado 2: " + value2);
            System.out.println("Jogada " + count + ": " + score2);
            System.out.println();
            
            if(score2 == 7){
                System.out.println("Você Perdeu!");
                return;
            }

            if(score == score2){
                System.out.println("Você Ganhou!");
                return;
            }
            
        }

    }

    public static int DiceValues(){
        Random dice = new Random();
        int value = dice.nextInt(6) + 1;

        return value;
    }

}