// parameteres: numerical values that are the temperatures in the unconverted unit (C,F)
// parameter type: double
// return: a double value that is the temperature in the converted unit

public class CtoFTester
{
  public static void main(String[] args)
  {
    System.out.println(celsiusToFahrenheit(4));
  }
  
  public static double celsiusToFahrenheit(double C)
  {
    return (C * 1.8) + 32;
  }
}
