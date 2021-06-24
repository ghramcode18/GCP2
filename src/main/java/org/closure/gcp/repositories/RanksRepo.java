package org.closure.gcp.repositories;


import java.util.Optional;

import org.closure.gcp.entities.ContestEntity;
import org.closure.gcp.entities.RankEntity;
import org.closure.gcp.entities.UserEntity;
import org.closure.gcp.models.ContestModel;
import org.closure.gcp.models.RankModel;
import org.closure.gcp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RanksRepo extends JpaRepository<RankEntity, Integer> {
  Optional<RankEntity> findById(Integer id);
   Optional<RankEntity> findByUserAndContest(UserModel userModel , ContestModel contestModal);
   Optional<RankEntity> findByUserName(UserModel userModel );
   void deleteById(Integer id);
   Optional<RankEntity> findByRank(Integer rank );

}
