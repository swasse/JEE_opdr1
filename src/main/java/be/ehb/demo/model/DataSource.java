package be.ehb.demo.model;

import java.util.HashSet;

public class DataSource {
    private static DataSource ourInstance = new DataSource();
    private HashSet<Evenement> evenementen;

    public static DataSource getInstance() {
        return ourInstance;
    }

    private DataSource() {
        evenementen = new HashSet<>();
    }

    public HashSet<Evenement> getEvenementen() {
        return evenementen;
    }

    public Evenement findById(int id){
        for(Evenement e : evenementen)
            if(e.getId() == id)
                return e;

        return null;
    }

    public void addEvenement(int id, String naam, String soort){
        Evenement temp = new Evenement(id, naam, soort);
        evenementen.add(temp);
    }

    public void addEvenement(Evenement e){
        evenementen.add(e);
    }
}
