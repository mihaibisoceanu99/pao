package lab2;

public class Person {
    private String name;
    private String surname;
    private String age;
    private long id;
    private String type;

    public Person(String n,String p,String age,long i,String f)
    {
        this.name = n;
        this.surname = p;
        this.age = age;
        this.id = i;
        this.type = f;
    }


    public void nameSetter(String n){
        this.name = n;
    }
    public void surnameSetter(String p){
        this.surname = p;
    }
    public void ageSetter(String age){
        this.age = age;
    }
    public void idSetter(long i){
        this.id = i;
    }
    public void functieSetter(String f){
        this.type = f;
    }

    public String nameGetter(){
        return this.name;
    }

    public String surnameGetter(){
        return this.surname;

    }
    public String ageGetter(){
        return this.age;
    }
    public String typeGetter(){

        return this.type;
    }

    public long idGetter(){

        return this.id;
    }

    public void show()
    {
        System.out.println(nameGetter());
        System.out.println(surnameGetter());
        System.out.println(ageGetter());
        System.out.println(idGetter());
        System.out.println(typeGetter());
    }
}

