package src.com.kurs.lesson1a;

import java.io.BufferedReader;
import java.io.FileReader;

public class Files {
    public static void main(String[] args) {
        try(BufferedReader r=new BufferedReader(new FileReader("text.txt"))){
           String as=r.readLine();
           System.out.println(as);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
