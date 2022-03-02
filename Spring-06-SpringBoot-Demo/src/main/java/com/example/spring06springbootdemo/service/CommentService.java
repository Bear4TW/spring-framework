package com.example.spring06springbootdemo.service;

import com.example.spring06springbootdemo.model.Comment;
import com.example.spring06springbootdemo.proxy.EmailCommentNotificationProxy;
import com.example.spring06springbootdemo.repository.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final EmailCommentNotificationProxy commentNotificationProxy;


    public CommentService(CommentRepository commentRepository, EmailCommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
