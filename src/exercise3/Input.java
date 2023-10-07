package exercise3;

import java.util.Scanner;

public class Input {
        private int  n;
        private  int[] a;
        public void setInputN(){
            Scanner input = new Scanner(System.in);
            while (true) {
                try {
                    System.out.println(" nhập vào số lớn nhất mà bạn muốn nhập ");
                    n = input.nextInt();
                    if(n < 0){
                        System.out.println(" vui lòng nhập lại  ");
                    }
                    break;
                } catch (Exception e){
                    System.out.println(" vui lòng nhập lại  ");
                }
            }
        }
        public int getInputN(){
            return n;
        }
}

