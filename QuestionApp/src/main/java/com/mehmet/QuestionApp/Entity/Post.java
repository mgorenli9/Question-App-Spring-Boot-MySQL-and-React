package com.mehmet.QuestionApp.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="post")
@Data
public class Post {

    @Id
    Long id;
    Long userId;
    String title;
    @Lob
    @Column(columnDefinition = "text")
    String text;


}
