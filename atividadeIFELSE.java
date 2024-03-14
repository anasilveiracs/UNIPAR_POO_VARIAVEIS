ATIVIDADE 01
  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
        int idade = 0;

        
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();
        
     
        
       
        if( idade >= 18){
            System.out.println("Voce eh maior de idade");
        }else{
            System.out.println("Voce eh menor de idade");
        }
        
    }
}


ATIVIDADE 02

  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
        int numero = 0;

        
        System.out.println("Informe um numero: ");
        numero = sc.nextInt();
        
       
       
        if( numero % 2 == 0 ){
            System.out.println("Este numero eh par");
        }else{
            System.out.println("Este numero eh impar");
        }
        
    }
}


ATIVIDADE 03

  import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);


        String usuario = "usuario";
        String senha = "senha123";

        System.out.println("Informe seu usuario: ");
        usuario = sc.nextLine();
        System.out.println("Informe sua senha: ");
        senha = sc.nextLine();

        if(usuario.equals ("usuario") && senha.equals ("senha123")){
            System.out.println("Login efetuado com sucesso");
        }else{
            System.out.println("Login incorreto");
        }

    }
}

ATIVIDADE 04
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);


        int primeironumero = 0;
        int segundonumero = 0;

        System.out.println("Informe o primeiro numero:");
        primeironumero = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        segundonumero = sc.nextInt();

        if( primeironumero > segundonumero ){
            System.out.println("O primeiro numero eh o maior");
        }else{
            System.out.println("O segundo numero eh maior");
        }

    }
}

  
