package Proiect_pao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Station.nr_puncte_de_plecare = 0;

        BussRoutesInfo i = new BussRoutesInfo();

        Scanner s = new Scanner(System.in);

        int a;
        do {System.out.println("Traseul este alcatuit din oras de plecare, oras de sosire si localitati intermediare, nu alte orase");
            System.out.println("1) Adauga statie");
            System.out.println("2) Numarul de statii: ");
            System.out.println("3) Adauga cursa");
            System.out.println("4) Afiseaza statii");
            System.out.println("5) Sterge cursa");
            System.out.println("6) Sterge statie");
            System.out.println("7) Cu ce cursa ajung in orasul ... sau localitatea ...?");
            System.out.println("8) Prin ce localitati trece autobuzul ...?");
            System.out.println("9) Cu ce ajung din localitatea/orasul ... in localitatea/orasul ...?");
            System.out.println("10) Exit");

            a = s.nextInt();
            switch(a){

                case 1:
                {
                    int b;
                    do{
                        System.out.println("1) Statie oras de unde se incep plecarile");
                        System.out.println("2) Statie intermediara din localitati");
                        System.out.println("3) Exit");
                        b=s.nextInt();
                        switch (b) {
                            case 1: {
                                String oras = s.next().concat(s.nextLine());
                                Station c = new OrasPlecare(oras);
                                // OrasSosire d = new OrasSosire(oras);
                                //orice oras din care se pleaca se si ajunge si invers
                                i.add_station(c);
                                break;
                            }

                            case 2: {
                                String l = s.next().concat(s.nextLine());
                                Station c = new LocalitateIntermediara(l);
                                i.add_station(c);
                                break;
                            }
                        }
                        }while(b != 3);
                            break;
                }

                case 2:
                {
                    System.out.println(Station.nr_puncte_de_plecare);
                    break;
                }

                case 3:
                {

                    System.out.println("Numar ruta: ");
                    int c = s.nextInt();
                    System.out.println("Nume statie plecare: ");
                    String d = s.next().concat(s.nextLine());
                    System.out.println("Nume statie sosire: ");
                    String e = s.next().concat(s.nextLine());
                    Station f = new Station(d);
                    Station g = new Station(e);

                    OrasPlecare q = new OrasPlecare(d);
                    OrasSosire p = new OrasSosire(e);

                    System.out.println("Adauga numar localitatile intermediare ");
                    int nr = s.nextInt();

                    System.out.println("Adauga localitatile intermediare ");
                    int j = 0;
                    List <LocalitateIntermediara> locin= new ArrayList<>();
                    for (; j < nr; j++)
                    {
                        String l= s.next().concat(s.nextLine());
                        LocalitateIntermediara loc = new LocalitateIntermediara(l);
                        locin.add(loc);

                    }

                    Route h=new Route(c,q,p,locin);
                    i.add_route(h,d);
                    i.add_route(h,e);
                    for(LocalitateIntermediara x:locin)
                    {
                        i.add_route(h,x.getLocalitate());
                    }
                    break;
                }

                case 4:
                {
                    i.show_stations();
                    break;
                }

                case 5:
                {
                    System.out.println("Adauga numarul rutei/cursei");
                    int n = s.nextInt();
                    i.delete_route(n);
                    break;
                }

                case 6:
                {
                    System.out.println("Adauga numele statie care va fi stersa: ");
                    String n = s.next().concat(s.nextLine());
                    i.delete_station(n);
                    break;
                }

                case 7:{

                    System.out.println("Adauga numele statiei: ");
                    String n = s.next().concat(s.nextLine());
                    i.route_to_destination(n);
                    break;
                }
                case 8:{

                    System.out.println("Adauga Numar ruta/cursa: ");
                    int n = s.nextInt();
                    i.allstations_of_route(n);
                    break;
                }
                case 9:
                {
                    System.out.println("Adauga 2 nume de statii: ");
                    String s1 = s.next().concat(s.nextLine());
                    String s2 = s.next().concat(s.nextLine());
                    i.common_routes(s1,s2);
                    break;
                }
            }
        } while (a != 10);
    }
}