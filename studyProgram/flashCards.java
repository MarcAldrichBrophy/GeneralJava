import java.util.Scanner;
import java.util.ArrayList;

class flashCards {

    
    ArrayList<String> answers = new ArrayList<String>();
    ArrayList<String> questions = new ArrayList<String>();

    public static Scanner scanner = new Scanner(System.in);

    public flashCards()
    {

    }


    public void addQuestion(String __question) // adds question to list
    {
        questions.add(__question);
    }

    public void addAnswer(String __answer) // adds answer to list
    {
        answers.add(__answer);
    }

    public void startFlashcards() // starts flashcards
    {
        System.out.println("Starting flashcards.");

        int score = 0;

        for(int i = 0; i < questions.size(); i++)
        {
            System.out.println(questions.get(i));
            String userInput = scanner.nextLine();

            if(userInput.equals(answers.get(i)))
            {
                System.out.println("Correct!");
                score++;
            }
            else if(userInput.equals("stop"))
            {
                System.out.println("stop not added yet.");
                break;
            }
            else
            {
                System.out.println("Incorrect, the right answer is: " + answers.get(i));
            }
        }
        System.out.println("Your score was " + score + "/" + questions.size());

    }


}