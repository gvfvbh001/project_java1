package exercise6;

import java.util.Scanner;

public class InputStr {
    private String str1;

    public void setStr1(){
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.println(" nhập chuổi kí tự muốn nhập");
                str1 = input.nextLine();
                break;
            }catch (Exception e){
                System.out.println(" nhập lại nào ");
                input.nextLine();
            }
        }
        System.out.println("chuổi vừa nhập là " + str1);
    }
    public String getStr1(){
        return str1;
    }
}
