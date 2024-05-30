import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("0 ->Rock \n1 ->Scissor \n2 ->Paper\nEnter choice: ");
        int usr=sc.nextInt();

        Random rn=new Random();
        int com=rn.nextInt(3);



        if(com==0 && usr==1 || com==1 && usr==2 || com==2 && usr==0){

            System.out.println("Computer is win!");
            System.out.println(" user entered :"+usr);
            System.out.println(" computer entered :"+com);
        }
        else if(com==1 && usr==0 || com==2 && usr==1 || com==0 && usr==2)
        {
            System.out.println("user is win");
            System.out.println(" user entered :"+usr);
            System.out.println(" computer entered :"+com);
        }
        else if(com==usr){
            System.out.println("game draw!");
            System.out.println(" user entered :"+usr);
            System.out.println(" computer entered :"+com);

        }
        else {
            System.out.println("please enter under range(0,1,2)");
        }
    }
}
