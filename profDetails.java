
public class profDetails extends sechedule
{
    int yearOfJoining;
    String deparment;
    String subject;
    String professorName;
    int experience;
    String qualification;
    
public profDetails(String professorName, int experience, String qualification, int yearOfJoining, String deparment,String subject) 
{
    super("15 Vivas", 3 , 12,"22/05/2022","07/07/2022");
    this.professorName = professorName;
    this.experience = experience;
    this.qualification = qualification;
    this.yearOfJoining = yearOfJoining;
    this.deparment = deparment;
    this.subject = subject;
}

public void printdetails()
    {
        System.out.println("The Professor name is " + professorName);
        System.out.println("Total experience of teaching is " + experience + "years");
        System.out.println("The Qualification of Professor is " + qualification);
        System.out.println("The Year of Joining is " + yearOfJoining);
        System.out.println("Professor teaches " + subject);
        System.out.println("Professor is from " + deparment + "Department");
        System.out.println();
    }

}


