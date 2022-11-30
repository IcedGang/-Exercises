package Lista3;

import lista5.Ponto2D;

public class CirculoExample {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2, 3, 5);
        Circulo c2 = new Circulo(2, 3, 4);
        Ponto2D p1 = new Ponto2D(7, 8);

        c1.imprimeCirculo();
        System.out.println("Área: " + c1.area());
        System.out.println("Circunferência: " + c1.circunferencia());

        System.out.println();

        c2.imprimeCirculo();
        System.out.println("Área: " + c2.area());
        System.out.println("Circunferência: " + c2.circunferencia());

        System.out.println();
        System.out.println("c1 > c2? " + c1.isBigThan(c2));
        System.out.println("c2 > c1? " + c2.isBigThan(c1));

        System.out.println();
        System.out.println("P1 dentro de c1? " + c1.isInnerPoint(p1));
        System.out.println("P1 dentro de c2? " + c2.isInnerPoint(p1));

    }
}
