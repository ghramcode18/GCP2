package org.closure.gcp.repositories;

import java.util.Optional;

import org.closure.gcp.entities.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<QuestionEntity,Integer>{
    Optional<QuestionEntity> findByQuestion(String question);
}
