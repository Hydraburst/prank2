import java.util.Scanner;

public class Main {
    public static Countries countries;
    public static CountriesAfterDel countriesAfterDel;

    public static void main(String[] args) {
        countriesAfterDel = new CountriesAfterDel(5);
        Scanner in = new Scanner(System.in);
        countries = new Countries(5);
        countries.add(new Country("Бразилия", "Бразилиа", "Южная Америка", 1, 1), 1);
        countries.add(new Country("США", "Вашингтон", "Северная Америка", 2, 2), 2);
        countries.add(new Country("Украина", "Киев", "Евразия", 3, 3), 3);
        countries.add(new Country("Болгария", "София", "Евразия", 4, 4), 4);
        countries.add(new Country("Молдавия", "Кишинев", "Евразия", 5, 5), 5);
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
                countries.delete(pop);
                break;

            case 2:
                System.out.println("Введите столицу: ");
                java.lang.String cap = in.next();
                countries.getCapital(cap);
                System.out.println(countries.getCapital(cap));
                break;
            case 3:
                System.out.println("Введите площадь: ");
                int sortArea = in.nextInt();
                countries.getSquare(sortArea);

        }


        /*System.out.println("Введите континент: ");
        java.lang.String cont = in.next();
        System.out.println("Введисте население: ");
        java.lang.String cap = in.next();
        System.out.println("Введите Площадь : ");
        int sortArea = in.nextInt();
        java.lang.String cont = in.next();*/
    }

}
