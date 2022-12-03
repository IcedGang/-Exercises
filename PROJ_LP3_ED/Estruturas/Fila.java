package Estruturas;

// Fila de tipo genérico 
public class Fila<Type> {
    private Lista<Type> fila; // Usando uma lista para representar uma Fila 
    
    private No<Type> primeiro; // Primeiro da fila
    private No<Type> ultimo; // Ultimo da fila

    // Inicia a fila
    public Fila(){
        this.fila = new Lista<>();
        primeiro = null;
        ultimo = null;
    }

    // Adiciona elementos na fila
    public void enfileirar(Type info){
        fila.inserirFinal(info);
        this.primeiro = fila.getInicio();
        this.ultimo = fila.getFim();
    }

    // Remove elementos da fila
    public void desenfileirar(){
        //Verifica se a fila está vazia
        if(!fila.isEmpty()){
            fila.removerInicio();
            this.primeiro = fila.getInicio();
            this.ultimo = fila.getFim();
        }
        else{
            System.out.println("Fila está vazia, impossível remover!!");
            System.exit(0);
        }
        
    }

    // Retorna o primeiro da fila
    public No<Type> getPrimeiro(){
        return this.primeiro;
    }

    // Retorna o ultimo da fila
    public No<Type> getUltimo(){
        return this.ultimo;
    }   

    @Override
    public String toString() {
        String str = "Fila: \n" + fila.toString();

        return str;
    }


}
