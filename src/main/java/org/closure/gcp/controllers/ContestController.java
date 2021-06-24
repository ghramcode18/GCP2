// package org.closure.gcp.controllers;

// import org.closure.gcp.exceptions.ContestExcepion;
// import org.closure.gcp.models.ContestModel;
// import org.closure.gcp.repositories.ContestRepo;
// import org.closure.gcp.services.ContestSetvice;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping(path = "/api/v1/contest")
// public class ContestController {
//     @Autowired
//     ContestSetvice contestSetvice;
//     @RequestMapping(value =  "/addcontest",method = RequestMethod.POST)
//     public Object addContest(@RequestBody ContestModel contestModel)
//     {
//     try {
//     return contestSetvice.createContest(contestModel);
//     } catch (ContestExcepion e) {
//        return e.getMessage();
//     }
// }
   
     
//       @RequestMapping(value = "/readContest", method =
//        {RequestMethod.GET,RequestMethod.POST})
//        public Object ReadContest (@RequestBody  ContestModel contestModel)
//        {
//        try {
//             return contestSetvice.readContest(contestModel);
//        }catch(ContestExcepion e)
//        {return e.getMessage();}
//     }
//     @RequestMapping(value = "/updateContest", method =
//     {RequestMethod.GET,RequestMethod.POST})
//     public Object updateContest (@RequestBody  ContestModel contestModel)
//     {
//     try {
//          return contestSetvice.updateContest(contestModel);
//     }catch(ContestExcepion e)
//     {return e.getMessage();}
//  }

   
//        @RequestMapping(value = "/deleteContest",method = RequestMethod.POST)
//        public void deleteContest (@RequestBody ContestModel contestModel)
//        {
//            try {
//                contestSetvice.delete(contestModel);

//            } catch (ContestExcepion e) {
//                 e.getMessage();
//            }
//        }
    
// }
