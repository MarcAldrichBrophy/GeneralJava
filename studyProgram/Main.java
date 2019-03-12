import java.util.ArrayList;
import java.util.Scanner;

class Main 
{

    public static Calculations calculate = new Calculations();
    public static flashCards flashcards = new flashCards();
    public static ArrayList<String> applications = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        applications.add("Quadratic Formula");
        applications.add("Pythagorean formula");
        applications.add("Flashcards");
        startupEntries();


    }


    public static void pythagoreanInterface()
    {
        System.out.println("Enter a: ");
        int aValue = scanner.nextInt();
        System.out.println("Enter b: ");
        int bValue = scanner.nextInt();
        System.out.println("Enter c: ");
        int cValue = scanner.nextInt();
        System.out.println((calculate.calcPythag(aValue, bValue, cValue)));
    }


    public static void quadraticInterface()
    {
        System.out.println("Enter a: ");
        int aValue = scanner.nextInt();
        System.out.println("Enter b: ");
        int bValue = scanner.nextInt();
        System.out.println("Enter c: ");
        int cValue = scanner.nextInt();
        System.out.println((calculate.calcQuad(aValue, bValue, cValue)));
    }
    
    public static void flashcardsInterface()
    {
        String userInputA = "";
        String userInputB = "";
        while(true)
        {
            System.out.println("Enter flashcard side A (q to stop): ");
            userInputA = scanner.nextLine();
            if(userInputA.equals("q"))
            {
                break;
            }
            flashcards.addQuestion(userInputA);
            System.out.println("Enter flashcard side B (q to stop): ");
            userInputB = scanner.nextLine();
            if(userInputB.equals("q"))
            {
                break;
            }
            flashcards.addAnswer(userInputB);
        }
        flashcards.startFlashcards();
    }

    /*
    0:
    1:
    2:
    */
    public static void runApp(int input)
    {
        if(input == 0)
        {
            System.out.println("Running quadratic formula.");
            quadraticInterface();
        }
        else if(input == 1)
        {
            System.out.println("Running pythagorean theorem.");
            pythagoreanInterface();
        }
        else if(input == 2)
        {
            System.out.println("Starting flashcards.");
            flashcardsInterface();
        }
    }
    
    public static void startupEntries()
    {
        System.out.println("Choose which app you'd like to use. (By Number)");
        for(int i = 0; i < applications.size(); i++)
        {
            System.out.println(String.format("%s. %s", i, applications.get(i)));
        }
        try {
            int userInput = scanner.nextInt();
            runApp(userInput);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Invalid input.");
        }


    }

}