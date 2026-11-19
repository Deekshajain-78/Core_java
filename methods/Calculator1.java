class Calculator1 {
  int c;

  void add(int a, int b) {
    int c = a + b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    Calculator1 cal = new Calculator1();
    int num1 = 20;
    int num2 = 30;
    cal.add(num1, num2);
  }
}