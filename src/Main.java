public class Main {
    public static void main(String[] args) {

        ///Task 1

        int age = 24;
        if(age >= 18){
        System.out.println("Поздравляю с совершеннолетием!");}
        if(age < 18){
        System.out.println("Возраст совершеннолетия ещё не наступил, подождите немного.");}

        ///Task 2

        int age2 = 22;

        if(age2 < 18 && age2 >= 7){
            System.out.println("Ребёнок ещё ходит в школу.");
        }

        if(age2 >= 18 && age2 <= 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }

        if(age2 >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        ///Task 3

        int pasg = 5;

        if(pasg < 60 && pasg > 0){
            System.out.println("В вагоне ещё есть сидячие места.");
        }

        if(pasg >= 60 && pasg < 102){
            System.out.println("В вагоне ещё есть стоячие места.");
        }

        if(pasg == 102) {
            System.out.println("В вагоне (вообще) нет мест.");

        }


        if(pasg < 0 || pasg > 102){
                System.out.println("Столько пассажиров в этом вагоне быть не может.");
        }

        ///Task 4

        int age4 = 14;
        if(age4 >= 18){
            System.out.println("Поздравляю с совершеннолетием!");

        } else {

            System.out.println("Возраст совершеннолетия ещё не наступил, подождите немного.");}


        ///Task 5

        int age5 = 24;

        if(age5 < 18 && age5 >= 7){
            System.out.println("Ребёнок ещё ходит в школу.");
        } else { System.out.println("Человек не школьного возраста."); }

        if(age5 >= 18 && age5 < 24){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else { System.out.println("Человек не университетского возраста."); }

        if(age5 >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу. (Напутствие и напоминание.)");
        } else { System.out.println("Пока ещё рано искать работу"); }


        ///Task 6

        int psgr_t = 60;

        if(psgr_t < 60){
            System.out.println("Есть сидячие и стоячие места.");
        } else { System.out.println("Остались только стоячие места."); }

        ///Task 7

        int age7 = 7;

        if(age7 >=2 && age7 <=6){
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в детский сад.");
        } else {System.out.println("Человеку нужно ходить не в детский сад.");}

        if(age7 >=7 && age7 <=18){
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в школу.");
        } else {System.out.println("Человеку нужно ходить не в школу.");}

        if(age7 >=18 && age7 <=24){
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить в университет.");
        } else {System.out.println("Человеку нужно ходить не в университет.");}

        if(age7 >=24){
            System.out.println("Если возраст человека равен " + age7 + ", то ему нужно ходить на работу.");
        } else {System.out.println("Человеку нужно ходить не на работу.");}


        ///Task 8

        int age8 = 5;

        if(age8 < 5){
            System.out.println("Ребёнку пока рано кататься на карусели.");
        } else {System.out.println("Ребёнок достаточной взрослый чтобы кататься на карусели.");}

        if(age8 >= 14){
            System.out.println("Ребёнку можно кататься без сопровождения.");
        } else {System.out.println("Ребёнку пока ещё рано кататься без сопровождения.");}

        ///Task 9

        int one = 1;
        int two = 8;
        int three = 3;

        if(one >= two && one >= three){
            System.out.println("Число one наибольшее, оно равно:" + one);
        } else {System.out.println("Число one не наибольшее");}

        if(two >= one && two >= three){
            System.out.println("Число two наибольшее, оно равно:" + two);
        } else {System.out.println("Число two не наибольшее");}

        if(three >= two && three >= three){
            System.out.println("Число three наибольшее, оно равно:" + three);
        } else {System.out.println("Число three не наибольшее");}








    }
}