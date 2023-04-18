package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fm),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComments(c1);
        p1.addComments(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19", fm),
                "Good night guys",
                "See you tomorrow",
                5);
        p1.addComments(c3);
        p1.addComments(c4);


        System.out.println(p1);
        System.out.println(p2);





    }
}