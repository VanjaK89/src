package SGL;

import java.util.ArrayList;

public class LogisticManager {
    private ArrayList<Moveable> list = new ArrayList<>();

    public LogisticManager() {
        this.list = list;
    }
    public void add(Moveable m){
        list.add(m);
    }

    public void moveAll(String destination){
         for (Moveable m: list){
             m.move(destination);
         }

     }


}
