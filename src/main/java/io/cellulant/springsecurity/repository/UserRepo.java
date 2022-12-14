package io.cellulant.springsecurity.repository;

import io.cellulant.springsecurity.entity.AppUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser,Long> {
    AppUser getAppUserByName(String name);
}
