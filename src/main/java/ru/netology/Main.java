package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .name("Вера")
                .surname("Лозан")
//                .age(31)
                .address("Апрелевка")
                .build();
        Person son = mom.newChildBuilder()
                .name("Вениамин")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            //не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            //возраст недопустимый
            new PersonBuilder().age(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}