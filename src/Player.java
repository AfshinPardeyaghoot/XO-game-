public class Player {

    private String name ;
    private char playerCharacter ;
    private boolean isRound ;

    public Player(String name, char playerCharacter, boolean isRound) {
        this.name = name;
        this.playerCharacter = playerCharacter;
        this.isRound = isRound ;
    }

    public Player(String name , char playerCharacter){
        this.name = name ;
        this.playerCharacter = playerCharacter ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPlayerCharacter() {
        return playerCharacter;
    }

    public void setPlayerCharacter(char playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }
}
