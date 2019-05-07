package Lesson1;

public class backEarth extends Course{

    private int backEarth;

    public backEarth(int distance){
        this.backEarth = distance;
    }

    @Override
    public void doIt(Participant p) { p.tryBackEarth(backEarth);}
}
