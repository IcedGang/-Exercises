package Poolista1;

//Questão 5 e 6

public class ContaBancariaSimplificada {
    public static String nomeDoCorrentista;
    public static double saldo;
    public static boolean contaEhEspecial;

    public void abreConta(String nome, double deposito, boolean ehEspecial){
        if(deposito < 0.0 && ehEspecial == true)
            deposito = 0.0;
        else{
            System.out.println("A conta não é epecial, portanto não se pode abrir uma conta com saldo negativo");
            System.exit(0);
        }
            
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEhEspecial = ehEspecial;
    }

    public void abreContaSimples(String nome){
        nomeDoCorrentista = nome;
        saldo = 0.0;
        contaEhEspecial = false;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if(contaEhEspecial){
            saldo -= valor;
    
        }
        else
            if(valor <= saldo){
                saldo -= valor;
            }
            else
                System.out.println("Saldo insuficiente!");

    }

    public void mostarDados(){
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.println("Saldo em conta: " + saldo);
        
        if(contaEhEspecial){
            System.out.println("A conta é especial!");
            if(saldo < 0.0)
                System.out.println("Saldo Negativo!");
                
        }
        else
            System.out.println("A conta não é especial!");

    }

}
