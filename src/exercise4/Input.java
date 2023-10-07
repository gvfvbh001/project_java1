package exercise4;

import java.util.Scanner;

public class Input {
    private int a;
    private int b;
    public void setN(){
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.println(" nhập số đầu tiên ");
                int Num1 = input.nextInt();
                System.out.println("nhập số thứ 2");
                int Num2 = input.nextInt();
                if(a < 0 || b < 0){
                    System.out.println("vui lòng nhập lại ");
                    input.nextLine();
                }else {
                    a = Num1;
                    b = Num2;
                    break;
                }
            }catch (Exception e ){
                System.out.println("vui lòng nhập lại ");
                input.nextLine();
            }
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
