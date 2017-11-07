package mypackage;

import java.util.HashMap;

/**
 * Created by madalina.luca on 11/7/2017.
 */
public class CoffeMachine extends StateMachine {

    HashMapClass map = new HashMapClass();

    public CoffeMachine() {

        list = new HashMap<>();
        list = map.generateList();
        currentState = "0";
    }

    @Override
    String transition(String action) {
        super.transition(action);
        String value = map.getElement(currentState, action);
        if(value != null) {
            currentState = value;
        }
        System.out.println("Suma disponibila: "+currentState);
        return value;
    }
}
