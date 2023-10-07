package exercise6;

import java.util.ArrayList;

public class anagram {
    private String str1;
    public anagram(String str1){
        this.str1 = str1;
    }
    public void setAnagram(){
        String[] Works = str1.split(" ");
        ArrayList<String> str3 = new ArrayList<>();
        for(int i = Works.length -1; i>=0;i--){
            str3.add(Works[i]);
        }
        System.out.println("sau khi đao từ " );
        for(String i : str3){
            System.out.print(i + " ");
        }
     }
}
