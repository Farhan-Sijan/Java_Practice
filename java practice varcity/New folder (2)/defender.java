public class defender extends football{

    private int tack;

    public void settack(int tack)
    {
        this.tack=tack;
    }
    public int getTack()
    {
        return tack;
    }
    public void display()
    {
        super.display();
        System.out.println("Tack :  "+tack);
    }
    
}
