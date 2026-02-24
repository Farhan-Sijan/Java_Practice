class Goalkeeper extends Player {
    private int cleanSheets;

    public int getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(int cleanSheets) {
        this.cleanSheets = cleanSheets;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Clean Sheets: " + cleanSheets);
    }
}