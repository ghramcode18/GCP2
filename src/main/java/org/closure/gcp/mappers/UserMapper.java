
 package org.closure.gcp.mappers;

import java.util.List;

import org.closure.gcp.entities.ContestEntity;
import org.closure.gcp.entities.RankEntity;
import org.closure.gcp.entities.UserEntity;
import org.closure.gcp.models.ContestModel;
import org.closure.gcp.models.RankModel;
import org.closure.gcp.models.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper 
{//CAN I PUT ALL OF MAPPERIN ONE CLASSE?
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping (source = "",target = "")
    UserEntity UserModelToUserEntity(UserModel UserModel);
    UserModel UserEntityToUserModel(UserEntity UserEntity);
    List<UserEntity> UserModelToUserEntityAslist(List<UserModel> UserModel);
    List<UserModel> UserEntityToUserModelAsList(List<UserEntity> userEntities);

}
 
// //source the name in Entity and target the name in Model.