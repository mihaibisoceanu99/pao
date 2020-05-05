package Proiect_pao;

class Orasplecaresosire extends Station {

        public Orasplecaresosire(String a) {
                super(a);
        }

        public Orasplecaresosire() {
                super();
        }

        public boolean type() {
                return true;
        }

        @Override
        public String toString() {
                return localitate;
        }
}
