import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        int valorCelsius = 0;
        double valorFahrenheit = 0.0;
        
        System.out.println("Informe o valor para converter em Celsius");
    valorCelsius= scanner.nextInt();
    
    
    
    valorFahrenheit =(valorCelsius * 9/5) + 32;
    
    System.out.println ("O valor convertido eh " + valorFahrenheit);
    
    scanner.close();
        
    }
    
}
     
