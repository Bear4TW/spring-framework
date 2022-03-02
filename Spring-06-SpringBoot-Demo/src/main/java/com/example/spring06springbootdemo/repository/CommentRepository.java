package com.example.spring06springbootdemo.repository;

import com.example.spring06springbootdemo.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
