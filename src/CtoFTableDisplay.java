import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double userCelcius = SafeInput.getDouble(in, "What is the temperature in C");
        double userFahrenheit = CtoF(userCelcius);
        System.out.printf("%s%5.2f%s%5.2f%s","Your temperature is", userCelcius,"c -> ", userFahrenheit,"f");


        for(int i = -100; i <= 100; i++){
            System.out.println("\n");
            System.out.printf("%d%s%5s%10.2f%s",i,"c","->", CtoF(i),"f");
        }

    }
    public static double CtoF(double celcius)
    {
        double fahrenheit  = (celcius * 9/5) + 32;

        return fahrenheit;
    }
}