
class Calculator2 {
    int a = 50;
    int b = 40;

    int add() {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        Calculator2 cal = new Calculator2();

        int res = cal.add();

        System.out.println(res);
    }
}
