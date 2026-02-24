public class forward extends football {
    private int goal;
    public void setGoal(int goal)
    {
        this.goal=goal;
    }
    public int getGoal()
    {
        return goal;
    }
    public void display()
    {
        super.display();
        System.out.println("Goal :  "+goal);
    }
}
