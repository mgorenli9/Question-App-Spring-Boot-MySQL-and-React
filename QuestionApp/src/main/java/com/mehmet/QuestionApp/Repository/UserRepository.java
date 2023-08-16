package com.mehmet.QuestionApp.Repository;

import com.mehmet.QuestionApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // sql sorgularını yazmadan, methodlar ile verilere ulaşmamızı saglar
}
