package com.mehmet.QuestionApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="like")
@Data
public class Like {

    @Id
    Long id;
    Long postId;
    Long userId;
}
