public class start {
    public static void main(String[] args)
    {
        goal g=new goal();
        defender d=new defender();
        mid m=new mid();
        forward f=new forward();

         g.setName("Farhan");
         g.setNumber(21);
         g.setAge(24);
         g.setNational("Bangladesh");
         g.setSheet(1);
         g.display();
         System.out.println();

         d.setName("SSijan");
         d.setNumber(21);
         d.setAge(24);
         d.setNational("Bangladesh");
         d.settack(32);
         d.display();
         System.out.println();

         m.setName("Hasin");
         m.setNumber(21);
         m.setAge(24);
         m.setNational("Bangladesh");
         m.setAss(32);
         m.display();
         System.out.println();


         f.setName("Hasin");
         f.setNumber(21);
         f.setAge(24);
         f.setNational("Bangladesh");
         f.setGoal(32);
         f.display();

    }
}
