public class management extends person 
{
    public String warden;
    public String hostelIncharge;
    private String messIncharge;
    public String food;
    protected String dateOfJoining;
    protected String Contactnum;
    protected String contactnumForLaundry;


    public void printManagementDetails()
    {
        System.out.println("The warden of hostel is " + warden);
        System.out.println("The Hostel Incharge is " + hostelIncharge);
        System.out.println("The Mess Incharge is" + messIncharge);
        System.out.println("The food in Mess is" + food);
        System.out.println("The Date of Joining " + dateOfJoining);
        System.out.println("The contact number of warden is " + Contactnum);
        System.out.println("The Contact number of Laundry is " + contactnumForLaundry);
    }


    public void setWarden(String warden) 
    {
        this.warden = warden;
    }


    public void setHostelIncharge(String hostelIncharge) 
    {
        this.hostelIncharge = hostelIncharge;
    }


    public void setMessIncharge(String messIncharge) 
    {
        this.messIncharge = messIncharge;
    }


    public void setFood(String food) 
    {
        this.food = food;
    }


    public void setDateOfJoining(String dateOfJoining) 
    {
        this.dateOfJoining = dateOfJoining;
    }


    public void setContactnum(String contactnum) 
    {
        Contactnum = contactnum;
    }


    public void setContactnumForLaundry(String contactnumForLaundry) 
    {
        this.contactnumForLaundry = contactnumForLaundry;
    }


}
