package classes;

public class Arc {

    int capacitate;
    boolean directie;
    Location location;

    Arc(){}
    Arc(int capacitate, boolean direction, Location location){
        this.capacitate = capacitate;
        this.directie = direction;
        this.location = location;
    }

    public boolean isVaild(){
        if(this.directie == true) {
            if (capacitate < location.noOfJ) {
                return true;
            }
        } else {
            return true;
        }
        return false;
    }

    public void update(){
        if (this.directie == true){
            location.extract(capacitate);
        } else {
            location.add(capacitate);
        }
    }
}
