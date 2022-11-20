import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final String menu = "A – Add an item to the list  D – Delete an item from the list  P – Print (i.e. display) the list  Q – Quit the program";
        boolean done = false;
        String cmd ="";

        do{
            displayList();
            
            cmd = SafeInput.getRegExString(in, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                    break;
                case "D":
                    break;
                case "P":
                    break;
                case "Q":
                    System.exit(0);
                    break;
            }


        }while(!done);

    }

    private static void displayList()
    {
        System.out.println("**********************************************************************");
        if(list.size() != 0)
        {
            for(int x = 0; x < list.size(); x++)
            {
                System.out.printf("%3d%35s", x+1, list.get(x));
            }
        }
        else
            System.out.println("***                          List is empty                         ***");
        System.out.println("**********************************************************************");
    }
}