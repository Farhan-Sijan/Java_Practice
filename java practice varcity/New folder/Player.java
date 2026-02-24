class Player {
    private String name;
    private int playerNumber;
    private int age;
    private String nationality;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Number: " + playerNumber + ", Age: " + age + ", Nationality: " + nationality);
    }
}
