package Lesson1;

public class Cosmos extends Course{

    private int cosmosDistance;

    public Cosmos(int distance){
        this.cosmosDistance = distance;
    }

    @Override
    public void doIt(Participant p) { p.flyInSpace(cosmosDistance);}
}
