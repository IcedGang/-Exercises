package Classes;

public class Usuario{
    //Atributos da classe
    private String nome;
    private String cpf;
    private String endereco;
    private String cep;
    private String email;
    
    //Construtor
    //Cadastro de Usuário
    public Usuario(String nome, String cpf, String endereco, String cep, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    //Login do usuário
    public void usuarioLogin(String nome, String cpf){

    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    
    // Gera o comprovante de compra
    private String geraComprovante(Produto p){
        String aux = "\nCOMPROVANTE DE COMPRA\n";
        
        String str = aux + "Comprador: " + getNome() + "\n" 
        + "CPF Comprador: " + getCpf() + "\n" 
        + "Produto comprado: " + p.getNome() + "\n" 
        + "Preço: " + p.getPreco() 
        + ", Quantidade: ";
        
        return str;
    }

    // Método para a compra de um Produto
    public void compraProduto(Produto p, int quantidade){
        if(p.verEstoque(quantidade)){
            System.out.println("Compra não pode ser realizada, quantidade em estoque insuficiente!");
            System.exit(0); // Trocar para se o usuário desejar, inserir-lo em uma fila de espera
        }
        
        System.out.println("Compra realizada com sucesso!");
        p.remQntEstoque(quantidade);
        System.out.println(geraComprovante(p) + quantidade + "\n");
    }

    @Override
    public String toString() {
        return "Usuario [nome = " + nome + ", cpf = " + cpf + ", endereco = " + endereco + ", cep = " + cep + ", email = " + email
                + "]";
    }
    
}
