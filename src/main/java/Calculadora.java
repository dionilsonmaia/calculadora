import java.util.Scanner;

class Calculadora{
  private int num1;
  private int num2;
  private int total;

Scanner ler = new Scanner(System.in);
//matodo menu
  
  //método para somar
  public void soma(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    int total;

    System.out.println("Calculadora de soma\n\nInsirao 1º nº: ");
    calc.setNum1(n1.nextInt());
    System.out.println("Insira o 2º nº: ");
    calc.setNum2(n1.nextInt());
    total = calc.getNum1() + calc.getNum2();
    System.out.println("A soma dos valores é: " + total);
    
  }

  //método para subtração
  public void subtracao(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    int total;

    System.out.println("Calculadora de subtração\n\nInsirao 1º nº: ");
    calc.setNum1(n1.nextInt());
    System.out.println("Insira o 2º nº: ");
    calc.setNum2(n1.nextInt());
    total = calc.getNum1() - calc.getNum2();
    System.out.println("A subtração dos valores é: " + total);
    
  }

  //método para multiplicação
  public void multiplicacao(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    int total;

    System.out.println("Calculadora de multiplicação\n\nInsirao 1º nº: ");
    calc.setNum1(n1.nextInt());
    System.out.println("Insira o 2º nº: ");
    calc.setNum2(n1.nextInt());
    total = calc.getNum1() * calc.getNum2();
    System.out.println("A multiplicação dos valores é: " + total);
    
  }
  //método para divisão
  public void divisao(){
    Scanner n1 = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    int total;

    System.out.println("Calculadora de divisão\n\nInsirao 1º nº: ");
    calc.setNum1(n1.nextInt());
    System.out.println("Insira o 2º nº: ");
    calc.setNum2(n1.nextInt());
    total = calc.getNum1() / calc.getNum2();
    System.out.println("A divisão dos valores é: " + total);
    
  }
public int getNum1() {
	return num1;
}
public void setNum1(int num1) {
	this.num1 = num1;
}
public int getNum2() {
	return num2;
}
public void setNum2(int num2) {
	this.num2 = num2;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
  
 

}
 
  