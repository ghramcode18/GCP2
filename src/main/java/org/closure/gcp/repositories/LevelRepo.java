package org.closure.gcp.repositories;

import org.closure.gcp.entities.LevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LevelRepo extends JpaRepository<LevelEntity,Integer> {
    
}
