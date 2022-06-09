class Student
{
    String stuName;
    double rollNumber;
    String dateOfBirth;
    String branchName;
    String hostelName;
    String Section;
    String mobileNumber;
    String emailId;

    public void setStuName(String Name) 
    {
        this.stuName = Name;
    }

    public void setRollNumber(double rollNumber) 
    {
        this.rollNumber = rollNumber;
    }

    public void setDateOfBirth(String dob) 
    {
        this.dateOfBirth = dob;
    }

    public void setBranchName(String branch) 
    {
        this.branchName = branch;
    }

    public void setHostelName(String hostel) 
    {
        this.hostelName = hostel;
    }

    public void setSection(String sec) 
    {
        Section = sec;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setMobileNumber(String mobileNumber) 
    {
        this.mobileNumber = mobileNumber;
    }

    public void printStudentDetails()
    {
        System.out.println("The Name of Student is " + stuName);
        System.out.println("The Roll Number of student is " + rollNumber);
        System.out.println("The Branch of Student is " + branchName);
        System.out.println("The Date of Birth is " + dateOfBirth);
        System.out.println("The Hostel of Student is " + hostelName);
        System.out.println("The Section of Student is " + Section);
        System.out.println("The Contact Number of student is " + mobileNumber);
        System.out.println("The Email Id is "+ emailId);
    }

    


}
