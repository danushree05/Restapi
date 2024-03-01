package com.pmsmapping.pmsmapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pmsmapping.pmsmapping.model.UserAccount;
import com.pmsmapping.pmsmapping.repository.UserAccountRepo;

@Service
public class UserAccountService {
    @Autowired
    UserAccountRepo userAccountRepo;
    @SuppressWarnings("null")
    public UserAccount addUsers(UserAccount userAccount)
    {
        return userAccountRepo.save(userAccount);
    }
    public List<UserAccount> getUsers()
    {
        return userAccountRepo.findAll();
    }
    public List<UserAccount> getPages(int offset,int pageNumber)
    {
        Pageable page=PageRequest.of(offset,pageNumber);
        return userAccountRepo.findAll(page).getContent();
    }
    public List<UserAccount> getSorts(String field)
    {
        Sort sort=Sort.by(Sort.Direction.ASC,field);
        return userAccountRepo.findAll(sort);
    }
    public List<UserAccount> getPagesAndSorts(int offset,int pageNumber,String field)
    {
        return userAccountRepo.findAll(PageRequest.of(offset,pageNumber).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
    }
}
