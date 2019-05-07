package Lesson1;

public class MainClass {
    public static void main(String[] args) {

        String teamOne = "Stark Team";
        String teamTwo = "Hydra Team";

        Participant[] participants = {
                new Participant(teamOne,"Nikolay","Alcholic",200,500,100),
                new Participant(teamOne,"Pavel","Ingener",250,500,360),
                new Participant(teamOne,"Vasya","Son of mother friend",600,600,600),
                new Participant(teamOne,"Denchik","Dragdealer",800,5,5),

                new Participant(teamTwo,"John","Costumer",40,200,50),
                new Participant(teamTwo,"Entony","Builder",200,500,100),
                new Participant(teamTwo,"Ghosty","Ghost",500,500,500),
                new Participant(teamTwo, "SpecialAgent","CIA Agent",20,30,20)};

        Course[] courses = {new Cosmos(100), new Sun(200),new backEarth(150)};

        for(Participant p: participants){
            p.teamInfo(p);
        }

        for(Participant p : participants){
            for(Course o : courses){
                o.doIt(p);
                if(!p.isActive()){
                    break;
                }
            }
        }
        for(Participant p : participants){
            if(p.isActive()){
                System.out.println(p.getName() + " Win");
            } else {
                System.out.println(p.getName() + " Lose");
            }
        }

        for(Participant p : participants){
            if(p.isActive()){
                System.out.println(p.getName() + " Passed the test");
            }
        }
    }

}
