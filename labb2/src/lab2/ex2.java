package lab2;

public class ex2 {

    public static void main(String[] args)
    {
        Person x = new Person("John","Doe", "24",11234444L,"student");

        Person z = new Person("Jane","Roe", "56",2233444,"teacher");

        x.show();

        z.show();

        Room a = new Room("12A", "tech", 3);
        Room b = new Room("12B", "normal", 7);

        a.show();

        b.show();

        Subject one = new Subject("1","normal",2,"George","Abraham","56",123213L,"amb",12);

        Subject two = new Subject("2","tech",3,"Andrew","Abraham","58",12351213L,"pres",13);

        one.show();

        two.show();



    }
}