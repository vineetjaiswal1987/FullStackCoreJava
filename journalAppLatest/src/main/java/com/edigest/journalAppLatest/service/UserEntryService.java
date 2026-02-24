package com.edigest.journalAppLatest.service;

import com.edigest.journalAppLatest.Repository.UserEntryRepo;
import com.edigest.journalAppLatest.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserEntryService {
    @Autowired
    private UserEntryRepo userEntryRepo;
    private static final PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();

    public void saveNewUser(User userEntry){
        userEntry.setPassword(passwordEncoder.encode(userEntry.getPassword()));
        userEntry.setRoles(Arrays.asList("USER"));
        userEntryRepo.save(userEntry);
    }

    public void saveUser(User userEntry){
        userEntryRepo.save(userEntry);
    }
    public List<User> getAllEntries(){
        return userEntryRepo.findAll();
    }
    public Optional<User> findById(ObjectId id){
        return userEntryRepo.findById(id);
    }

    public void deleteById(ObjectId Id) {
        userEntryRepo.deleteById(Id);
    }

    public User findByUserName(String userName){
        return userEntryRepo.findByUserName(userName);
    }

    public void saveAdmin(User userEntry) {
        userEntry.setPassword(passwordEncoder.encode(userEntry.getPassword()));
        userEntry.setRoles(Arrays.asList("ADMIN","USER"));
        userEntryRepo.save(userEntry);
    }
}
