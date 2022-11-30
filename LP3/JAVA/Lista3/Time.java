package Lista3;

public class Time{
    private int hora, min, seg;

    // Construtor
    public Time(int hora, int min, int seg){
        // Verifica se o tempo é invalido
        if(!verTime(hora, min, seg)){
            System.out.println("Erro, Tempo inválido!!");
            System.exit(-1);
        }
        
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }
    
    // Getters
    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    // Setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    // Verifica se a hora está entre 00 e 12
    public boolean isAm(){
        if(getHora() < 12)
            return true;
        
        return false;
    }

    // Conta a quantidade de segundos
    public int cron(Time outroTime){
        int ax1, ax2, ax3;

        // Variáveis auxiliares para verificar se o tempo é no outro dia
        boolean info1 = outroTime.getHora() <= getHora();
        boolean info2 = outroTime.getMin() <= getMin();
        boolean info3 = outroTime.getSeg() <= getSeg();

        if(info1 && (info2 || info3)){
            ax1 = modulo(getHora() - outroTime.getHora());
            ax2 = modulo(getMin() - outroTime.getMin());
            ax3 = modulo(getSeg() - outroTime.getSeg());

            // Retorna quantidade de segundos até a hora do dia seguinte
            return (3600 * (24 - ax1)) + (ax2 * 60) + ax3;
        }
        
        ax1 = modulo(getHora() - outroTime.getHora());
        ax2 = modulo(getMin() - outroTime.getMin());
        ax3 = modulo(getSeg() - outroTime.getSeg());

        // Retorna a quantidade de segundo no mesmo dia
        return (ax1 * 3600) + (ax2 * 60) + ax3; 

    }

    // Adiciona n segundos ao tempo
    public void addSegundos(int seg){
        // verifica se a quantidade de segundos informada é invalida
        if(seg < 0){
            System.out.println("Erro, Tempo inválido!!");
            System.exit(-1);
        }
        
        // Adiciona ao atributo segundo
        setSeg(getSeg() + seg);
        
        // Se passar o max do segundo, adiciona ao atributo minuto
        if(getSeg() > 59){
            setMin(getMin() + (getSeg() / 60));
            setSeg(getSeg() % 60);
            
            // Se passar o max do minuto, adiciona ao atributo hora
            if(getMin() > 59){
                setHora(getHora() + (getMin() / 60));
                setMin(getMin() % 60);
                
                // Se passar o max da hora, a hora é em outro dia
                if(getHora() > 23){
                    setHora(getHora() % 24);
                }
            }
        }



    }

    // Tira o modulo da subtração dos tempos
    private int modulo(int n){
        if(n < 0)
            return (n * -1);
        
        return n;
    }

    // Verifica se o tempo é valido
    private boolean verTime(int hora, int min, int seg){
        if(hora < 0 || min < 0 || seg < 0)
            return false;
        
        if(hora > 23 || min > 59 || seg > 59)
            return false;
        
        return true;
    }

    // Imprime o Tempo formatado
    public void showTime(){
        System.out.printf("%02d:%02d:%02d\n", getHora(), getMin(), getSeg());
    }

    


}
