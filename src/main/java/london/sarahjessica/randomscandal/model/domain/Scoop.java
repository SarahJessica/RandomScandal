package london.sarahjessica.randomscandal.model.domain;


public class Scoop {

    private int scoops;

    Scoop(int scoops){
        this.scoops = scoops;
    }

    public int increaseScoops(){
        return this.scoops++;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }


}
