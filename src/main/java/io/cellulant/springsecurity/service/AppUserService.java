package io.cellulant.springsecurity.service;

import io.cellulant.springsecurity.entity.AppUser;
import io.cellulant.springsecurity.entity.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveUsers(AppUser appUser);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    AppUser getUser(String username);

    List<AppUser>getUsers();
}
