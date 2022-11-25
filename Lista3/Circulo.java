package Lista3;

public class Circulo {
    private int x, y, raio;

    public Circulo(int x, int y, int raio){
        if(!validaCirculo()){
            System.out.println("Erro, Círculo não pode ser criado!");
            System.exit(-1);
        }

        setX(x);
        setY(y);
        setRaio(raio);
    }

    // Getters e Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }


    private boolean validaCirculo(){
        if(raio < 0)
            return false;
        
        return true;
    }

    public boolean isInnerPoint(Ponto2D  ponto){
        if(ponto.getX() <= (getX() + getRaio()) && ponto.getY() <= (getY() + getRaio()))
            return true;
        
        return false;
    }

    public float area(){
        return (float) Math.PI * (getRaio() * getRaio());
    }

    public float circunferencia(){
        return (float) (2 * Math.PI) * getRaio();
    }

    public boolean isBigThan(Circulo circ){
        if(area() < circ.area())
            return false;
        
        return true;
    }

    public void imprimeCirculo(){
        System.out.println("Círculo (" + getX() + "," + getY() + ") de raio " + getRaio());
    }
    
}
