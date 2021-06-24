package org.closure.gcp.repositories;

import org.closure.gcp.entities.FireBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FireBaseRepo extends JpaRepository<FireBaseEntity,Integer>{
    
}
