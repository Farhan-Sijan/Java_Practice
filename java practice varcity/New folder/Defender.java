class Defender extends Player {
    private int tacklesMade;

    public int getTacklesMade() {
        return tacklesMade;
    }

    public void setTacklesMade(int tacklesMade) {
        this.tacklesMade = tacklesMade;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tackles Made: " + tacklesMade);
    }
}
