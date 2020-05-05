package Proiect_pao;

import java.util.ArrayList;
import java.util.List;

public abstract class Station {

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
    public String toString1(int nr,Orasplecaresosire b) {
        return localitate+","+nr+","+b;
    }


    public Station(String loc){

        localitate = loc;
        nr_puncte_de_plecare +=1;
        nr_startingpoint = nr_puncte_de_plecare;
        curse = new ArrayList<Route>();

    }
    public Station(String loc,Route c){

        localitate = loc;
        nr_puncte_de_plecare +=1;
        nr_startingpoint = nr_puncte_de_plecare;
        curse.add(c);

    }
    public String getLocalitate() {
        return localitate;
    }

    @Override
    public String toString() {
        return "Station{" +
                "localitate='" + localitate + '\'' +
                ", nr_startingpoint=" + nr_startingpoint +
                ", curse=" + curse +
                '}';
    }

    public void add_curse(Route n)
    {
        curse.add(n);

    }
/*
    public void f2(List<Route> n)
    {
        for(Route a:n) {
            curse.add(a);
        }

    }
*/
    public void f2(Route r,Station b,Station c)
    {
            c.add_curse(r);
            b.add_curse(r);

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
    abstract boolean type();
}
