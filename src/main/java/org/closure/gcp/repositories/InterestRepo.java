package org.closure.gcp.repositories;

import org.closure.gcp.entities.InterestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterestRepo extends JpaRepository<InterestEntity,Integer>{
    
}
