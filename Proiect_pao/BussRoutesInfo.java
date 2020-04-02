package Proiect_pao;
import java.util.ArrayList;
import java.util.List;
public class BussRoutesInfo {

    private List<Station> Stations= new ArrayList<>();
    private int nr_route;

    public int get_nr_starting_points(){

        return Stations.size();
    }

    public void add_station(Station a)
    {
        Stations.add(a);
    }

    public void add_route(Route r,String b)
    {
        for(Station a:Stations)
            if((a.getLocalitate().toUpperCase()).equals(b.toUpperCase()))
            {
                a.add_curse(r);
                break;
            }

    }

    public void show_stations()
    {
        for(Station a:Stations)
            a.display();
    }

    public Station get_station(String a)
    {
        for(Station b:Stations)
        {
            if((b.getLocalitate().toUpperCase()).equals(a.toUpperCase()))
                return b;
        }
        return  null;
    }

    public void delete_station(String  a)
    {
        int i;
        for(i = 0; i < Stations.size(); i+=1)
            if((Stations.get(i).getLocalitate().toUpperCase()).equals(a.toUpperCase()))
            {
                Stations.remove(i);
                break;
            }
    }


    public void delete_route(int nr_route)
    {
        for(Station a:Stations)
        {

            for(Route i:a.curse)
                if(nr_route == i.getNumber())
                {
                    a.curse.remove(i);
                    break;
                }
        }
    }

    public void route_to_destination(String destination)
    {
        for(Station a:Stations)
        {
            if((a.getLocalitate().toUpperCase()).equals(destination.toUpperCase()))
            {
                for(Route b:a.curse)
                    System.out.print(b.getNumber() + " " );
            }


        }

        System.out.println();
    }

    public void allstations_of_route(int nr_route)
    {
        this.nr_route = nr_route;
        for(Station a:Stations)
        {

            for(Route i:a.curse)
            {
                if (i.getNumber() == nr_route)
                    a.display();
            }
        }
    }


    public void common_routes(String a, String b)
    {
        Station city1 = get_station(a);
        Station city2 = get_station(b);

       for(Route i:city1.curse)
        {
            for(Route j:city2.curse)
            {
                if( i.getNumber() == j.getNumber())
                {
                    System.out.print(i.getNumber() + " ");
                }
            }
        }

        System.out.println();
    }


}
