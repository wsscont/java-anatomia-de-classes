import java.util.Scanner;
public class MudancaparaIrlanda {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Leitura do salário e dos benefícios
    System.out.println("Salario bruto: ");
    double salarioBruto = input.nextDouble();
    System.out.println("Benefícios: ");
    double beneficios = input.nextDouble();
    double imposto = 0;
    //TODO: Implemente as regras para o cálculo do imposto.
    if(salarioBruto <= 1100){
      imposto = (salarioBruto / 100) * 5;
    }else if(salarioBruto > 1100 && salarioBruto <= 2500){
      imposto = (salarioBruto / 100) * 10;
    }else if(salarioBruto > 2500){
      imposto = (salarioBruto / 100) * 15;
    }
    
    
    // Cálculo do salário líquido
    double salarioLiquido = salarioBruto - imposto + beneficios;
    
    //TODO: Imprimir o salário líquido com 2 casas decimais.
    System.out.printf("%.2f\n",salarioLiquido);
  }
}