import java.util.Scanner;

public class twentyOnePickup
{
    public static void main(String[] args)
    {
        pickup();
    }

    public static void pickup(){
        Scanner input=new Scanner(System.in);      
        int max=3;
        int min=1;
        int stones=21;
        boolean win=true;
        while(stones>0){
            System.out.println("Please enter a number between 1 and 3");
            int number=input.nextInt();
            stones-=number;
            if(stones>0){
                int comp=(int)(Math.random()*max)+min;
                System.out.println("The computer picked up "+comp+" stones");
                stones-=comp;
                System.out.println("The total number of stones is "+stones);
            }
            else
            {
                win=false;
            }
        }
        if(win==true){
            System.out.println("You win!");
        }
        else
        {
            System.out.println("You lose.");
        }
    }
}