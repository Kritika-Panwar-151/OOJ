interface staff
{
    void work();//Interface methods are always public
}

class doctor implements staff
{
    @Override
    public void work()//Implementing interface methods should be public
    {
        System.out.println("Doctor:Perform surgeries or medical procedures.");
    }
}

class nurse implements staff
{
    @Override
    public void work()//Implementing interface methods should be public
    {
        System.out.println("Nurse:Give medications and injections.");
    }
}

class technician implements staff
{
    @Override
    public void work()//Implementing interface methods should be public//Implementing 
    {
        System.out.println("Technician:Operate medical equipment.");
    }
}

public class hospital
{
    public static void main(String[] args)
    {
        staff o1[]={new doctor(),new nurse(),new technician()};
        for(staff i:o1)
        {
            i.work();
        }
    }
}