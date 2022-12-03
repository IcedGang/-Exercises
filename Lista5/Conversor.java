package lista5;

// Questão 5

public class Conversor {
    
    // Grama
    // Grama --> Kilograma
    public static double gramToKilogram(double x){
        return x / 1000;
    }

    // Grama --> Libra
    public static double gramToPound(double x){
        return x / 453.6;
    }
    
    // Grama --> Onça
    public static double gramToOunce(double x){
        return x / 28.35;
    }

    // Kilograma
    // Kilograma --> Grama
    public static double kilogramToGram(double x){
        return x * 1000;
    }

    // Kilograma --> Libra
    public static double kilogramToPound(double x){
        return x * 2.205;
    }
    
    // Kilograma --> Onça
    public static double kilogramToOunce(double x){
        return x * 35.274;
    }

    // Libra
    // Libra --> Grama
    public static double poundToGram(double x){
        return x * 453.6;
    }

    // Libra --> Kilograma
    public static double poundToKilogram(double x){
        return x / 2.205;
    }
    
    // Libra --> Onça
    public static double poundToOunce(double x){
        return x * 16;
    }

    // Onça
    // Onça --> Grama
    public static double ounceToGram(double x){
        return x * 28.35;
    }

    // Onça --> Kilograma
    public static double ounceToKilogram(double x){
        return x / 35.274;
    }

    // Onça --> Libra
    public static double ounceToPound(double x){
        return x / 16;
    }
}
