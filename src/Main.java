public class Main
{
    public static void main(String[] args)
    {

        Person t = new Person ();
        t.name="arif";
        t.age = 25;
        Teacher p = new Teacher ();
        p.subject="english";
        Student s = new Student ();
        s.grade="A";

        t.display();
        p.display();
        s.display();


    }
}

