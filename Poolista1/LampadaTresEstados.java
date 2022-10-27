package Poolista1;

//Questão 2 e 3

/* 
   0 -> apagada
   1 -> meia-luz
   2 -> acesa
*/

public class LampadaTresEstados {
    public static int estadoDaLampada = 0; //Apagado por padrão
    public static double intensidade = 0.0; //Apagado por padrão
    
/*  
    public int acende(){
        return estadoDaLampada = 2;
    }

    public int meiaLuz(){
        return estadoDaLampada = 1;
    }

    public int apaga(){
        return estadoDaLampada = 0;
    }
*/    
    //retorna o valor da intensida
    private double luminosidade(){
        return intensidade;
    }

    //Intensidade informada pelo usuario
    public double luminosidade(int percent){
        intensidade = percent / 50;
        return intensidade;
    }

    public int checkEstado(LampadaTresEstados lamp){
        if(lamp.luminosidade() == 0)
            estadoDaLampada = 0;    
        else
            if(lamp.luminosidade() == 2.0)
                estadoDaLampada = 2;
            else
                estadoDaLampada = 1;

        return estadoDaLampada;
    }

    public void mostrarEstado(LampadaTresEstados lamp){
        if(checkEstado(lamp) != 0){
            if(checkEstado(lamp) == 2)
                System.out.println("Lâmpada acesa!!");
            else
                System.out.println("Lâmpada em meia-luz!!");
        }
        else
            System.out.println("Lâmpada apagada!!");
    }

}
