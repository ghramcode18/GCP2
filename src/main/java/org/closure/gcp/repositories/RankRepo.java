package org.closure.gcp.repositories;

import org.closure.gcp.entities.RankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RankRepo extends JpaRepository<RankEntity,Integer> {
    
}
