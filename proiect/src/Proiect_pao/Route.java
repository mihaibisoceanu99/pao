package Proiect_pao;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private int number;
    private Orasplecaresosire oras_plecare, oras_sosire;
    private List<LocalitateIntermediara> loc= new ArrayList<LocalitateIntermediara>();
    private Bilete bilet;


    @Override
    public String toString() {
        return number +","+oras_plecare+","+oras_sosire+","+bilet.getPret();
    }


    public Route() {

        this.oras_plecare = null;
        this.oras_sosire = null;
        this.loc = new ArrayList<LocalitateIntermediara>();

    }

    public Route(int n, Orasplecaresosire a, Orasplecaresosire b, List<LocalitateIntermediara> c,Bilete d)
    {
        number = n;
        this.oras_plecare = a;
        this.oras_sosire = b;
        for(LocalitateIntermediara i:c)
            loc.add(i);
        this.bilet = d;

    }

    public Route(int n,Orasplecaresosire a, Orasplecaresosire b, Bilete c)
    {
        number = n;
        this.oras_plecare = a;
        this.oras_sosire = b;
        this.bilet = c;

    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setOras_sosire(Orasplecaresosire oras_sosire) {
        this.oras_sosire = oras_sosire;
    }

    public void setOras_plecare(Orasplecaresosire oras_plecare) {
        this.oras_plecare = oras_plecare;
    }


    public int getNumber() {
        return number;
    }

    public String getOras_plecare() {
        return oras_plecare.localitate;
    }

    public String getOras_sosire() {
        return oras_sosire.localitate;
    }

}
