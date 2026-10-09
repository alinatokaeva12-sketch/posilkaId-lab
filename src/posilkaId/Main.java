import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        jhgjhg: while (true){
            System.out.println("\n------------МЕНЮ--------------------------");
            System.out.println("1. заполнить массив с клавиатуры");
            System.out.println("2. распечатать список посылок ");
            System.out.println("3. сколько посылок отправлено в самару");
            System.out.println("4. посылки ценностью выше 10р.");
            System.out.println("5. сoртировка посылок по городам");
            System.out.println("6. выход");
            System.out.println("7. выберите пункт меню");

            if (!sc.hasNextInt()){
                System.out.println("ОШИБКА");
                sc.next();
                continue ;
            }

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    Id.fillId();
                    break;
                case 2:
                    Id.printId();
                    break;
                case 3:
                    Id.countSamara();
                    break;
                case 4:
                    Id.psice10();
                    break;
                case 5:
                    Id.sortirovka();
                    break;
                case 6:
                    System.out.println("программа завершена");
                    System.out.println("-------------------------------------------");
                    break jhgjhg;
                case 7:
                    System.out.println("неверный пункт меню");
                    break;
            }
        }
        sc.close();
    }
}