package Lista2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato {
    private String nome, email, telefone;
    int dia, mes, ano;
    
    //Getters
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    //Setters
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private void setEmail(String email) {
        this.email = email;
    }
    
    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public void inicializarContato(String name, String email, String phone, int day, int month, int year){
        setNome(name);
        setEmail(email);
        setTelefone(phone);
        setDia(day);
        setMes(month);
        setAno(year);
    }
    
    public void imprimeContato(){
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.printf("Data de Nascimento: %02d/%02d/%02d\n", getDia(), getMes(), getAno());
        
    }

    //Não tá 100%, buga quando o mes é o mesmo
    public int calculaIdade(){
        Calendar nowDate = new GregorianCalendar();
        
        int dia = nowDate.get(Calendar.DAY_OF_MONTH); 
        int mes = nowDate.get(Calendar.MONTH); 
        int ano = nowDate.get(Calendar.YEAR); 
        int idade = ano - this.ano;

        if(this.mes <= mes){
            if(this.dia <= dia){
                return idade;
            }
        }

        return idade - 1;
    }


    

    

    

    

   

    

    


}
