class Calculadora{
  int num1;
  int num2;
  int total;

  public void soma(int n1, int n2){
    System.out.println("Bem vindo a calculadora");
    System.out.println("Oporeção de soma");
    this.num1 = n1;
    this.num2 = n2;
    total = num1 + num2;
    System.out.println("O total da soma é: " + total);
   }
  public void subtracao(int n1, int n2){
  System.out.println("Oporeção de subtração");
  this.num1 = n1;
  this.num2 = n2;
  total = num1 - num2;
  System.out.println("O total da subtração é: " + total);
  }
  public void multiplicacao(int n1, int n2){
  System.out.println("Oporeção de multiplicação");
  this.num1 = n1;
  this.num2 = n2;
  total = num1 * num2;
  System.out.println("O total da multiplicação é: " + total);

  }
}
  