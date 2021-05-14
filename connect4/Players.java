package assignment.connect4;

public class Players
{
    //Field
    private String name;
    private int playerNumber;

    //Constructor
    public Players(String name, int playerNum)
    {
        this.name = name;
        this.playerNumber = playerNum;
    }

    //Methods
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public int getPlayerNumber()
    {
        return playerNumber;
    }
}