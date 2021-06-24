// package org.closure.gcp.services;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
// import java.util.Optional;

// import org.closure.gcp.entities.CollegeEntity;
// import org.closure.gcp.entities.UserEntity;
// import org.closure.gcp.exceptions.CollegeException;
// import org.closure.gcp.exceptions.UserException;
// import org.closure.gcp.models.Gender;
// import org.closure.gcp.models.UserModel;
// import org.closure.gcp.models.UserQueryModel;
// import org.closure.gcp.repositories.CollegeRepo;
// import org.closure.gcp.repositories.UserRepo;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.PageRequest;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort;
// import org.springframework.stereotype.Service;

// @Service
// public class UserService {
    
//     @Autowired
//     UserRepo userRepo;

//     @Autowired
//     CollegeRepo collegeRepo;

//     public UserModel registerUser(UserModel user) throws UserException 
//     {
//         if(user.getEmail() != null && user.getPassword() != null && user.getUsername() != null)
//         {
//             if(userRepo.findByEmail(user.getEmail()).isEmpty())
//             {
//                 UserEntity entity = userRepo.save(UserModelToUserEntity(user));
//                 //TODO mapper from entity to model
//                 return user.id(entity.getId());
//             }else{
//                 throw new UserException("this email is already exist");
//             }
//         }else{
//             throw new UserException("required fields are null");
//         }


//     }

//     public UserModel signIn(UserModel user) throws UserException
//     {
//         Optional<UserEntity> entity;
//         if((entity = userRepo.findByEmail(user.getEmail())).isEmpty())
//         {
//             throw new UserException("no user with this email");
//         }else{
//             if(entity.get().getPassword().equals(user.getPassword()))
//             {
//                 return userEntityToUserModel(entity.get());
//             }else{
//                 throw new UserException("wrong password");
//             }

//         }
//     }

//     public UserModel updateUser(UserModel user){
//         if(user.getId() == null)
//             throw new UserException("can't update user without id");
//         UserEntity entity = userRepo.findById(user.getId()).orElseThrow(()-> new UserException("no user with this id"));
//         entity.address(user.getAddress()).birthday(user.getBirthday()).email(user.getEmail()).gender(Gender.valueOf(user.getGender()));
//         userRepo.save(entity);
//         return userEntityToUserModel(entity);
//     }

   
//     public UserModel joinCollage(Integer uid, Integer cid){
//         UserEntity uentity = userRepo.findById(uid).orElseThrow(()-> new UserException("no user with this id"));
//         CollegeEntity centity = collegeRepo.findById(cid).orElseThrow(()-> new CollegeException("no collage with this id"));
//         if (uentity.getCollege() != null) 
//             throw new UserException("this user already in a college");
//         uentity.college(centity);
//         userRepo.save(uentity);
//         return userEntityToUserModel(uentity);
//     }
//     public UserModel leaveCollage(Integer uid, Integer cid){
//         UserEntity uentity = userRepo.findById(uid).orElseThrow(()-> new UserException("no user with this id"));
//         CollegeEntity centity = collegeRepo.findById(cid).orElseThrow(()-> new CollegeException("no collage with this id"));
//         if (uentity.getCollege() == null) 
//             throw new UserException("this user don't have any college");
//         if(!uentity.getCollege().getId().equals(centity.getId()))
//             throw new UserException("wrong college request");
//         uentity.college(null);
//         userRepo.save(uentity);
//         return userEntityToUserModel(uentity);
//     }

//     public UserModel changeCollege(Integer uid,Integer out_cid,Integer in_cid)
//     {
//         List<Integer> cids = new ArrayList<Integer>();
//         cids.add(out_cid);
//         cids.add(in_cid);
//         UserEntity uentity = userRepo.findById(uid).orElseThrow(()-> new UserException("no user with this id"));
//         List<CollegeEntity> centity = collegeRepo.findAllById(cids);
//         if(centity.size() != 2)
//             throw new CollegeException("one or more colleges are not found");
//         leaveCollage(uid, out_cid);
//         return joinCollage(uid, in_cid);
//     }
    
//     public List<UserQueryModel> queryUsersCollege()
//     {
//         List<List<String>> list = userRepo.usersWithCollege();
//         return list.stream().map((mapper)->{return new UserQueryModel(mapper.get(0),mapper.get(1));}).toList();
//     }

//     public UserEntity UserModelToUserEntity(UserModel user)
//     {
//         UserEntity entity = new UserEntity()
//             .name(user.getUsername())
//             .email(user.getEmail())
//             .password(user.getPassword())
//             .address(user.getAddress())
//             .birthday(user.getBirthday())
//             .gender(Gender.valueOf(user.getGender() != null ? user.getGender() : "male"));
//             if(user.getCollege() != null)

//                 return entity.college(
//                     collegeRepo.findByCollegeName(
//                         user.getCollege()
//                         ).orElseThrow(()-> new UserException("no collegee with this name")));
//             else return entity;        
                
//     }

//     public UserModel userEntityToUserModel(UserEntity user)
//     {
//         UserModel model = new UserModel()
//             .id(user.getId())
//             .username(user.getName())
//             .email(user.getEmail())
//             .address(user.getAddress())
//             .birthday(user.getBirthday())
//             .gender(user.getGender().toString())
//             .password(user.getPassword());
//             if(user.getCollege() != null)
//                 return model.college(user.getCollege().getCollegeName());
//             else return model;
//     }

//     public List<UserModel> fetchAllUsers(int pageNo, int pageSize)
//     {
//         // Pageable paging = PageRequest.of(pageNo, pageSize,Sort.by("username"));
//         // Page<UserEntity> pagedResult = userRepo.findAll(paging);
        
//         // old way
//         // List<UserEntity> users = pagedResult.toList();
        
//         // List<UserModel> results = new ArrayList<UserModel>();
//         // for(UserEntity user : users)
//         // {
//         //     results.add(userEntityToUserModel(user));
//         // }
//         // return results;
//             return userRepo.findAll(
//                 PageRequest.of(pageNo, pageSize,Sort.by("name"))
//                 ).toList().stream().map(
//                     (e)-> {
//                         return userEntityToUserModel(e);
//                 }).toList();

//     }

// }


