public class documentDetails extends Student
{

    float percentin10th;
    float percentin12th;
    int jeeMainApplicationnum;
    double jeeMainPercentile;
    int jeeAdvanceRollnum;
    double aadharNum;

    
    public void setPercentin10th(float percentin10th) 
    {
        this.percentin10th = percentin10th;
    }

    public void setPercentin12th(float percentin12th) 
    {
        this.percentin12th = percentin12th;
    }

    public void setJeeMainApplicationnum(int jeeMainApplicationnum) 
    {
        this.jeeMainApplicationnum = jeeMainApplicationnum;
    }

    public void setJeeMainPercentile(double jeeMainPercentile) 
    {
        this.jeeMainPercentile = jeeMainPercentile;
    }

    public void setJeeAdvanceRollnum(int jeeAdvanceRollnum) 
    {
        this.jeeAdvanceRollnum = jeeAdvanceRollnum;
    }

    public void setAadharNum(double aadharNum) 
    {
        this.aadharNum = aadharNum;
    }

    public void printdata()
    {
        System.out.println("The Aadhar Number of " + stuName + " is " + aadharNum);
        System.out.println("The JEE Main Application Number of " + stuName + " is " + jeeMainApplicationnum );
        System.out.println("The JEE Advance Roll Number of " + stuName + " is " + jeeAdvanceRollnum);
        System.out.println("The JEE Main percentile of " + stuName + " is " + jeeMainPercentile);
        System.out.println("The 10th percentage of " + stuName + " is " + percentin10th);
        System.out.println("The 12th percentage of " + stuName + " is " + percentin12th);

    }
    
}
