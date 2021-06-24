// package org.closure.gcp.services;

// import java.util.Optional;

// import org.closure.gcp.entities.ContestEntity;
// import org.closure.gcp.entities.RankEntity;
// import org.closure.gcp.entities.UserEntity;
// import org.closure.gcp.exceptions.RankException;
// // import org.closure.gcp.mappers.ContestMapper;
// import org.closure.gcp.mappers.RankMapper;
// import org.closure.gcp.models.ContestModel;
// // import org.closure.gcp.models.ContestModel;
// import org.closure.gcp.models.RankModel;
// import org.closure.gcp.models.UserModel;
// import org.closure.gcp.repositories.ContestRepo;
// import org.closure.gcp.repositories.RanksRepo;
// import org.closure.gcp.repositories.UserRepo;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class RankServece {

        
    

//     @Autowired
//     RanksRepo rankRrpo;
//     @Autowired
//     ContestRepo contestRepo;
//     @Autowired
//     UserRepo userRepo;
//     // @Autowired
//     // ContestMapper contestMapper;
//      @Autowired
//     // RankMapper rankMapper;

//     public RankModel addRank(RankModel rankModel) throws RankException 
//     {
//         RankEntity rankEntity = 
//                         rankMapper.rankModelToRankEntity(rankModel);
        
//         rankRrpo.save(rankEntity.rank(rankModel.getRank()))
//         .contest(rankEntity.getContest()).id(rankEntity.getId())
//                         .user(rankEntity.getUser());
        
//         return rankMapper.rankEntityToRankModel(rankEntity);
//     }
   

//     public RankModel adduserwithoutRank(RankModel rankModel) throws RankException 
//     {
//         RankEntity rankEntity= rankRrpo.findByRank(rankModel.getRank())
//                 .orElseThrow(() -> new RankException("the  rank is not exist"));

//         rankEntity = 
//         rankMapper.rankModelToRankEntity(rankModel);
//         rankRrpo.save(rankEntity)
//         .contest(rankEntity.getContest()).id(rankEntity.getId())
//                         .user(rankEntity.getUser());

//         return rankMapper.rankEntityToRankModel(rankEntity);

// }

// public RankModel updateRank(RankModel rankModel) throws RankException 
// {
//         ContestEntity contestEntity = contestRepo.findById(rankModel.contestModal(rankModel.getContestModal()).getId())
//                         .orElseThrow(() -> new RankException("no contest with this data"));
//                         RankEntity 

//          rankEntity = rankRrpo.findById(rankModel.user(rankModel.getUser()).getId())
//                          .orElseThrow(() -> new RankException("no user  with this data"));
//          rankEntity = 
//          rankRrpo.save(new RankEntity()
//                          .id(rankEntity.getId())
//                          .contest(rankEntity.getContest())
//                          .rank(rankEntity.getRank())
//                          .user(rankEntity.getUser()));
                         
//          return rankMapper.rankEntityToRankModel(rankEntity);     
                     
// }
       

//     public RankModel readRankOfUser (RankModel rankModel)throws RankException
//     {       
//           ContestEntity contestEntity = contestRepo.findById(rankModel.contestModal(rankModel.getContestModal()).getId())
//                             .orElseThrow(() -> new RankException("no contest with this data"));

//           RankEntity  rankEntity = rankRrpo.findById(rankModel.user(rankModel.getUser()).getId())
//                             .orElseThrow(() -> new RankException("no user  with this data"));

//             return rankMapper.rankEntityToRankModel(rankEntity);

//     }

// public void deleteRank (RankModel rankModel )throws RankException
// {   
//         rankRrpo.findById(rankModel.getId())
//                         .orElseThrow(() -> new RankException("no rank with this data"));
                
//         rankRrpo.delete(rankMapper.rankModelToRankEntity(rankModel));

// }


//     public RankModel  changeUserRank ( RankModel rankModel)throws RankException
//     {
     
//        ContestEntity contestEntity = contestRepo.findById(rankModel.contestModal(rankModel.getContestModal()).getId())
//         .orElseThrow(() -> new RankException("no contest with this data"));

//        RankEntity  rankEntity = rankRrpo.save(new RankEntity().rank(rankModel.getRank()));

//         return rankMapper.rankEntityToRankModel(rankEntity);
// lklmmj
        
//     }

//     public RankModel changeUserContest (RankModel rankModel) throws RankException
//     {//TODO THE first STEP IS NEEDED?
//             ContestEntity contestEntity = contestRepo.findById(rankModel.getId())
//                             .orElseThrow(() -> new RankException("not found contest with data from user"));

//             RankEntity rankEntity = rankRrpo.findById(rankModel.contestModal(rankModel.getContestModal()).getId())
//                            .orElseThrow(() -> new RankException("no contest with this data"));

//             rankEntity = rankRrpo.findById(rankModel.user(rankModel.getUser()).getId())
//                             .orElseThrow(() -> new RankException("no user  with this data"));
                            
//           //  rankRrpo.save(rankEntity.contest(contestMapper.contestModelToContestEntity(rankModel.getContestModal())));
            
//             return rankMapper.rankEntityToRankModel(rankEntity);
//     }
// }