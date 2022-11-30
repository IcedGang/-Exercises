package Lista2;

public class Data {
    private int dia, mes, ano;

    //Getters 
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
    private void setDia(int dia) {
        this.dia = dia;
    }
    
    private void setMes(int mes) {
        this.mes = mes;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public void inicializarData(int day, int mouth, int year){
        if(verData(day, mouth, year)){
            setDia(day);
            setMes(mouth);
            setAno(year);
        }
        else{
            System.out.println("DATA INVÁLIDA!!!");
            System.exit(0);
        }

    }
    
    private boolean verData(int day, int month, int year){
        //Verifica de Janeiro a Julho, exceto Fevereiro
        //meses pares vai até 30 ímpares até 31
        if(month > 0 && month < 8 && month != 2){
            if((month % 2) == 0){
                if(day > 0 && day <= 30)
                    return true;
                else
                    return false;
            }
            else{
                if(day > 0 && day <= 31)
                    return true;
                else
                    return false;
            }

        }

        //Verifica de Agosto a Dezembro
        //meses pares vai até 31 ímpares até 30
        if(month >= 8 && month <= 12){
            if((month % 2) != 0){
                if(day > 0 && day <= 30)
                    return true;
                else
                    return false;
            }
            else{
                if(day > 0 && day <= 31)
                    return true;
                else
                    return false;
            }

        }

        //Verifica o dia 29 de Fevereiro
        if(month == 2){
            if((year % 4 == 0 || year % 400 == 0) && (year % 100) != 0){
                if(day > 0 && day <= 29)
                    return true;
                else
                    return false;
            }
        }

        return false;

    }

    public void imprimeData(){
        System.out.printf("%02d/%02d/%04d\n", getDia(), getMes(), getAno());
    }

    public void imprimeDataExt(){
        String mouth[] = {"Janeiro", "Fevereiro", "Março", 
                          "Abril", "Maio", "Junho", 
                          "Julho", "Agosto", "Setembro", 
                          "Outubro", "Novembro", "Dezembro"};

        System.out.printf("%02d de %s de %04d\n", getDia(), mouth[getMes() - 1], ano);
        
    }

    
}