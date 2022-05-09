package SGL;
import java.util.ArrayList;
public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstandArrayLists = new ArrayList<>();

    public void addWasserstand(Wasserstand w){
        wasserstandArrayLists.add(w);
    }

    public Wasserstand findById(int id){

        for(Wasserstand w: wasserstandArrayLists){
            if(id == w.getId()){
                return w;
            }
        }
        return null;
    }
    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> erg = new ArrayList<>();
        for(Wasserstand w: wasserstandArrayLists){
            if(gewaesserName.equals(w.getGewaesserName())){
                erg.add(w);
            }
        }
        return erg;

    }
    public Wasserstand findLastWasserstand(){
        Wasserstand highestW = null;
        int Index = 0;
        for (Wasserstand w: wasserstandArrayLists){
            if(w.getZeitpunkt() > Index){
                Index = w.getZeitpunkt();
                highestW = w;

            }
        }
        return highestW;
    }
    public ArrayList<Wasserstand>findForAlarmierung(){
        ArrayList<Wasserstand> list = new ArrayList<>();
        for (Wasserstand w: wasserstandArrayLists){
            if(w.getMessWert() >= w.getMessWertFuerAlarmierung()){
                list.add(w);
                System.out.println(list);
            }

        }
        return list;
    }


}
