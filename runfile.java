public class runfile
{
    // Mostly things are explained in pdf and flowchart 
    public static void main(String[] args) 
    {
        // In this we are inputing professor details in construtor 
        System.out.println("PROFESSOR DETAILS");
        profDetails Prof1 = new profDetails("Ashok Gupta",6,"Phd in Mathematics",2016,"Mathematical Science","MA111");

        profDetails Prof2 = new profDetails("Vineet Subrmanyam Iyer",8,"Phd in Mathematics",2014,"Mathematical Science","MA104");

        profDetails Prof3 = new profDetails("Jethalal Champaklal Gada",6,"Phd in Philosophy",2015,"Philosophy","H105");

        profDetails Prof4 = new profDetails("Anurag Khambhoj",10,"Ranjee Trophy Selector",2012,"Sports","S111"); 

        profDetails Prof5 = new profDetails("Nityedra Oke",12,"NASA Eductor for 10 years",2010,"Physics","PHY 102");
    
        // Now , we are printing professor details
        Prof1.printdetails();
        Prof2.printdetails();
        Prof3.printdetails();
        Prof4.printdetails();
        Prof5.printdetails();

        // Printing academic schedule
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("ACADEMIC SCHEDULE");
        Prof1.printSchedule();

        // Inputing student details using setters
        documentDetails stud = new documentDetails();
        stud.setStuName("Aniket Sunil Ingle");
        stud.setRollNumber(21124005);
        stud.setBranchName("Mathematics and Computing");
        stud.setDateOfBirth("27/07/2003");
        stud.setHostelName("DhanrajGiri 2");
        stud.setSection("BA2");
        stud.setMobileNumber("7248928509");
        stud.setEmailId("aniketsunil.ingle.mat21@itbhu.ac.in");

        //Printing student details
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("STUDENET DETAILS");
        stud.printStudentDetails();

        stud.setAadharNum(1234567);
        stud.setJeeAdvanceRollnum(2341313);
        stud.setJeeMainApplicationnum(345214523);
        stud.setJeeMainPercentile(99.23244534);
        stud.setPercentin10th(96);
        stud.setPercentin12th(98);

        //Printing document details
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("DOCUMENT DETAILS");
        stud.printdata();

        //Printing management details briefly
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("MANAGEMENT DETAILS");

        management mm = new management();
        mm.setContactnum("7132944399");
        mm.setDateOfJoining(" 02/01/2007");
        mm.setContactnumForLaundry("8331325449");
        mm.setFood("Both Veg and Non-Veg");
        mm.setHostelIncharge("Ranchodas Chanchad");
        mm.setMessIncharge("Yash Trivedi");
        mm.setWarden("Ansh Chaudhary");

        mm.printManagementDetails();
        
    }
}


