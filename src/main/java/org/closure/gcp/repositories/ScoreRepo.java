package org.closure.gcp.repositories;

import org.closure.gcp.entities.ScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepo extends JpaRepository<ScoreEntity,Integer> {
    
}
