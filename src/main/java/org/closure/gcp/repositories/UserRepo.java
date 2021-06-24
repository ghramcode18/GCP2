package org.closure.gcp.repositories;

import java.util.List;
import java.util.Optional;

import org.closure.gcp.entities.CollegeEntity;
import org.closure.gcp.entities.UserEntity;
import org.closure.gcp.models.UserQueryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends PagingAndSortingRepository<UserEntity,Integer>{
   
    
    Optional<UserEntity> findByEmail(String email);

    List<UserEntity> findByCollege(CollegeEntity college);

    @Query(value = "select u.name as name,c.college_name as college_name from users u inner join college c ON u.college_id = c.id GROUP BY name", nativeQuery = true)
    List<List<String>> usersWithCollege();
    
    @Query(value = "select * from users u where u.id = ?1",nativeQuery = true)
    Optional<UserEntity> getNameEmail(Integer id);

}
