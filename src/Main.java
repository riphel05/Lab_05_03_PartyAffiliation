public class
Main {
    public static void main(String[] args) {
        String menu = "D - Democrat R - Republican I - Independent O - Other ";
        String menuChoice = "O";

        if(menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You chose Democrat, you get an elephant.");

        }
        else if(menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You chose Republican, you get a Donkey.");
        }
        else if(menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You chose Independent, you get a man.");
        }
        else if(menuChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You chose Other, you get a thought bubble");
        }

    }

}