package com.example.spring06springbootdemo.proxy;

import com.example.spring06springbootdemo.model.Comment;

public interface CommentNotificationProxyInterface {

    void sendComment(Comment comment);
}
