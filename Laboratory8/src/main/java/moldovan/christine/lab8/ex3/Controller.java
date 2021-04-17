package moldovan.christine.lab8.ex3;

import java.util.ArrayList;

public class Controller {
    String stationName;

    //todo Modify the application so that a controller can communicate with an unlimited number of neighbor controllers
    ArrayList<Controller> neighbourController = new ArrayList<>();

    //storing station train track segments
    ArrayList<Segment> list = new ArrayList<>();

    public Controller(String gara) {
        stationName = gara;
    }

    void setNeighbourController(Controller v){
        neighbourController.add(v);
    }

    void addControlledSegment(Segment s){
        list.add(s);
    }

    /**
     * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
     */
    int getFreeSegmentId(){
        for(Segment s:list){
            if(s.hasTrain()==false)
                return s.id;
        }
        return -1;
    }

    void controlStep(){
        //check which train must be sent

        for(Segment segment:list){
            if(segment.hasTrain()){
                Train t = segment.getTrain();
                for(Controller c: neighbourController) {
                    if (t.getDestination().equals(c.stationName)) {
                        //check if there is a free segment
                        int id = c.getFreeSegmentId();
                        if (id == -1) {
                            System.out.println("Trenul +" + t.name + "din gara " + stationName + " nu poate fi trimis catre " + c.stationName + ". Nici un segment disponibil!");
                            return;
                        }
                        //send train
                        System.out.println("Trenul " + t.name + " pleaca din gara " + stationName + " spre gara " + c.stationName);
                        segment.departTrain();
                        c.arriveTrain(t, id);
                    }
                }
            }
        }//.for

    }//.


    public void arriveTrain(Train t, int idSegment){
        for(Segment segment:list){
            //search id segment and add train on it
            if(segment.id == idSegment)
                if(segment.hasTrain()==true){
                    System.out.println("CRASH! Train "+t.name+" collided with "+segment.getTrain().name+" on segment "+segment.id+" in station "+stationName);
                    return;
                }else{
                    System.out.println("Train "+t.name+" arrived on segment "+segment.id+" in station "+stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        //this should not happen
        System.out.println("Train "+t.name+" cannot be received "+stationName+". Check controller logic algorithm!");

    }


    public void displayStationState(){
        System.out.println("=== STATION "+stationName+" ===");
        for(Segment s:list){
            if(s.hasTrain())
                System.out.println("|----------ID="+s.id+"__Train="+s.getTrain().name+" to "+s.getTrain().destination+"__----------|");
            else
                System.out.println("|----------ID="+s.id+"__Train=______ catre ________----------|");
        }
    }
}
