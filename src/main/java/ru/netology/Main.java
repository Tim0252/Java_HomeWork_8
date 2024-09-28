package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday = new FormData();
        post.birthday.day = 3;
        post.birthday.month = 9;
        post.birthday.year = 1997;
    }
}
