package exercise5;

public class Test {
  public static void main(String[] args){
      Input IP = new Input();
      IP.setN();
      IP.setA();
      IP.pushArray();
      int[] a = IP.getA();
      Sum SM = new Sum(a);
      SM.setSumMax();
      Find FD = new Find(a);
      int[] b = FD.getB();
      average AG = new average(b);
      AG.NumAverage();
  }
}
