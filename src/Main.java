import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static Countries countries;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        countries = new Countries(5);
        countries.add(new Country(1,"Бразилия", "Бразилиа", "Южная_Америка", 207353391, 8515767), 1);
        countries.add(new Country(2,"США", "Вашингтон", "Северная_Америка", 328915700 , 	9519431), 2);
        countries.add(new Country(3,"Украина", "Киев", "Евразия", 41840426,
                603549), 3);
        countries.add(new Country(4,"Болгария", "София", "Евразия", 7000000, 110994), 4);
        countries.add(new Country(5,"Молдавия", "Кишинев", "Евразия", 3550900, 33846), 5);
        System.out.println("Выберите пункт: ");
        System.out.println("1) Удаление из базы всех стран, у которых численность меньше заданной");
        System.out.println("2) Поиск по названию столицы");
        System.out.println("3) Поиск по занимаемой площади свыше заданной");
        System.out.println("4) Выдачу сведений о государствах заданного континента с выбором способа сортировки");
        System.out.println("5) Выход (в окно)");
        int swi = in.nextInt();

        switch (swi) {

            case 1:
                System.out.println("Введите кол-во населения: ");
                int pop = in.nextInt();
                System.out.println(countries.delete(pop));
                break;

            case 2:

                System.out.println("Введите столицу: ");
                java.lang.String cap = in.next();
                if (cap == "1" || cap == "2" || cap == "3" || cap == "4" || cap == "5" || cap == "6" || cap == "7" || cap == "8" || cap == "9" || cap == "0") {
                    System.out.println("Введите правильное название столицы!");
                }
                countries.getCapital(cap);
                System.out.println(countries.getCapital(cap));
                break;
            case 3:
                System.out.println("Введите площадь: ");
                int sortArea = in.nextInt();
                System.out.println(countries.getSquare(sortArea));
            case 4:

                System.out.println("Введите континент :");
                java.lang.String cont = in.next();
                System.out.println(countries.getContinent(cont));
                System.out.println("1) По площади");
            case 5:
                int sort = in.nextInt();
                countries.sortBySquare(sort);
                System.out.println(countries.sortBySquare(sort));
                break;
                //int swi1 = in.nextInt();
                //switch (swi1){

                  //  case 1:
                    //    int sortArea1 = in.nextInt();
                      //  countries.sortBySquare();
                    //System.out.println(countries.sortBySquare());
                    //break;

                }

        }

    }


