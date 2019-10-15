public class Countries {
    public Country[] list;
    public Country[] newList;


    public Countries() {

        list = new Country[0];
    }

    public Countries(int length) {
        this.list = new Country[length];
    }


    public String getCapital(String cap) {
        if (cap == "1" || cap == "2" || cap == "3" || cap == "4" || cap == "5" || cap == "6" || cap == "7" || cap == "8" || cap == "9" || cap == "0") {
            System.out.println("Введите правильное название столицы!");
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].getCapital().equals(cap)) {
                return list[i].toString();
            }
            if (i == list.length) System.out.println("Не найдено");
        }

        return cap;
    }

    public void getSquare(double sortArea) {
        if (sortArea <= 0) {
            System.out.println("Введите правильное значение площади!");
        }
        for (int i = 0; i < list.length; i++) {
            if (this.list[i].area > sortArea) {
                System.out.println(list[i].toString());
            }

        }
    }
    public void delete(int pop){
        for (int i=0; i<list.length;i++){
            if (list[i].getPopulation()<pop){
                System.out.println(list[i].toString());
            }
        }
    }


    /*public void getContinent(String cont) {
        Country[] name = new Country[list.length];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getContinent().equals(cont)) {
                System.arraycopy(list, 0, name, 0, list.length);

            }

        }
    }

     */

        public void add (Country country,int position){
            this.list[position - 1] = country;

        }

    }
