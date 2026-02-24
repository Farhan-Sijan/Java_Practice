public class goal extends football{
    private int sheet;

    public void setSheet(int sheet)
    {
        this.sheet=sheet;
    }
    public int getSheet()
    {
        return sheet;
    }
    public void display()
    {
        super.display();
        System.out.println("Clean Sheets :  "+sheet);
    }
}
