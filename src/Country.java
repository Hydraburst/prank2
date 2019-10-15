public class Country implements Comparable <Country>{
    String name;
    String capital;
    String continent;
    int population;
    double area;

    static final String FORMAT = "%6.2f";
    public enum Continent{
        Евразия ,
        Южная_Америка ,




    }


    public Country(String name, String capital, String continent, int population, double area) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.population = population;
        this.area = area;
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

    public String toString() {
        return  "Страна: " + this.name + "     |" +
                "Континент: " + this.continent +"     |"+
                "Столица: "+  this.capital + "     |"+
                "Численность: "+ this.population + "     |" +
                "Площадь: " + String.format("%6.2f",this.area) ;
    }

    public int compareTo(Country o) {
        int result = toString().compareTo(o.toString());
        return result;
    }


}
