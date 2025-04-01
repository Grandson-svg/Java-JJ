import java.util.Random;
import java.util.Scanner;

public class  GuessingNumber{
    public static void main(String[] args) {
        int attempt=3;
        int tie=0,win=0,lost=0;
        
        Scanner scanner = new Scanner(System.in);
        int Computerpicknumber = 0;
        

        Random Computerpick = new Random();
       while(true){
        System.out.println("WOULD YOU LIKE TO PLAY THE GAME ? YES OR NO");
        String answer = scanner.nextLine().toUpperCase();

        if(answer.equalsIgnoreCase("NO")){
            System.out.println("OKAY BYE");
            scanner.close();
            return;
         }

         else if(answer.equalsIgnoreCase("YES")){
            System.out.println("LETS BEGIN");
            break;
         }

         else{
            System.out.println("PLEASE ENTER YES OR NO");
            continue;
         }

       }

       for(int round=1; round<=attempt;round++){

       System.out.println("ENTER A NUMBER BETWEEN 1 TO 100");
       int Playerguess=scanner.nextInt();
        Computerpicknumber = Computerpick.nextInt(100);

       if(Playerguess==Computerpicknumber){
        System.out.println("YOU WON");
        win++;
       }

       else if(Playerguess>Computerpicknumber){
        System.out.println("YOU LOST");
        System.out.println("NUMBER IS GREATER THAN COMPUTERPICK ");
        lost++;
       }
         
       else if(Playerguess<Computerpicknumber){
        System.out.println("YOU LOST");
        System.out.println("NUMBER IS LESS THAN COMPUTERPICK ");
        lost++;

       }
       else{
        System.out.println("PLEASE ENTER A NUMBER BETWEEN 1 TO 100");
    
       }
       System.out.println("You have "+(attempt-round)+" attempts left");
    }
        System.out.println("COMPUTER CHOSE "+ Computerpicknumber);
        System.out.println("YOU WON "+win+" TIMES");
        System.out.println("YOU LOST "+lost+" TIMES");
        System.out.println("YOU PLAYED "+attempt+" TIMES");
        
    }
}