// package org.closure.gcp.services;

// import org.closure.gcp.entities.ContestEntity;
// import org.closure.gcp.entities.UserEntity;
// import org.closure.gcp.exceptions.ContestExcepion;
// import org.closure.gcp.exceptions.UserException;
// import org.closure.gcp.mappers.ContestMapper;
// import org.closure.gcp.mappers.UserMapper;
// import org.closure.gcp.models.ContestModel;
// import org.closure.gcp.models.UserModel;
// import org.closure.gcp.repositories.ContestRepo;
// import org.closure.gcp.repositories.UserRepo;
// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.factory.Mappers;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;



// @Service
// public class ContestSetvice {
//     @Autowired
//     ContestRepo contestRepo;
//     @Autowired
//     ContestMapper contestMapper;
//     @Autowired
//     UserMapper userMapper;
//     @Autowired
//     UserRepo userRepo;

//     public ContestModel createContest(ContestModel contestModel) 
//      {
//         ContestEntity contestEntity = contestRepo
//                 .save(new ContestEntity(contestModel.getId(), contestModel.getNameOfContest(),
//                         contestModel.getStart_date(), contestModel.getEnd_date(), contestModel.getParticipents(),
//                         contestModel.getLevels(), contestModel.getQuestions(), contestModel.getRank()));
//         return contestMapper.contestEntityToContestModel(contestEntity);
//     }

//     public ContestModel readContest(ContestModel contestModel) {
//         ContestEntity contestEntity = contestRepo.findById(contestModel.getId())
//                 .orElseThrow(() -> new ContestExcepion("no Contest with this data"));

//                 return contestMapper.contestEntityToContestModel(contestEntity);

//     }
//     public ContestModel updateContest (ContestModel contestModel)
//     {
//         ContestEntity contestEntity = contestRepo.findById(contestModel.getId())
//         .orElseThrow(() -> new ContestExcepion("not found contest with data from user"));
//         //TODO what the condtion with this method?
//         contestEntity = contestRepo
//         .save(new ContestEntity(contestModel.getId(), contestModel.getNameOfContest(),
//         contestModel.getStart_date(), contestModel.getEnd_date(), contestModel.getParticipents(),
//                         contestModel.getLevels(), contestModel.getQuestions(), contestModel.getRank()));
        
//         return contestMapper.contestEntityToContestModel(contestEntity);
//     }

//     public void delete(ContestModel contestModel) {
//         ContestEntity contestEntity = contestRepo.findById(contestModel.getId())
//                 .orElseThrow(() -> new ContestExcepion("no Contest with this data"));
//         contestRepo.delete(contestEntity);
//     }

//     // public List<UserModel>addusers(List<UserModel> userModels)
//     // {
//     //     ContestEntity contestEntity;
//     //     List<UserModel> uModels;
//     //     for (UserModel userModel : userModels) {

//     //        UserEntity userEntity = userRepo.findById(userModel.getId()).orElseThrow(() -> new UserException("no user with this id "));
//     //         uModels.add(userModel);
//     //       //  contestEntity.participents(userRepo);
//     //       userRepo.save(new UserEntity().address(userModel.getAddress()));
            
            
//     //     }
//     // }
 
// }