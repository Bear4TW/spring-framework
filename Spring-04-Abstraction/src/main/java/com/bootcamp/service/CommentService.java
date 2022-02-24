package com.bootcamp.service;

import com.bootcamp.model.Comment;
import com.bootcamp.proxy.EmailCommentNotificationProxy;
import com.bootcamp.repository.CommentRepository;
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
