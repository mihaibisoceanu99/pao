package Proiect_pao;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private int number;
    private OrasPlecare oras_plecare;
    private OrasSosire oras_sosire;
    private List<LocalitateIntermediara> loc= new ArrayList<>();

    public Route() {

        this.oras_plecare = null;
        this.oras_sosire = null;
        this.loc = new ArrayList<>();
    }

    public Route(int n,OrasPlecare a, OrasSosire b, List<LocalitateIntermediara> c)
    {
        number = n;
        this.oras_plecare = a;
        this.oras_sosire = b;
        for(LocalitateIntermediara i:c)
            loc.add(i);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOras_sosire(OrasSosire oras_sosire) {
        this.oras_sosire = oras_sosire;
    }

    public void setOras_plecare(OrasPlecare oras_plecare) {
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
