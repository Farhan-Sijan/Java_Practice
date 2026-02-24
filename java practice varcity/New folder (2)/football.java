public class football{
   
    private String name;
    private int number;
    private int age;
    private String national;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setNumber(int number)
    {
        this.number=number;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setNational(String national)
    {
       this.national=national; 
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
    public int getAge()
    {
        return age;
    }
    public String getNational()
    {
        return national;
    }
    public void display()
{
        System.out.println("Name : "+name);
        System.out.println("Number : "+number);
        System.out.println("Age "+age);
        System.out.println("Natinality "+national);

}

}