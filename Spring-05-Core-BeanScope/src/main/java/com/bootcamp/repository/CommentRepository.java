package com.bootcamp.repository;

import com.bootcamp.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
