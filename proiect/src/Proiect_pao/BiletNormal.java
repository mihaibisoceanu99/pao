package Proiect_pao;

public class BiletNormal extends Bilete{

    public BiletNormal(int nrcursa, int pret) {
        super(nrcursa, pret);
    }

    public BiletNormal() {
    }
    public boolean type(){
        return false;
    }
}
