import java.io.Console;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.util.Random;
import java.util.*;
import java.io.*;


class Main {

  public static void main(String[] args) throws IOException
  {

    Console cnsl;
    cnsl = System.console();
    Random rand = new Random(); //random function
    String again;
    final String ANSI_GREEN = "\u001B[32m"; //makes text green

    ArrayList<String> responses = buildList();

    System.out.print("loading");//prints out loading
    ResponseHandler response = new ResponseHandler("");

    //pauses the java program for 1000 milliseconds as it "loads".
    for(int i = 0 ; i < 3; i++)
    {
      try
      {
        Thread.sleep(750);
        System.out.print(". ");
      }
      catch(InterruptedException e) {
        System.out.println("InterruptedException");
      }
    }
    System.out.println("");
    
    //Asks the user to input a question (this is in the color green) to be answered by the program
    do
    {

      String userInput = cnsl.readLine(ANSI_GREEN + "Ask me a question? ");
      System.out.println(""); 
      System.out.print("Deciding"); //loads deciding for 750 milliseconds
      try
      {
        Thread.sleep(750);
        System.out.print(". ");
      }
      catch(InterruptedException e) {
        System.out.println("InterruptedException");
      }
      System.out.println("");
      System.out.println(responses.get(rand.nextInt(responses.size()))); 
      //gets random response and prints it from txt file.


      Stats stat = new Stats(1, userInput);

      stat.addQuestion(userInput);
      //Accesses more information to the user. (Incase the user forgot)
      String statAsk = cnsl.readLine("Would you like to see more information? (Y/N) ");
      statAsk = statAsk.toUpperCase();
      response.change_rep(statAsk);
      response.promptResponse();

      again = cnsl.readLine(ANSI_GREEN + "Would you like to ask another question? (Y/N) ");
      again = again.toUpperCase();
    } while(again.equals("Y")); //while loop to continue the program.
  }



  public static ArrayList<String> buildList() throws IOException 
  //takes a random response option from txt file
  {
    ArrayList<String> list = new ArrayList<>();
      
    Scanner infile = new Scanner(new File("Responses.txt"));
    while(infile.hasNext())
    {
      list.add(infile.nextLine());
    }

    infile.close();
    return list;
  }
  
}
