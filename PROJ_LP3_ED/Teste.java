import Classes.*;
import Estruturas.*;

public class Teste {
    public static void main(String[] args) {
        // Mouse x = new Mouse("Mouse Gamer", 450, 5, "periferico", "oex", 23);
        // Usuario teste = new Usuario("Vítor", "03485147516", "adasdasd", "addadwadaw", "vclima.cic@uesc.br");
        // Lista<Integer> l = new Lista<>(); 
        Fila<Integer> f = new Fila<>();

        f.enfileirar(1);
        System.out.println(f);

        f.desenfileirar();
        f.desenfileirar();
        System.out.println(f);

        // teste.compraProduto(x, 3);

        // l.inserirInicio(3);
        // l.inserirInicio(2);
        // l.inserirInicio(1);
        // System.out.println(l.imprimeLista());

        // l.removerInicio();
        // System.out.println(l.imprimeLista());

        // l.removerFinal();
        // System.out.println(l.imprimeLista());
    }
}
