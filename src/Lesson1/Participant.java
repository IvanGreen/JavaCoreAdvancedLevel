package Lesson1;

public class Participant extends Team {

    String name;
    String type;

    int cosmosDistance;
    int sunHP;
    int backEarth;

    boolean active;

    public boolean isActive(){
        return active;
    }

    public String getName() {return name;}

    public Participant(String teamName, String name, String type, int cosmosDistance, int sunHP, int backEarth) {
        super(teamName);
        this.name = name;
        this.type = type;
        this.cosmosDistance = cosmosDistance;
        this.sunHP = sunHP;
        this.backEarth = backEarth;
        this.active = true;
    }

    public void flyInSpace(int flyable) {
        if (flyable <= cosmosDistance){
            System.out.println("Team member " + teamName + " by name " + name + " flew into space!");
        }else {
            System.out.println("Team member " + teamName + " by name " + name + " has not flown!");
            active = false;
        }
    }

    public void hitTheSun(int hit) {
        if (hit <= sunHP){
            System.out.println("Team member " + teamName + " by name " + name + " kill the Sun!");
        }else {
            System.out.println("Team member " + teamName + " by name " + name + " can't kill the Sun!");
            active = false;
        }
    }

    public void tryBackEarth(int back) {
        if (back <= backEarth){
            System.out.println("Team member " + teamName + " by name " + name + " returned to Earth!");
        }else {
            System.out.println("Team member " + teamName + " by name " + name + " could not return!");
            active = false;
        }
    }

    public void teamInfo(Participant p){
        System.out.println("In team: " + teamName + " present " + name + " which is: " + type);
    }
}
