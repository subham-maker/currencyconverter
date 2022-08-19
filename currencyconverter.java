import java.util.*;
import java.text.*;

public class currencyconverter{
    
public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat objusa=NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat objind=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
    NumberFormat objchi=NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat objfra=NumberFormat.getCurrencyInstance(Locale.FRANCE);

    String us=objusa.format(payment);
    String india=objind.format(payment);
    String china=objchi.format(payment) ;
    String france=objfra.format(payment);

       
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
