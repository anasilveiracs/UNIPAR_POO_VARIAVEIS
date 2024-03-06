ATIVIDADE 01
import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        double valorTres = 0.0;
     
        System.out.println("Informe o primeiro valor ");
        valorUm = scanner.nextDouble();
        
        System.out.println("informe o segundo valor");
        valorDois = scanner.nextDouble();
        
        System.out.println("informe o terceiro valor");
        valorTres = scanner.nextDouble();
        
        double valorTotal = valorUm + valorDois + valorTres;
        
        System.out.println("o valor somado eh" + valorTotal);

        scanner.close();
}
}


ATIVIDADE 02

import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        
     
        System.out.println("Informe o primeiro valor ");
        valorUm = scanner.nextDouble();
        
        System.out.println("informe o segundo valor");
        valorDois = scanner.nextDouble();
        
        
        double valorTotal = valorUm - valorDois;
        System.out.println("o valor subtraido eh: " + valorTotal);

        scanner.close();
    }
}

ATIVIDADE 03

import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
      
     
        System.out.println("Informe o primeiro valor ");
        valorUm = scanner.nextDouble();
        
        System.out.println("informe o segundo valor");
        valorDois = scanner.nextDouble();
        
        
        double valorTotal = (valorUm + valorDois) / 2;
        
        System.out.println("o valor dividido eh" + valorTotal);

        scanner.close();   
        
    }
    
}

ATIVIDADE 04

import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
        double valorTres = 0.0;
        double valorQuarto = 0.0;
     
        System.out.println("Informe o primeiro valor ");
        valorUm = scanner.nextDouble();
        
        System.out.println("informe o segundo valor");
        valorDois = scanner.nextDouble();
        
        System.out.println("informe o terceiro valor");
        valorTres = scanner.nextDouble();
        
        System.out.println("informe o quarto valor");
        valorQuarto = scanner.nextDouble();
        
        double valorTotal = (valorUm + valorDois + valorTres + valorQuarto) / 4;
        
        System.out.println("o valor dividido eh " +  valorTotal);

        scanner.close();
}
}

ATIVIDADE 05

import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valorUm = 0.0;
        double valorDois = 0.0;
       
     
        System.out.println("Informe o primeiro valor ");
        valorUm = scanner.nextDouble();
        
        System.out.println("informe o segundo valor");
        valorDois = scanner.nextDouble();
        
        double soma = valorUm + valorDois;
        double subtracao = valorUm - valorDois;
        double divisao = valorUm / valorDois;
        double multiplicacao = valorUm * valorDois;
     
     
        System.out.println("o valor somado eh " +  soma);
        System.out.println("o valor subtraido eh " +  subtracao);
        System.out.println("o valor dividido eh " +  divisao);
        System.out.println("o valor multiplicado eh " +  multiplicacao);

        scanner.close();
}
}

ATIVIDADE 06

import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nomeProduto = "";
        double valorProduto = 0.0;
        double descontoProduto = 0.0;
       
     
        System.out.println("Informe o nome produto");
        nomeProduto = scanner.nextLine();
        
        System.out.println("informe o valor do produto");
        valorProduto = scanner.nextDouble();
        
        System.out.println("informe o desconto do produto");
        descontoProduto = scanner.nextDouble();
        
        double porcentagemProduto = descontoProduto / 100;
        
        double novoValor = valorProduto - (porcentagemProduto * valorProduto); 
       
      
  
     
    
        System.out.println("o valor do produto com desconto ficara: " + novoValor); 

        scanner.close();
}
}


