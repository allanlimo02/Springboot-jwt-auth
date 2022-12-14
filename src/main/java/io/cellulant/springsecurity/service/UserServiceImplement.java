package io.cellulant.springsecurity.service;

import io.cellulant.springsecurity.entity.AppUser;
import io.cellulant.springsecurity.entity.Role;
import io.cellulant.springsecurity.repository.RoleRepo;
import io.cellulant.springsecurity.repository.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplement implements AppUserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    @Override
    public AppUser saveUsers(AppUser appUser) {
        return userRepo.save(appUser);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser appUser=userRepo.getAppUserByName(username);
        Role role=roleRepo.findByName(roleName);
        appUser.getRoles().add(role);

    }

    @Override
    public AppUser getUser(String username) {
        return userRepo.getAppUserByName(username);
    }

    @Override
    public List<AppUser> getUsers() {
        return userRepo.findAll();
    }
}
