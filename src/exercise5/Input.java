package exercise5;

import java.util.Scanner;

public class Input {
    private int n;
    private int[] a;

    public void setN() {
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                System.out.println(" nhập số phần tử có trong mảng ");
                int num = input.nextInt();
                if(num < 2){
                    System.out.println(" vui lòng nhập lại ");
                    input.nextLine();
                }else {
                    n = num;
                    break;
                }
            }catch (Exception e){
                System.out.println(" vui lòng nhập lại ");
                input.nextLine();
            }
        }
    }

    public void setA() {
        Scanner input = new Scanner(System.in);
        a = new int[n];
        for(int i =0; i< n; i++){
            while (true) {
                try {
                    System.out.println(" nhập phần tử thứ : " + (i + 1));
                    int Num1 = input.nextInt();
                    if(Num1 < 0){
                        System.out.println(" vui lòng nhập lại ");
                        input.nextLine();
                    }else {
                        a[i] = Num1;
                        break;
                    }
                }catch (Exception e){
                    System.out.println(" vui lòng nhập lại ");
                    input.nextLine();
                }
            }
        }
    }

    public void pushArray() {
        System.out.println(" mảng vừa nhập là ");
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public int[] getA() {
        return a;
    }
}
