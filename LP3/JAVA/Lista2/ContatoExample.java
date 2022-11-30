package Lista2;

public class ContatoExample {
    public static void main(String[] args) {
        Contato teste = new Contato();

        teste.inicializarContato("Vítor", "icedgang17@gmail.com", "73991238330", 
                                 7, 11, 2004);
        teste.imprimeContato();
        System.out.printf("Idade: %d\n", teste.calculaIdade());
    }
}
