package Classes;

//Classe Pai
abstract class Produto {
    
    //Atributos da classe
    private String nome;
    private static double preco;
    private static int qntEstoque;

    //Construtor 
    public Produto(String nome, double preco, int qntEstoque){
        this.nome = nome;
        Produto.preco = preco;
        Produto.qntEstoque = qntEstoque;
    }

    //Getters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }

    public int getQntEstoque(){
        return qntEstoque;
    }

    //Adiciona quantidade no estoque
    public void addQntEstoque(int quantidade){
        System.out.println("FOI ADICIONADO " + quantidade + " PRODUTOS NO ESTOQUE!");
        qntEstoque += quantidade;
    }

    //Remove quantidade no estoque, 
    //operação só será feita a partir da compra de um produto
    protected void remQntEstoque(int quantidade){
        qntEstoque -= quantidade;
    }

    //Verifica se a quantidade desejada está disponivel no estoque 
    protected boolean verEstoque(int quantidade){
        if(getQntEstoque() < quantidade)
            return true;
        
        return false;
    }

}
