package Proiect_pao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Audit {
    private static Audit a = new Audit();

    private Audit() {
    }

    public static Audit getInstance() {
        return a;
    }
    public static void writeData(String c) throws IOException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String t = dateFormat.format(new Date());
        FileWriter out = new FileWriter("Data.csv", true);
        out.append(c+","+t);
        out.append("\n");
        out.flush();
        out.close();
    }
}
