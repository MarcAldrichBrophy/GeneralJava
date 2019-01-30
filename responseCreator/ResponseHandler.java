//response constructor
    public ResponseHandler(String _response)
    {
      super(0,"");
      this._response = _response;
    }

    //gets the response type
    public String get_rep()
    {
        return this._response;
    }

    //changes the response.
    public void change_rep(String _rep)
    {
        _response = _rep;
    }

    //prompts a list of actions for the user to choose from.
    public void promptResponse()
    {
        if(get_rep().equals("Y"))
        {
            Console cnsl;
            cnsl = System.console();
            System.out.println("If you would like to see the amount of questions you asked so far, submit 1");
            System.out.println("If you would like to see your previous question, submit 2.");
            System.out.println("If you would like to see both, submit 3.");
            String responseInput = cnsl.readLine("Response: ");
            System.out.println(this.gatherInfo(responseInput));
        }
        else if(get_rep().equals("N"))
        {
            System.out.println("Continuing with program.");
        }
        else
        {
            System.out.println("Invalid response, continuing wth program");
        }
    }


    // gathers infromation from the users stats, and prints it out.
    private String gatherInfo(String response)
    {
        String newString = "";
        if(response.equals("1"))
        {
          newString = "You asked " + Integer.toString(super.getTotal()) + " questions so far.";
        }
        else if(response.equals("2"))
        {
            if(!super.getLastQuestion().equals(""))
            {
                newString = "Your last question was '" + super.getLastQuestion() + "'";
            }
            else
            {
                newString = "You didn't ask any questions yet.";
            }
        }
        else if(response.equals("3"))
        {
            newString = super.getReply();
        }
        else
        {
            newString = "Invalid response.";
        }
        return newString;
    }
}
