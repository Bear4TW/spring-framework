package com.example.spring13ormcinemalab.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "genreList")
    private List<Movie> movieList;
}
