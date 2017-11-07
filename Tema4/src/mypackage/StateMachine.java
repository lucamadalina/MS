package mypackage;

import java.util.HashMap;

/**
 * Created by madalina.luca on 11/7/2017.
 */
public class StateMachine {

    String currentState;
    HashMap<String, HashMap<String, String>> list;

    StateMachine() {}

    String transition(String action){
        return action;
    }
}
