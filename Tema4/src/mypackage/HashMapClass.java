package mypackage;

import java.util.HashMap;


/**
 * Created by madalina.luca on 11/7/2017.
 */
public class HashMapClass {
    
    private static HashMap<String,HashMap<String, String>> outerMap;
    private static HashMap<String,String> innerMap;

    public HashMapClass() {
        outerMap = new HashMap<>();
    }
    public HashMap<String, HashMap<String, String>> generateList(){
        HashMapClass map = new HashMapClass();
        map.addElement("0","5", "5");
        map.addElement("0","10", "10");
        map.addElement("5","5", "10");
        map.addElement("5","10", "15");
        map.addElement("10","5", "15");
        map.addElement("10","c1", "0");
        map.addElement("15","c1", "5");
        map.addElement("15","c2", "0");
        return outerMap;
    }

    public void addElement(String key1, String key2, String value) {
        innerMap=outerMap.get(key1);
        if (innerMap==null) {
            innerMap = new HashMap<>();
            outerMap.put(key1,innerMap);
        }
        innerMap.put(key2,value);
    }

    public String getElement(String key1, String key2) {
        innerMap = outerMap.get(key1);
        if (innerMap==null) {
            return null;
        }
        return innerMap.get(key2);
    }
}
