package lista5;

public class ConversorEx {
    public static void main(String[] args) {
        double gram = 250; // 250 gramas
        double kilo = 5; // 5 kilos
        double pound = 10; // 10 libras
        double ounce = 12; // 12 onças

        System.out.println("\nConvertendo Grama: " + gram);
        System.out.println("Kilograma: " + Conversor.gramToKilogram(gram));
        System.out.println("Libra: " + Conversor.gramToPound(gram));
        System.out.println("Onça: " + Conversor.gramToOunce(gram));
 
        System.out.println("\nConvertendo Kilograma: " + kilo);
        System.out.println("Grama: " + Conversor.kilogramToGram(kilo));
        System.out.println("Libra: " + Conversor.kilogramToPound(kilo));
        System.out.println("Onça: " + Conversor.kilogramToOunce(kilo));

        System.out.println("\nConvertendo Libra: " + pound);
        System.out.println("Grama: " + Conversor.poundToGram(pound));
        System.out.println("Kilograma: " + Conversor.poundToKilogram(pound));
        System.out.println("Onça: " + Conversor.poundToOunce(pound));

        System.out.println("\nConvertendo Onça: " + ounce);
        System.out.println("Grama: " + Conversor.ounceToGram(ounce));
        System.out.println("Kilograma: " + Conversor.ounceToKilogram(ounce));
        System.out.println("Libra: " + Conversor.ounceToPound(ounce));

    }
}
