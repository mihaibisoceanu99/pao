package Proiect_pao;

import java.util.ArrayList;

public class Station {

    protected String localitate;
    static int nr_puncte_de_plecare;
    protected int nr_startingpoint;
    public ArrayList<Route> curse;

    public Station(){

        localitate = null;
        nr_puncte_de_plecare +=1;
        nr_startingpoint = nr_puncte_de_plecare;
        curse = new ArrayList<Route>();

    }



    public Station(String loc){

        localitate = loc;
        nr_puncte_de_plecare +=1;
        nr_startingpoint = nr_puncte_de_plecare;
        curse = new ArrayList<Route>();

    }

    public String getLocalitate() {
        return localitate;
    }

    public void add_curse(Route n)
    {
        curse.add(n);

    }

    public static int getNr_puncte_de_plecare() {
        return nr_puncte_de_plecare;
    }

    public int getNr_startingpoint() {
        return nr_startingpoint;
    }

    public void display()
    {
        System.out.print("localitate: " + localitate + "\n");
        System.out.print("curse: ");
        for(Route i:curse)
            System.out.print(i.getNumber() + " ");
        System.out.println();
    }
}
