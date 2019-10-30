package Dang_Ba_Hau;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = sc.nextInt();
        if(number<2){
            System.out.println(number+" is not a prime");
        }
        else {
            int i = 2;
            boolean check = true ;
            while (i <= Math.sqrt(number)){
                if(number % i == 0 ){
                    check = false;
                    break;
                }
                i++ ;
            }
            if(check){
                System.out.println(number+" is a prime");
            }
            else {
                System.out.println(number+" is not a prime");
            }
        }
    }
}
