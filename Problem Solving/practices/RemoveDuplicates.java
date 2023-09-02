package practices;
import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicate(String str){
        String s = str;
        
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        sc.nextLine();
        for(int i = 0; i<n; i++){
            String str = sc.nextLine();
            
            System.out.println(removeDuplicate(str));
        }
    }
}
