package classes;

import java.util.ArrayList;
import java.util.List;

public class Transition {
    int tag;
    List<Arc> listArcs = new ArrayList<Arc>();

    Transition(){}

    public Transition(int tag, List<Arc> list){
        this.tag = tag;
        this.listArcs = list;
    }
    public void exec(){
        if(isValid() == true){
            for(int i =0; i<listArcs.size(); i++){
                listArcs.get(i).update();
            }
        }
    }

    public boolean isValid(){
        boolean status = true;
        for(int i=0; i<listArcs.size(); i++){
            if(listArcs.get(i).isVaild() == false){
                status = false;
                break;
            }
        }
        if(status == true){
            System.out.println("Transition "+tag + " executed");
            return true;
        }else {
            System.out.println("Transition "+tag + " did not executed");
            return false;
        }
    }
}
