import java.util.Arrays;

public class CountriesAfterDel extends Countries {
    public CountriesAfterDel[] listAfterDel;


    public CountriesAfterDel(int length) {
        this.listAfterDel = new CountriesAfterDel[length];
    }

    public void delete(int pop) {
        if (pop <= 0) {
            System.out.println("Вы ввели ложное значение!");
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getPopulation() > pop) {
                System.out.println(list[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "CountriesAfterDel{" +
                "listAfterDel=" + (Arrays.toString(listAfterDel)) +
                '}';
    }
}

