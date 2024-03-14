import  java.util.Scanner;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  


  
  public static void main(String[] args) {
  Calculadora calc = new Calculadora();
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int n1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = sc.nextInt();
    calc.subtracao(n1, n2);
    
    
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}