package gr.aueb.cf.cf9.ch16.copy_constructor;

public class City {

    private String description;

    // default constructor
    public City () {

    }

    // overloaded constructor
    public City(String description) {
        this.description = description;
    }

    // Copy constructor!!!!!!
    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
