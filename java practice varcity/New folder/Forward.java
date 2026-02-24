class Forward extends Player {
    private int goalsScored;

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Goals Scored: " + goalsScored);
    }
}
