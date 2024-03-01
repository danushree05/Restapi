package com.pmsmapping.pmsmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pmsmapping.pmsmapping.model.UserAccount;
import com.pmsmapping.pmsmapping.service.UserAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestParam;



//ONE-TO-ONE UNIDIRECTION

@RestController
public class UserAccountController {
    @Autowired
    UserAccountService userAccountService;
    @PostMapping("/api/post")
    public UserAccount addUser(@RequestBody UserAccount userAccount)
    {
        return userAccountService.addUsers(userAccount);
    }
    @GetMapping("/api/get")
    public List<UserAccount> getUser() {
        return userAccountService.getUsers();
    }
    @GetMapping("/api/pages/{offset}/{pageNumber}")
    public List<UserAccount> getPage(@PathVariable int offset,@PathVariable int pageNumber)
    {
        return userAccountService.getPages(offset,pageNumber);
    }
    @GetMapping("/api/sort/{field}")
    public List<UserAccount> getSort(@PathVariable String field)
   {
    return userAccountService.getSorts(field);
   }
   @GetMapping("/api/pageandsort/{offset}/{pageNumber}/{field}")
   public List<UserAccount> getPageAndSort(@PathVariable int offset,@PathVariable int pageNumber,@PathVariable String field)
   {
    return userAccountService.getPagesAndSorts(offset,pageNumber,field);
   }
   
   
    
    
    
    
    
}
