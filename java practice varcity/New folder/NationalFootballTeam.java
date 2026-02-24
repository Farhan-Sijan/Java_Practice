public class NationalFootballTeam {
 
    public static void main(String[] args) {
  

        Goalkeeper gk = new Goalkeeper();
        gk.setName("Emrul");
        gk.setPlayerNumber(1);
        gk.setAge(30);
        gk.setNationality("England");
        gk.setCleanSheets(15);
		gk. displayInfo(); 
    

        Defender df = new Defender();
        df.setName("sijan");
        df.setPlayerNumber(4);
        df.setAge(28);
        df.setNationality("USA");
        df.setTacklesMade(50);
		df. displayInfo(); 
    
        Midfielder mf = new Midfielder();
        mf.setName("emon");
        mf.setPlayerNumber(8);
        mf.setAge(25);
        mf.setNationality("Germany");
        mf.setAssists(12);
      mf. displayInfo(); 

        Forward fw = new Forward();
        fw.setName("hasan");
        fw.setPlayerNumber(9);
        fw.setAge(27);
        fw.setNationality("Brazil");
        fw.setGoalsScored(20);
      fw. displayInfo(); 

      
    }
}