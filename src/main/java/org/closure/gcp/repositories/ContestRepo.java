package org.closure.gcp.repositories;

import org.closure.gcp.entities.ContestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepo extends JpaRepository<ContestEntity,Integer>{
    
}
