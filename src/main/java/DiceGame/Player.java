package DiceGame;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }
    public Player(){
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printPlayerInfo() {

        System.out.println("**************************************");
        System.out.println("The player's name is " + name);

    }

}
