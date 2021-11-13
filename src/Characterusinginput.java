

import java.util.Scanner;

   public class Characterusinginput {
    public static void main (String args[]){

        System.out.println("Enter the character:" );
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);

        if(Character.isUpperCase(input)){
            System.out.println("Character is Uppercase");
        }
        else{
            System.out.println("Character is Lowercase");
        }
    }
}


