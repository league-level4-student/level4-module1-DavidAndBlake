import java.util.Random;

public class Module1Checkpoint
{
    public static void main(String[]args){
        Random rand4 = new Random();
        int rando4 = (rand4.nextInt(5));
        switch (rando4){
            case 0:{
                System.out.println("first");
            }
            break;
            case 1:{
                System.out.println("second");
            }
            break;
            case 2:{
                System.out.println("third");
            }
            break;
            case 3:{
                System.out.println("fourth");
            }
            break;
            case 4:{
                System.out.println("fifth");
            }
            break;
        }
    }
}
