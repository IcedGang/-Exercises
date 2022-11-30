import java.util.Scanner;

public class Exemplo1 {

    public static int LGH = 10;
    public static double STD_D = 5.4;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] values = new double[LGH];
        double average = 0;

        //Reading the values
        System.out.println("Enter the Values");
        for(int count = 0; count < values.length; count++){
            values[count] = scnr.nextDouble();
            average += values[count];
        }
        scnr.close();

        //Printing the values
        System.out.println();
        average /= LGH;
        for(int count = 0; count < values.length; count++){
            System.out.println("Value[" + count + "]: " + values[count]);
        }

        System.out.println();
        System.out.println("Average Value: " + average);
        System.out.println("Standart Deviation: " + STD_D);

        //Operating Condition
        System.out.println();
        boolean funct = (average - STD_D) < (STD_D * 0.1);

        if(!funct){
            System.out.println("Isn't Working!");
            return;
        }

        System.out.println("It's Working!");
        
        
    }
    
}
