package Proiect_pao;

import java.util.List;

public class LocalitateIntermediara extends Station {
    public LocalitateIntermediara(String a) {
        super(a);
    }

    public LocalitateIntermediara(){
        super();
    }
    public boolean type(){
        return false;
    }



    @Override
    public String toString() {
        return localitate+"";
    }
}
