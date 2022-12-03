package lista5;

// Questão 4

public class Ponto {
    
    // Distância entre dois pontos
    public static double distancia(Ponto2D a, Ponto2D b){
        return a.distancia(b);
    }

    // Distancia entre um ponto e a origem
    public static double distancia(Ponto2D a){
        return a.distancia();
    }

    //Informa o quadrante
    public static int quadrante(Ponto2D a){
        return a.quadrante();
    }

}
