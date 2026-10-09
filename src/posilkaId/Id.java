
import java.util.Scanner;

public class Id {
    private String city;
    private String street;
    private int house;
    private int number;
    private String name;
    private double price;

    public static Id[] ids;
    static {
        ids = new Id[]{
                new Id("Владикавказ", "Братьев Темировых", 26, 28, "Алина", 45.6),
                new Id("Сеул", "Калинина", 52, 18, "Дэнчик", 5252.4),
                new Id("Москва", "Шалдон", 67, 22, "Максимка", 777.7),
                new Id("Самара", "Ленина", 10, 4, "Артем", 7.2)
        };
    }

    public Id(String city, String street, int house, int number, String name, double price){
        setCity(city);
        setStreet(street);
        setHouse(house);
        setNumber(number);
        setName(name);
        setPrice(price);
    }

    public Id(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите город: ");
        this.setCity(sc.nextLine());
        System.out.print("Введите улицу: ");
        this.setStreet(sc.nextLine());
        System.out.print("Введите номер дома: ");
        this.setHouse(sc.nextInt());
        System.out.print("Введите номер квартиры: ");
        this.setNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Введите имя: ");
        this.setName(sc.nextLine());
        System.out.print("Введите цену посылки: ");
        this.setPrice(sc.nextDouble());
    }


    @Override
    public String toString() {
        return String.format("Город - %s, улица - %s, дом - %d, квартира - %d, кому: - %s, цена - %2f",
                city, street, house, number, name, price);
    }

    public String getCity() {return this.city;}
    public String getStreet() {return this.street;}
    public int getHouse() {return this.house;}
    public int getNumber() {return this.number;}
    public String getName() {return this.name;}
    public double getPrice() {return this.price;}



    public void setCity(String city) {
        if (city.isEmpty()) {
            System.out.println("ошибка");
        } else {
            this.city = city;
        }
    }

    public void setStreet(String street) {
        if(street.isEmpty()){
            System.out.println("ошибка");
        }
        else {
            this.street = street;
        }

    }

    public void setHouse(int house) {
        if (house < 0 ){
            System.out.println("ошибка");
        }
        else {
            this.house = house;
        }
    }

    public void setNumber(int number) {
        if (number < 0 ){
            System.out.println("ошибка");
        }
        else {
            this.number = number;
        }
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("ошибка");
        }
        else {
            this.name = name;
        }

    }

    public void setPrice(double price) {
        if (price < 0 ){
            System.out.println("ошибка");
        }
        else {
            this.price = price;
        }
    }


    // выполнение задания

    public static void fillId(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество посылок: ");
        int n = sc.nextInt();
        ids = new Id[n];
        for (int i = 0; i < n; i++){
            System.out.println("\nВвод данных для посылки № " + (i +1)+ ":");
            ids[i] = new Id();
        }
    }
    public static void printId(){
        if (ids == null || ids.length == 0) {
            System.out.println("список посылок пуст");
            return;
        }
        System.out.println("\nСписок всех посылок");
        for (Id p : ids){
            System.out.println(p);
        }


    }




    public static void countSamara(){
        if ( ids == null||ids.length == 0 ) {
            System.out.println("массив не заполнен");
            return;
        }

        int count = 0;
        for (Id i : ids){
            if (i.getCity().equals("Самара")){
                count++;

            }
        }
        System.out.println("количество посылок, в город Самара: " + count);

    }







    public static void sortirovka(){
        if ( ids == null||ids.length == 0 ) {
            System.out.println("массив не заполнен");
            return;
    }
        for (int i = 0; i < ids.length -1; i++){    //кол-во подходов
            for (int j = 0; j < ids.length -1 -i; j++ ) {  //сравнение соседних элементов
                if (ids[j].getCity().compareTo(ids[j+1].getCity()) > 0){
                    Id city = ids[j];
                    ids[j] = ids[j+1];
                    ids[j + 1] = city;

                }
            }
        }
        System.out.println("список посылок отсартированный по городам: ");
        printId();
    }



    public static void psice10(){
        if (ids == null || ids.length == 0){
            System.out.println("массив не заполнен" );
            return;
        }
        boolean posilka = false;
        for(Id i: ids){
            if (i.getPrice() > 10.0 ){
                System.out.println("Город: "+ i.getCity());
                posilka = true;
            }
        }
        if (!posilka){
            System.out.println("нет посылок ценностью выше 10р");
        }

    }

}





