package Lista2;

import lista5.Ponto2D;

public class Ponto2DExemplo {
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D(-4, 5);

        ponto.imprimePonto();
        System.out.println("Quadrante: " + ponto.quadrante());
        System.out.printf("Distância: %.3f\n", ponto.distancia());
    }
}
