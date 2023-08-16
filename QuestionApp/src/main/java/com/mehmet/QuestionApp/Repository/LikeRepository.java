package com.mehmet.QuestionApp.Repository;

import com.mehmet.QuestionApp.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like,Long> {
}
