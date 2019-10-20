import java.util.Arrays;

public class Countries {

    public Country[] list;

    public Countries() {

        list = new Country[0];
    }

    public Countries(int length) {
        this.list = new Country[length];
    }


    public String getCapital(String cap) {

        for (int i = 0; i < list.length; i++) {

            if (list[i].getCapital().equals(cap)) {
                return list[i].toString();
            }
            if (i == list.length) return "Не найдено";
        }

        return cap;
    }


    public String getSquare(int sortArea) {
        if (sortArea <= 0) {
            return "Введите правильное значение площади!";
        }
        for (int i = 0; i < list.length; i++) {
            if (this.list[i].area < sortArea) {
                this.list[i].name = null;
                this.list[i].capital = null;
                this.list[i].continent = null;
                this.list[i].area = 0;
                this.list[i].population = 0;
            }

        }
        return Arrays.toString(list);
    }

    public String delete(int pop) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPopulation() > pop) {
                this.list[i].name = null;
                this.list[i].capital = null;
                this.list[i].continent = null;
                this.list[i].area = 0;
                this.list[i].population = 0;
            }

        }
        return Arrays.toString(list);
    }
    public String getContinent(String cont) {
        for (int i = 0; i < list.length; i++) {
            if (!(list[i].getContinent().equals(cont))) {
                this.list[i].name = null;
                this.list[i].capital = null;
                this.list[i].continent = null;
                this.list[i].area = 0;
                this.list[i].population = 0;
            }
        }
        return Arrays.toString(list);
    }


   public void add(Country country, int position) {
        this.list[position - 1] = country;

    }
    public String sortBySquare(int sort){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.length-1; i++) {
                if(list[i].getArea() > list[i+1].getArea()){
                    isSorted = false;

                    buf = list[i].id;
                    list[i].id = list[i+1].id;
                    list[i+1].id = buf;
                }
            }
        }
        return list.toString();
    }

}





