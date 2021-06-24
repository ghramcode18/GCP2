package org.closure.gcp.repositories;

import java.util.Optional;

import org.closure.gcp.entities.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeEntity,Integer>{
    
    Optional<CollegeEntity> findByCollegeName(String collegeName);

    
}
