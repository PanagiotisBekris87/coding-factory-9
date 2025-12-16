package gr.aueb.cf.cf9.ch16.copy_constructor;

public class Student {
    private String name;
    private City city;

    public Student() {

    }

    public Student(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public Student (Student student) {
        this.name = student.name;
//        this.city = student.city;                     // shallow copy
        this.city = new City(student.getCity());        //deep copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
//        return city;        // Shallow copy
        return new City(this.city);
    }

    public void setCity(City city) {
        this.city = new City(city);
    }
}
