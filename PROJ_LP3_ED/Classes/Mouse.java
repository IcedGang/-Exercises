package Classes;

//Subclasse de Produto
public class Mouse extends Produto {
    //Atributos da subclasse
    private String categoria;
    private String marca;
    private int codigo;
    
    //Construtor da subclasse, 
    //usando o construtor da classe Pai
    public Mouse(String nome, double preco, int qntEstoque, String categoria, String marca, int codigo) {
        super(nome, preco, qntEstoque);
        this.categoria = categoria;
        this.marca = marca;
        this.codigo = codigo;
    }

    //Getters
    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigo(){
        return codigo;
    }


}
