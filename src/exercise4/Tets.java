package exercise4;
public class Tets {
    public static void main(String[] args) {
        Input IP = new Input();
        IP.setN();
        int Num1 = IP.getA();
        int Num2 = IP.getB();
        FindUCLN FUCLN = new FindUCLN(Num1, Num2);
        FUCLN.Find();
    }
}