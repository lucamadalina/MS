package classes;

import java.util.ArrayList;
import java.util.List;

public class PetriNet {

    List<Transition> transitionList = new ArrayList<>();

    PetriNet(){}
    public boolean exec(int action){
        Transition transition;
        boolean status = false;
        for(int i=0; i < transitionList.size(); i++){
            transition = (Transition) transitionList.get(i);
            if(transition.tag == action){
               transition.exec();
               status = true;
            }
        }
        if(status == true){
            return true;
        } else {
            return false;
        }
    }
}
