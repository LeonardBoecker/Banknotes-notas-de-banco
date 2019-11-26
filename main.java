//Java 8 (OpenJDK 1.8.0)
import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int cents = 0;
        int two = 0;
        int five = 0;
        int ten = 0;
        int twent = 0;
        int fifty = 0;
        int hundr = 0;
        
        int value = in.nextInt();
        int Value = value;
        // start to get the 100 reals notes if there is
        while(value >= 100){
            value = value - 100;
            hundr = hundr + 1;
        }
        //got the hundreds then I need to get the fifties
        while(value < 100 && value >= 50){
            value = value - 50;
            fifty = fifty + 1;
        }
        //got the fifties then I need to get the twenties
         while(value < 50 && value >= 20){
            value = value - 20;
            twent = twent + 1;
        }
        //got the twenties then I need to get the tens
         while(value < 20 && value >= 10){
            value = value - 10;
            ten = ten + 1;
        }
        //got the tens then I need to get the fives
         while(value < 10 && value >= 5){
            value = value - 5;
            five = five + 1;
        }
        //got the fives then I need to get the twos
        while(value < 5 && value >= 2){
            value = value - 2;
            two = two + 1;
        }
        //got the twos then I need to get the ones
         while(value < 2 && value >= 1){
            value = value - 1;
            cents = cents + 1;
        }
        
        System.out.println(Value);
        System.out.println(hundr + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twent + " nota(s) de R$ 20,00");
        System.out.println(ten   + " nota(s) de R$ 10,00");
        System.out.println(five  + " nota(s) de R$ 5,00");
        System.out.println(two   + " nota(s) de R$ 2,00");
        System.out.println(cents + " nota(s) de R$ 1,00");
    
    }
 
}
