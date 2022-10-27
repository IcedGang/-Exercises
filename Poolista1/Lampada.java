package Poolista1;

//Questão 1 e 4

public class Lampada {

    //Atributos da classe
    public static int estadoDaLampada = 0;  //Apagada por padrão
    public static double precoDaLampada = 12.50;
    public static int qntEmEstoque = 10;

    //Métodos para verificar o funcionamento da lâmpada
    public int acende(){
        return estadoDaLampada = 1;
    }

    public int apaga(){
        return estadoDaLampada = 0;
    }

    public Boolean estaLigada(){
        if(estadoDaLampada == 1)
            return true;
        else
            return false;
    }

    public void mostraEstado(){
        if(estadoDaLampada == 1)
            System.out.println("A lâmpada está acesa!!");
        else
            System.out.println("A lâmpada está apagada!!");
        
    }

    //Métodos para controle de estoque
    public void addEstoque(int quantidade){
        qntEmEstoque += quantidade;
    }

    public void removeEstoque(int quantidade){
        qntEmEstoque -= quantidade;
    }

    public int verEstoque(){
        return qntEmEstoque;
    }

    public double valueEstoque(){
        return qntEmEstoque * precoDaLampada;
    }

}
