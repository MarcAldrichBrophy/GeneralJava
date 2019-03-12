class Calculations
{
    private String response;

    public Calculations()
    {

    }

    public String calcQuad(double a,double b,double c)
    {
        String calculatedValue = "";
        
        double answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        if (Double.isNaN(answer1) || Double.isNaN(answer2))
        {
            calculatedValue = ("Answer contains imaginary numbers");
        } 
        else
        {
            calculatedValue = "Your answers are: " + answer1 + " and " + answer2;
        } 
        return calculatedValue;

        
    }

    public String calcPythag(double a, double b, double c)
    {
        double answer = 0;

        if(a == 0)
        {
            answer = Math.pow(c,2) - Math.pow(b,2);
            answer = Math.sqrt(answer);
        }
        else if(b == 0)
        {
            answer = Math.pow(c,2) - Math.pow(a,2);
            answer = Math.sqrt(answer);
        }
        else if(c == 0)
        {
            answer = Math.sqrt( (Math.pow(a,2) + Math.pow(b,2)) );
        }
        return "Your answer for the missing side is: " + answer;
    }

    



}