package Homework_05_12_23;

public class Temperature {

    //celsius = 5*(fahrenheit - 32)/9)
    double celsius;
    double fahrenheit;
public Temperature( double celsius, double fahrenheit){
    this.fahrenheit = fahrenheit;
    this.celsius = celsius;
    celsius = 5*(fahrenheit-32)/9;
    return;
}
    public void getCelsius(){

        System.out.println(fahrenheit + " °F = " + celsius + " °C");


    }
}
