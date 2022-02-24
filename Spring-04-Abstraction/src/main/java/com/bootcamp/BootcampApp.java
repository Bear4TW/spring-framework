package com.bootcamp;

import com.bootcamp.config.projectConfig;
import com.bootcamp.model.Comment;
import com.bootcamp.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BootcampApp {

    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(projectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
