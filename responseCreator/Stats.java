class Stats {
    private int totalAsked;
    private String previousQuestion;

    //stat constructor
    public Stats(int totalAsked, String previousQuestion)
    {
        this.totalAsked = totalAsked;
        this.previousQuestion = previousQuestion;
    }

    // gets the users last question.
    public String getLastQuestion()
    {
        return this.previousQuestion;
    }
    // gets the users total number of questions asked.
    public int getTotal()
    {
        return this.totalAsked;
    }

    //adds a question to the users stats
    public void addQuestion(String question)
    {
        this.previousQuestion = question;
        this.totalAsked++;
    }

    //sends a reply to the user.
    public String getReply()
    {
        String newString = "You have asked " + Integer.toString(this.totalAsked) + " question(s), with your previous question being: '" + this.previousQuestion + "'";
        if(totalAsked == 0)
        {
            newString = "You didn't ask any questions yet.";
        }
        return newString;
    }


}
