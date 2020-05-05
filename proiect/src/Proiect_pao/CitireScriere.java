package Proiect_pao;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CitireScriere {

    private static CitireScriere cs = new CitireScriere();

    private CitireScriere() {
    }

    public static CitireScriere getInstance() {
        return cs;
    }

    public static void writeOrasPS(Orasplecaresosire c) throws IOException {
        FileWriter out = new FileWriter("OrasPS.csv", true);
        out.append(c.toString());
        out.append("\n");
        out.flush();
        out.close();
    }
    public static void writeLocInt(LocalitateIntermediara c) throws IOException {
        FileWriter out = new FileWriter("Localitati_intermediare.csv", true);
        out.append(c.toString());
        out.append("\n");
        out.flush();
        out.close();
    }

    public static void writeRoute(Route c) throws IOException {
        FileWriter out = new FileWriter("Curse.csv", true);
        out.append(c.toString());
        out.append("\n");
        out.flush();
        out.close();
    }
    public static  void writeStationsWithRoutes(LocalitateIntermediara c,int a,Orasplecaresosire d) throws IOException
    {
        FileWriter out = new FileWriter("Statii+curse.csv", true);
        out.append(c.toString1(a,d));
        out.append("\n");
        out.flush();
        out.close();

    }



    public static List<Station> Citirestatii() {
        BufferedReader br = null;
        String split = ",";
        String line = "";
        ArrayList l = new ArrayList();

        try {
            br = new BufferedReader(new FileReader("OrasPS.csv"));

            while((line = br.readLine()) != null) {
                String[] info = line.split(split);
                l.add(new Orasplecaresosire(info[0]));
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        return l;
    }
    public static List<Station> Citirestatiinter() {
        BufferedReader br = null;
        String split = ",";
        String line = "";
        ArrayList l = new ArrayList();

        try {
            br = new BufferedReader(new FileReader("Localitati_intermediare.csv"));

            while((line = br.readLine()) != null) {
                String[] info = line.split(split);
                l.add(new LocalitateIntermediara(info[0]));
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        return l;
    }
    /*
    public static List<Station> Citirecurse() {
        BufferedReader br = null;
        String split = ",";
        String line = "";
        ArrayList<Route> l = new ArrayList<Route>();

        try {
            br = new BufferedReader(new FileReader("Curse.csv"));

            while((line = br.readLine()) != null) {
                String[] info = line.split(split);
                int nr = Integer.parseInt(info[0]);
                String a = info[1];
                String b = info[2];
                int pret = Integer.parseInt(info[3]);
                System.out.println(info[3]);
                Orasplecaresosire f = new Orasplecaresosire(a);
                Orasplecaresosire g = new Orasplecaresosire(b);
                BiletNormal h = new BiletNormal(nr,pret);
                Route d = new Route(nr,f,g,h);
                l.add(d);
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

        return l;
    }*/
    public static void CitesteCurse(BussRoutesInfo I) {
        BufferedReader br = null;
        String split = ",";
        String line = "";

        try {
            br = new BufferedReader(new FileReader("Curse.csv"));

            while((line = br.readLine()) != null) {
                String[] info = line.split(split);
                int nr = Integer.parseInt(info[0]);
                String a = info[1];
                String b = info[2];
                int pret = Integer.parseInt(info[3]);
               // System.out.println(info[3]);
                Orasplecaresosire f = new Orasplecaresosire(a);
                Orasplecaresosire g = new Orasplecaresosire(b);
                BiletNormal h = new BiletNormal(nr,pret);
                Route d = new Route(nr,f,g,h);
                I.add_route(d,a);
                I.add_route(d,b);




                /*String[] info = line.split(split);
                I.adaugaAutobuz(Integer.parseInt(info[1]), Integer.parseInt(info[0]));*/
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
    public static void CitesteCurse2(BussRoutesInfo I) {
        BufferedReader br = null;
        String split = ",";
        String line = "";

        try {
            br = new BufferedReader(new FileReader("Statii+curse.csv"));

            while((line = br.readLine()) != null) {
                String[] info = line.split(split);
                int nr = Integer.parseInt(info[1]);
                String a = info[0];
                String b = info[2];
               // int pret = Integer.parseInt(info[3]);
               // System.out.println(info[3]);
                Orasplecaresosire f = new Orasplecaresosire(a);
                Orasplecaresosire g = new Orasplecaresosire(b);
                BiletNormal h = new BiletNormal(nr,0);
                Route d = new Route(nr,f,g,h);
                I.add_route(d,a);




                /*String[] info = line.split(split);
                I.adaugaAutobuz(Integer.parseInt(info[1]), Integer.parseInt(info[0]));*/
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }
}
