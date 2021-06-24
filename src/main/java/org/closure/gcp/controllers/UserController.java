// package org.closure.gcp.controllers;

// import java.util.List;

// import org.closure.gcp.exceptions.UserException;
// import org.closure.gcp.models.UserCollegeModel;
// import org.closure.gcp.models.UserModel;
// import org.closure.gcp.models.UserQueryModel;
// import org.closure.gcp.repositories.UserRepo;
// import org.closure.gcp.services.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;



// @RestController
// @RequestMapping(path = {"/api/v1/auth","/api/v1/user"})
// public class UserController {
    
//    @Autowired
//    UserService userService;

//     @RequestMapping(value="/register", method=RequestMethod.POST)
//     public Object registerUser(@RequestBody UserModel user) {
//         try{
//             return userService.registerUser(user);
//         }catch(UserException e)
//         {
//             return e.getMessage();
//         }
//     }
    

//     @RequestMapping(value="/signin", method=RequestMethod.POST)
//     public Object signIn(@RequestBody UserModel user) {
//         try{
//             return userService.signIn(user);
//         }catch(UserException e)
//         {
//             return e.getMessage();
//         }
//     }

//     @RequestMapping(value="/college/join", method=RequestMethod.POST)
//     public Object joinCollege(@RequestBody UserCollegeModel ucmodel) {
//         try {
//             return userService.joinCollage(ucmodel.getUid(), ucmodel.getIn_cid());
//         } catch (Exception e) {
//             return e.getMessage();
//         }
//     }
    
//     @RequestMapping(value="/college/leave", method=RequestMethod.POST)
//     public Object leaveCollege(@RequestBody UserCollegeModel ucmodel) {
//         try {
//             return userService.leaveCollage(ucmodel.getUid(), ucmodel.getOut_cid());
//         } catch (Exception e) {
//             return e.getMessage();
//         }
//     }
    
//     @RequestMapping(value="/college/change", method=RequestMethod.POST)
//     public Object changeCollege(@RequestBody UserCollegeModel ucmodel) {
//         try {
//             return userService.changeCollege(ucmodel.getUid(), ucmodel.getOut_cid(), ucmodel.getIn_cid());
//         } catch (Exception e) {
//             return e.getMessage();
//         }
//     }

//     @RequestMapping(value="/with/colleges", method=RequestMethod.GET)
//     public List<UserQueryModel> userscollege() {
//         return userService.queryUsersCollege();
//     }
    
//     @RequestMapping(value="/paging/{num}/{size}", method=RequestMethod.GET)
//     public List<UserModel> pagingUser(@PathVariable(name = "num") int pageNo,@PathVariable(name = "size") int pageSize) {
//         return userService.fetchAllUsers(pageNo, pageSize);
//     }
    
    


// }
