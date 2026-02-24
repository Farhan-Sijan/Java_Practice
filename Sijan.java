public class Sijan {
    private String name;
    private int age;
    private String section;
    private String dept;
     private String course;

     public void setName(String nam)
     {
        name=nam;
     }
     public void setAge(int a)
     {
        age=a;
     }
     public void setSection(String sec)
     {
        section=sec;
     }
     public void setDept(String d)
     {
        dept=d;
     }
     public void setCourse(String c)
     {
        course=c;
     }
     public String getName()
     {
         return name;
     }
     public int getAge()
     {
         return age;
     }
     public String getSection()
     {
         return section;
     }
     public String getDept()
     {
         return dept;
     }
     public String getCourse()
     {
         return course;
     }

     public static void main(String [] args)
     {
        Sijan s1=new Sijan();
        Sijan s2=new Sijan();
        Sijan s3=new Sijan();
        Sijan s4=new Sijan();
        Sijan s5=new Sijan();

        s1.setName("Farhan");
        s1.setAge(21);
        s1.setSection("J");
        s1.setDept("CSE");
        s1.setCourse("Java");

        s2.setName("Emrul");
        s2.setAge(21);
        s2.setSection("A");
        s2.setDept("EEE");
        s2.setCourse("English");

        s3.setName("Sijan");
        s3.setAge(87);
        s3.setSection("D");
        s3.setDept("BAngla");
        s3.setCourse("Economy");

        s4.setName("Hasin");
        s4.setAge(43);
        s4.setSection("H");
        s4.setDept("CE");
        s4.setCourse("Math");

        s5.setName("Emon");
        s5.setAge(11);
        s5.setSection("S");
        s5.setDept("CSE");
        s5.setCourse("IP");

        Sijan stu[]=new Sijan[5];

        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;
        stu[3]=s4;
        stu[4]=s5;

        stu[0]=null;
        stu[1]=null;

        for(int i=0;i<5;i++)
        {
            if(stu[i] != null) 
            {
                System.out.println(stu[i].getName());
             
                System.out.println(stu[i].getAge());
            
                System.out.println(stu[i].getSection());
             
                System.out.println(stu[i].getDept());
              
                System.out.println(stu[i].getCourse());
            }
        }


     }

}
