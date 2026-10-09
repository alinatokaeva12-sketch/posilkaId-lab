package posilkaId;

import java.util.Scanner;

public class Id {
    private String city;
    private String street;
    private int house;
    private int number;
    private String name;
    private double price;



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



}





