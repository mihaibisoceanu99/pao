package lab2;

public class Subject {

    private Room room;
    private int noOfStudents;
    Person teacher;

    public Subject(String nr,String type, int floor,String name, String surname, String age, long id, String type2,int nrr)
    {
        room = new Room(nr,type,floor);
        teacher = new Person(name,surname,age,id,type2);
        noOfStudents = nrr;

    }

    public Room roomGetter()
    {
        return room;
    }


    public Person teacherGetter()
    {
        return teacher;
    }

    public int noGetter()
    {
        return noOfStudents;

    }

    public void show()
    {
        room.show();

        teacher.show();

        System.out.println(noOfStudents);

    }


}