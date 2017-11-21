package classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madalina.luca on 11/7/2017.
 */
public class CoffeMachine extends PetriNet {
    List<Transition> list = new ArrayList<Transition>();

    CoffeMachine() {
        super();
        create(0,1, 1, false, 1);
        create(0, 1, 1, false, 2);
        create(5,0, 1, true, 1);
        create(10, 0, 1, true, 2);
        create(5, 0, 1, false, 5);
        create(10, 0, 1, false, 4);
        create(15, 0, 1, true, 5);
        create(5, 0, 1, false, 3);
        create(10, 0, 1, true, 3);
        create(15, 0, 1, true, 4);
        create(10,1,1,true, 6);
        create(0,0,0, false,6);
        create(15, 1, 1, true, 7);
        create(0,0, 0, false, 7);
    }

    @Override
    public boolean exec(int action) {
        return super.exec(action);
    }

   public void create(int locationTag, int locationNoOfJ, int arcCapaciatate, boolean arcDirectie, int tagTransition){
        Location location = new Location(locationTag, locationNoOfJ);
        Arc arc = new Arc(arcCapaciatate, arcDirectie, location);
        Transition transition = new Transition();
        transition.tag = tagTransition;
        transition.listArcs.add(arc);
        list.add(transition);
   }
}
