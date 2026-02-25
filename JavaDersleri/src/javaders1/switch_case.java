package javaders1;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gün numarası girin (1-7): ");
        int day = scanner.nextInt();

       
        switch (day) {
            case 1:
            	System.out.println("Gün: " + day);
                
            case 2:
            	System.out.println("Gün: " + day);
                break;
            case 3:
            	System.out.println("Gün: " + day);
                break;
            case 4:
            	System.out.println("Gün: " + day);
                break;
            case 5:
            	System.out.println("Gün: " + day);
                
            case 6:
            	System.out.println("Gün: " + day);
                break;
            case 7:
            	System.out.println("Gün: " + day);
                break;
            default:
            	System.out.println("Gün: " + day);
                break;
        }

        
    }
}
