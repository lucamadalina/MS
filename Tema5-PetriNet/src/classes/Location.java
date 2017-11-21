package classes;

public class Location {

    int tag;
    int noOfJ;

    Location(int locationTag, int locationNoOfJ){
        this.tag = locationTag;
        this.noOfJ = locationNoOfJ;
    }

    public void extract(int number){
        this.tag -= number;
    }

    public void add(int number){
        this.tag += number;
    }
}
