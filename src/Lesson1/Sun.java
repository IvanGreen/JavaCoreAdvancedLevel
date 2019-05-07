package Lesson1;

public class Sun extends Course{

    private int sunHP;

    public Sun(int HP){
        this.sunHP = HP;
    }

    @Override
    public void doIt(Participant p) { p.hitTheSun(sunHP);}
}
