abstract class sechedule extends person
{
    String viva;
    int holidays ;
    int numberOfQuiz;
    String Midsem;
    String Endsem;
    
    public sechedule(String viva, int holidays, int numberOfQuiz, String midsem, String endsem) {
        this.viva = viva;
        this.holidays = holidays;
        this.numberOfQuiz = numberOfQuiz;
        Midsem = midsem;
        Endsem = endsem;
    }


    public void printSchedule()
    {
        System.out.println("The number of vivas in 2nd semester are " + viva);
        System.out.println("The number of holidays in whole semester is " + holidays);
        System.out.println("The total number of Quizzes in whole Semester are " + numberOfQuiz);
        System.out.println("The Date of Midsem is " + Midsem);
        System.out.println("The Date of Endsem is " + Endsem);
    }


}

