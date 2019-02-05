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
        while(stones>0){
            System.out.println("Please enter a number between 1 and 3");
            int number=input.nextInt();
            int comp=(int)(Math.random()*max)+min;
            System.out.println("The computer picked up "+comp+" stones");
            stones-=(number+comp);
            System.out.println("The total number of stones is "+stones);
        }
        
    }
}