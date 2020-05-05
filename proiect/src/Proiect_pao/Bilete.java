package Proiect_pao;

public abstract class Bilete {
    private int nrcursa;
    private int pret;

    public Bilete(int nrcursa, int pret) {
        this.nrcursa = nrcursa;
        this.pret = pret;
    }
    public Bilete() {
        this.nrcursa = 0;
        this.pret = 0;
    }
    public int getNrcursa() {
        return nrcursa;
    }


    @Override
    public String toString() {
        return "pret=" + pret +
                '}';
    }

    public void setNrcursa(int nrcursa) {
        this.nrcursa = nrcursa;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
    abstract boolean type();
}
