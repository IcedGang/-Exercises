package Lista3;

public class Ponto2D {
    private double x, y;

    public Ponto2D(double x, double y){
        setX(x);
        setY(y);
    }

    //Getters
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    //Setters
    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }

    public void imprimePonto(){
        System.out.println("Ponto: (" + getX() + ", " +  getY()+ ")");
    }

    public boolean isEixoX(){
        if(this.y == 0)
            return true;
        
        return false;
    }

    public boolean isEixoY(){
        if(this.x == 0)
            return true;
        
        return false;
    }

    public boolean isEixos(){
        if(this.x == 0 && this.y == 0)
            return true;
        
        return false;
    }

    public int quadrante(){
        // Retorna 0 se estiver em qualquer eixo
        if(isEixos() || isEixoX() || isEixoY())
            return 0;
        
        // Retorna o quadrante
        if(this.x < 0){
            if(this.y < 0)
                return 3;
            else
                return 2;
        }
        else{
            if(this.y < 0)
                return 4;
            else
                return 1;    
        }
    
    }

    // Distância até o ponto 0
    public double distancia(){
        return Math.sqrt(((this.x - 0) * (this.x - 0)) + ((this.y - 0) * (this.y - 0)));
    }

}
