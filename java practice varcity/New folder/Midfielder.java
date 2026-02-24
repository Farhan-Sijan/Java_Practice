class Midfielder extends Player {
    private int assists;

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Assists: " + assists);
    }
}