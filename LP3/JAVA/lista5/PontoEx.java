package lista5;

public class PontoEx {
    public static void main(String[] args) {
        Ponto2D a = new Ponto2D(5, -12);
        Ponto2D b = new Ponto2D(-15, 20);

        System.out.println("Distância entre os pontos a e b: " + Ponto.distancia(a, b));
        
        System.out.println("Distância entre o ponto a e a origem: " + Ponto.distancia(a));
        System.out.println("Distância entre o ponto b e a origem: " + Ponto.distancia(b));

        System.out.println("Quadrande ponto a: " + Ponto.quadrante(a));
        System.out.println("Quadrande ponto b: " + Ponto.quadrante(b));

    }
}
