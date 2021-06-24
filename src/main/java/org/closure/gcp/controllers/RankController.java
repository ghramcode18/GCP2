// package org.closure.gcp.controllers;

// import org.closure.gcp.exceptions.RankException;
// import org.closure.gcp.models.RankModel;
// import org.closure.gcp.services.RankServece;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping(path = "/api/v1/ranks")

// public class RankController {
//     @Autowired
//     RankServece rankServece;

//     @RequestMapping(value =  "/addrank",method = RequestMethod.POST)
//     public Object adduser(@RequestBody RankModel rankModel)
//     {
//         try {
//             return rankServece.addRank(rankModel);
//         } catch (RankException e) {
//             return e.getMessage();
//         }
//     }

//     @RequestMapping(value = "/addruserwithoutrank", method = RequestMethod.POST)
//     public Object adduserwithoutrank (@RequestBody RankModel rankModel)
//     {
//     try {
//     return rankServece.adduserwithoutRank(rankModel);
//     } catch (RankException e) {
//         return e.getMessage();
//     }
//     }

//     @RequestMapping(value = "/updaterank", method = RequestMethod.POST)
//     public Object UpdateRank (@RequestBody RankModel rankModel)
//     {
//     try {
//     return rankServece.updateRank(rankModel);
//     } catch (RankException e) {
//     return e.getMessage();
//     }
//    }

//     @RequestMapping(value = "/readrank", method =
//     {RequestMethod.GET,RequestMethod.POST})
//     public Object ReadRank (@RequestBody RankModel rankModel)
//     {
//     try {
//     return rankServece.readRankOfUser(rankModel);

//     } catch (RankException e) {
//     return e.getMessage();
//     }
//     }

//     @RequestMapping(value = "/deleterank",method = RequestMethod.POST)
//     public void deleteRank (@RequestBody RankModel rankModel)
//     {
//     try {
//      rankServece.deleteRank(rankModel);

//     } catch (RankException e) {
//     e.getMessage();
//     }
//     }

//     @RequestMapping(value = "/changerank",method = RequestMethod.POST)
//     public Object changeUserRank(@RequestBody RankModel rankModel)
//     {
//         try {
//             return rankServece.changeUserRank(rankModel);

//         } catch (RankException e) {
//             return e.getMessage();
//         }
//     }
//     @RequestMapping(value = "/changeContest",method = RequestMethod.POST)
//     public Object changeUserContest(@RequestBody RankModel rankModel)
//     {
//     try {
//     return rankServece.changeUserContest(rankModel);

//     } catch (RankException e) {
//     return e.getMessage();
//     }
//     }
// }
