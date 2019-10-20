import java.util.Comparator;


public class Country {
    String name;
    String capital;
    String continent;
    int population;
    int area;
    int id;

    static final String FORMAT = "%6.2f";


    public Country(int id, String name, String capital, String continent, int population, int area) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.population = population;
        this.area = area;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Страна: " + this.name + "     |" +
                "Континент: " + this.continent + "     |" +
                "Столица: " + this.capital + "     |" +
                "Численность: " + this.population + "     |" +
                "Площадь: " + this.area + '\n';
    }
}


