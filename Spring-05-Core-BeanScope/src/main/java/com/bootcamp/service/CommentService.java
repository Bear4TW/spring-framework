package com.bootcamp.service;

import com.bootcamp.model.Comment;
import com.bootcamp.proxy.EmailCommentNotificationProxy;
import com.bootcamp.repository.CommentRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class CommentService {

    private final CommentRepository commentRepository;
    private final EmailCommentNotificationProxy commentNotificationProxy;


    public CommentService(CommentRepository commentRepository, EmailCommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Hello!");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
