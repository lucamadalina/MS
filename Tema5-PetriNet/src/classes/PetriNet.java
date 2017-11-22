package classes;

import java.util.ArrayList;
import java.util.List;

public class PetriNet {

    List<Transition> transitionList = new ArrayList<>();
    List<Transition> currentTransitions = new ArrayList<>();
    PetriNet(){}
    public boolean exec(int action){
        Transition transition;
        boolean status = false;
        for(int i=0; i < transitionList.size(); i++){
            transition = transitionList.get(i);
            if(transition.tag == action){
               currentTransitions.add(transition);
               status = true;
            }
        }
        for (Transition currentTransition : currentTransitions) {
            currentTransition.exec();
        }
        if(status == true){
            return true;
        } else {
            return false;
        }


    }
}
